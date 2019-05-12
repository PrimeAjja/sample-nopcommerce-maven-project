package com.demo.nopcomerce.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Jay Vaghani on 11/05/2019.
 */
public class SauceLabsDemo {
    //https://wiki.saucelabs.com/display/DOCS/Example+Selenium+Scripts+for+Automated+Website+Tests
    //https://wiki.saucelabs.com/display/DOCS/Java+Test+Setup+Example

    public static final String USERNAME = "PrimeTesting";
    public static final String ACCESS_KEY = "b89c7d62-a137-48ea-8cec-1a0cc845a7b9";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows XP");
        caps.setCapability("version", "43.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get("https://letskodeit.teachable.com/p/practice");
        System.out.println("title of page is: " + driver.getTitle());

        Thread.sleep(3000);

        driver.quit();
    }
}
