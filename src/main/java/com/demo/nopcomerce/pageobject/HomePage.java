package com.demo.nopcomerce.pageobject;

import com.demo.nopcomerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani on 04/05/2019.
 */
public class HomePage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By loginLink = By.linkText("Log in");
    @FindBy(linkText = "Log in")
    WebElement _logInLink;


    By registerLink = By.linkText("Register");
    @FindBy(linkText = "Register")
    WebElement _registerLink;

    public void clickOnLogInLink(){
        log.info("Click on Login Link");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        log.info("Click on Registration Link");
        clickOnElement(registerLink);
    }


}
