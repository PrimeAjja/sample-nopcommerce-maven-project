package com.demo.nopcomerce.webpages;

import com.demo.nopcomerce.pageobject.HomePage;
import com.demo.nopcomerce.pageobject.LogInPage;
import com.demo.nopcomerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani on 04/05/2019.
 */
public class LogInTest extends TestBase {
    HomePage homePage =new HomePage();
    LogInPage logInPage =new LogInPage();


    @Test
    public  void userShouldNavigateToLogInPageSuccessfully(){
        homePage.clickOnLogInLink();
        String actualText= logInPage.getWelcomeText();
        String expectedText ="Welcome, Please Sign In!";
        Assert.assertEquals(actualText,expectedText);
    }


    @Test
    public void userShouldLogInSuccessfully(){
        homePage.clickOnLogInLink();
        logInPage.enterEmailAddress("xyz@gmail.com");
        logInPage.enterPassword("xyz");
        logInPage.clickOnLoginButton();
    }
}
