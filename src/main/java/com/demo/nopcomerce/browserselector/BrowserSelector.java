package com.demo.nopcomerce.browserselector;

import com.demo.nopcomerce.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Jay Vaghani on 04/05/2019.
 */
public class BrowserSelector extends BasePage {
    public static final String USERNAME = "";
    public static final String ACCESS_KEY = "";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public void selectBrowser(String browser) {
//        if(runWith.equalsIgnoreCase("saucelab")){
//            DesiredCapabilities caps = DesiredCapabilities.chrome();
//            caps.setCapability("platform", "Windows XP");
//            caps.setCapability("version", "43.0");
//
//            try {
//                WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\com\\demo\\nopcomerce\\resources\\driver\\chromedriver.exe");
            /*ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            options.addArguments("disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--disable-blink-features-BlockCredentials");
            options.addArguments("--incognito");*/
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\java\\com\\demo\\nopcomerce\\resources\\driver\\geckodriver.exe");
//            System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "\\src\\test\\java\\com\\demo\\nopcomerce\\resources\\driver\\geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\java\\com\\demo\\nopcomerce\\resources\\driver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong Browser Selected");
        }
    }

}
