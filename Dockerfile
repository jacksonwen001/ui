# 使用基础镜像 openjdk:8-jdk-alpine
FROM openjdk:17-jdk-alpine
# 将应用程序的 JAR 文件添加到镜像中
ADD build/libs/myapp.jar myapp.jar
# 暴露应用程序的端口
EXPOSE 8080
# 启动应用程序
ENTRYPOINT ["java", "-jar", "myapp.jar"]