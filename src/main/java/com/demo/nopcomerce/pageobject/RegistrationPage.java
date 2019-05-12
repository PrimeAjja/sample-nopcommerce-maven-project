package com.demo.nopcomerce.pageobject;

import com.demo.nopcomerce.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani on 10/05/2019.
 */
public class RegistrationPage extends Util {

    By genderLink = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By DOB = By.name("DateOfBirthDay");
    By month = By.name("DateOfBirthMonth");
    By year = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By Company = By.id("Company");
    By newsletter = By.id("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By RegButton = By.id("register-button");
    By Rtext = By.xpath("//strong[contains(text(),'Your Personal Details')]");

}
