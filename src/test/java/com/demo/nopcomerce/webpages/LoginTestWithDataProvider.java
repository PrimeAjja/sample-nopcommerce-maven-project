package com.demo.nopcomerce.webpages;

import com.demo.nopcomerce.pageobject.HomePage;
import com.demo.nopcomerce.pageobject.LogInPage;
import com.demo.nopcomerce.resources.testdata.TestData;
import com.demo.nopcomerce.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani on 08/05/2019.
 */
public class LoginTestWithDataProvider extends TestBase {

    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();

    @Test(dataProvider="inputs", dataProviderClass= TestData.class)
    public void loginTest(String email, String password){
        homePage.clickOnLogInLink();
        logInPage.loginToApplication(email, password);
    }

}
