package com.demo.nopcomerce.pageobject;

import com.demo.nopcomerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani on 04/05/2019.
 */
public class LogInPage extends Util {

    private Logger log = LogManager.getLogger(LogInPage.class.getName());

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By emailField = By.id("Email");

    By passwordField = By.name("Password");

    By loginBtn = By.xpath("//input[@value='Log in']");

    public void enterEmailAddress(String email) {
        log.info("Enter email address to email field");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password to password field");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Click on login button");
        clickOnElement(loginBtn);
    }

    public String getWelcomeText() {
        log.info("Get Welcome Text");
        return getTextFromElement(welcomeText);
    }

    public void loginToApplication(String email, String password) {
        enterEmailAddress(email);
        enterPassword(password);
        clickOnLoginButton();
    }

}
