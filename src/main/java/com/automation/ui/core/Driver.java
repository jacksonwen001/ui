package com.automation.ui.core;

import org.apache.logging.log4j.util.Strings;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.remote.Browser.*;
import static org.openqa.selenium.remote.Browser.SAFARI;

public class Driver {
    private static final String ENABLE_VNC = "enableVNC";
    private static final String ENABLE_VIDEO = "enableVideo";
    private final static String SELENOID_OPTION = "selenoid:options";
    private final static String START_MAXIMIZED = "start-maximized";
    private final static String BROWSER_VERSION = "browserVersion";

    private String url;
    private RemoteWebDriver webDriver;
    private Duration waitingTime = Duration.ofSeconds(25);

    private Map<String, Object> options = new HashMap<>(){{
        options.put(ENABLE_VNC, true);
        options.put(ENABLE_VIDEO, true);
    }};

    public Map<String, Browser> browsers = new HashMap<>(){{
        put(CHROME.browserName(), version -> startChrome(version));
        put(FIREFOX.browserName(), version -> startFirefox(version));
        put(EDGE.browserName(), version -> startEdge(version));
        put(SAFARI.browserName(), version -> startSafari(version));
    }};

    public Driver(String url) {
        this.url = url;
    }

    private void startChrome(String version) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(START_MAXIMIZED);
        chromeOptions.setCapability(BROWSER_VERSION, version);
        chromeOptions.setCapability(SELENOID_OPTION, options);
        try {
            webDriver = new RemoteWebDriver(new URL(url), chromeOptions);
            webDriver.manage().timeouts().implicitlyWait(waitingTime);
        } catch (Exception e) {
            throw new RuntimeException("Start driver failed! " + e.getMessage());
        }
    }
    private void startFirefox(String version) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability(BROWSER_VERSION, version);
        firefoxOptions.setCapability(SELENOID_OPTION, options);
        firefoxOptions.addArguments("--start-maximized");

        try {
            webDriver = new RemoteWebDriver(new URL(url), firefoxOptions);
            webDriver.manage().timeouts().implicitlyWait(waitingTime);
        } catch (Exception e) {
            throw new RuntimeException("Start driver failed! " + e.getMessage());
        }
    }
    private void startEdge(String version) {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments(START_MAXIMIZED);
        edgeOptions.setCapability(BROWSER_VERSION, version);
        edgeOptions.setCapability(SELENOID_OPTION, options);
        try {
            webDriver = new RemoteWebDriver(new URL(url), edgeOptions);
            webDriver.manage().timeouts().implicitlyWait(waitingTime);
        } catch (Exception e) {
            throw new RuntimeException("Start driver failed! " + e.getMessage());
        }
    }
    private void startSafari(String version) {
        SafariOptions safariOptions = new SafariOptions();
        safariOptions.setCapability(BROWSER_VERSION, version);
        safariOptions.setCapability(SELENOID_OPTION, options);
        safariOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        try {
            webDriver = new RemoteWebDriver(new URL(url), safariOptions);
            webDriver.manage().timeouts().implicitlyWait(waitingTime);
        } catch (Exception e) {
            throw new RuntimeException("Start driver failed! " + e.getMessage());
        }
    }

    public void start(String name, String version) {
        if (Strings.isBlank(name))
            throw new RuntimeException("name must not null");
        if (Strings.isBlank(version))
            throw new RuntimeException("version must not null");
        Browser browser = browsers.get(name);
        if (browser == null) throw new RuntimeException("browser must not null. ");
        browser.start(version);
    }
}
