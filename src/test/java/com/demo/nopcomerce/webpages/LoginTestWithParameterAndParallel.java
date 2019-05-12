package com.demo.nopcomerce.webpages;

import com.demo.nopcomerce.basepage.BasePage;
import com.demo.nopcomerce.browserselector.BrowserSelector;
import com.demo.nopcomerce.pageobject.HomePage;
import com.demo.nopcomerce.pageobject.LogInPage;
import com.demo.nopcomerce.properties.LoadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay Vaghani on 08/05/2019.
 */
public class LoginTestWithParameterAndParallel extends BasePage {

    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties loadProperties = new LoadProperties();

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser){
        browserSelector.selectBrowser(browser);
        driver.get(loadProperties.getProperty("baseUrl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void loginTest(){
        homePage.clickOnLogInLink();
        logInPage.loginToApplication("test1@gmail.com", "test1234");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
