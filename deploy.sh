versions=`docker images | grep "^ui-automation-testing"| awk '{print $2}'`
containsId=`docker ps -a | grep "ui-automation-testing" | awk '{print $1}'`

for id in $containsId
do
docker stop $id
docker rm $id
done

for version in $versions
do
docker rmi ui-automation-testing:$version
done

./gradlew bootjar && docker build -t ui-automation-testing .
docker run -d --name selenoid -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v ${PWD}/selenoid/config:/etc/selenoid/:ro -v /data/selenoid/video:/opt/selenoid/video -v /data/selenoid/logs:/opt/selenoid/logs -e OVERRIDE_VIDEO_OUTPUT_DIR=/data/selenoid/video aerokube/selenoid:latest-release -limit 50 -video-output-dir /opt/selenoid/video -timeout 2m