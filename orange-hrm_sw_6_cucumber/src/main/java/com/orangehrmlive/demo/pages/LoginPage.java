package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginText;

    @CacheLookup
    @FindBy(name = "username")
    WebElement username;

    @CacheLookup
    @FindBy(name = "password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])[1]")
    WebElement textInvalidCredentials;


    public void enterUsername(String userId) {
        sendTextToElement(username, userId);
        log.info("Enter username : " + userId + " in user name field " + username.toString());
    }

    public void enterPassword(String passWord) {
        sendTextToElement(password, passWord);
        log.info("Enter Password : " + passWord + " in password field " + password.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());
    }

    public String verifyTextLogin() {
        String login = getTextFromElement(loginText);
        log.info("Get login text from : " + loginText.toString());
        return login;
    }

    public void loginSuccessfully(String userName, String passWord) {
        sendTextToElement(username, userName);
        log.info("Enter username : " + userName + " in user name field " + username.toString());
        sendTextToElement(password, passWord);
        log.info("Enter Password : " + passWord + " in password field " + password.toString());
        clickOnElement(loginButton);
        log.info("clicking on login button : " + loginButton.toString());
    }

    public String verifyTextInvalidCredentials() {
        String credentials = getTextFromElement(textInvalidCredentials);
        log.info("Get error message : " + textInvalidCredentials.toString());
        return credentials;
    }
}

