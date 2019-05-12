package com.demo.nopcomerce.testbase;

import com.demo.nopcomerce.basepage.BasePage;
import com.demo.nopcomerce.browserselector.BrowserSelector;
import com.demo.nopcomerce.properties.LoadProperties;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay Vaghani on 04/05/2019.
 */
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties loadProperties = new LoadProperties();

    String browser = loadProperties.getProperty("browser");
    String baseUrl = loadProperties.getProperty("baseUrl");

    @BeforeClass
    public static void setUpBeforeClass(){
        PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\com\\demo\\nopcomerce\\resources\\configfile\\log4j.properties");
        //PropertyConfigurator.configure(System.getProperty(user.dir)+"\\src\\test\\java\\com\\demo\\nopcomerce\\resources\\configfile\\log4j.properties");
    }

    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
