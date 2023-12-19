package com.nopcommerce.demo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends com.nopcommerce.demo.utility.Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;
    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthDay;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;



    public String verifyRegisterText() {
        log.info("Veriying Register Text:" + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void selectGender(String maleOrFemale) {
        log.info("Selecting Gender:" + genderMale.toString() + genderFemale.toString());
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
    }

    public void enterFirstName(String firstName) {
        log.info("Enter First Name:" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Enter Last Name:" + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void dateOfBirthDay(String day) {
        log.info("Enter Date of Birth:" + dateOfBirthDay.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
    }

    public void dateOfBirthMonth(String month) {
        log.info("Enter Month of Birth:" + monthOfBirthDay.toString());
        selectByVisibleTextFromDropDown(monthOfBirthDay, month);
    }

    public void dateOfBirthYear(String year) {
        log.info("Enter Year of Birth:" + yearOfBirthDay.toString());
        selectByVisibleTextFromDropDown(yearOfBirthDay, year);
    }
    public void enterEmail(String email) {
        log.info("Enter Email:" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter Password:" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("Enter Confirm Password:" + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        log.info("Click On Register Button:" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyFirstNameError() {
        log.info("Veryfy First Name Error:" + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        log.info("Verify Last Name Error:" + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String verifyPasswordError() {
        log.info("Verifying Password Error:" + passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        log.info("Verifying Confirm Password:" + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }

    public String verifyEmailError() {
        log.info("Verifying Email Erro:" + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String verifyRegistrationCompleteMessage() {
        log.info("Verifying Registration Complate:" + verifyRegistration.toString());
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        log.info("Click On Continue Tab:" + continueTab.toString());
        clickOnElement(continueTab);
    }
    public String verifyErrorMessageForLabel(String labelName) {
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(labelName)) {
                validationMessage = message.getText();
                break;
            }
        }
        return validationMessage;
    }
}