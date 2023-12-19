package com.nopcommerce.demo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends com.nopcommerce.demo.utility.Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public String verifyWelcomeText() {
        log.info("Veriying Welcome Text:" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String email) {
        log.info("Enter Email:" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter Password:" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button:" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String verifyErrorMessage() {
        log.info("Veriying Error Message Topmenu:" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String verifyLogoutLinkIsDisplayed() {
        log.info("Verify Logout Link DIsplayed:" + logout.toString());
        return getTextFromElement(logout);
    }

    public void clickOnLogoutLink() {
        log.info("Clicking on Logout Room:" + logout.toString());
        clickOnElement(logout);
    }
}

