package co.com.globant.opencart.test.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

import static co.com.globant.opencart.test.utils.Constans.DEFAULT_BROWSER;


public class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver goToWeb() {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver getDriver() {
        return ("Chrome".equals(DEFAULT_BROWSER)) ? getChromeDriver() : getEdgeDriver();
    }

    private static WebDriver getChromeDriver() {

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments(
                "--remote-allow-origins=*",
                "--incognito",
                "--disable-infobars",
                "enable-automation",
                "--disable-browser-side-navigation",
                "--lang=es",
                "--disable-download-notification",
                "--start-maximized",
                "--test-type",
                "--ignore-certificate-errors",
                "--allow-running-insecure-content",
                "--disable-translate",
                "--always-authorize-plugins", "--disable-extensions",
                "--profile.default_content_setting_values.geolocation");

        chromeOptions.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

        return WebDriverManager.chromedriver().capabilities(chromeOptions).create();
    }

    private static WebDriver getEdgeDriver() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability("inprivate", true);

        return WebDriverManager.edgedriver().capabilities(edgeOptions).create();
    }
}