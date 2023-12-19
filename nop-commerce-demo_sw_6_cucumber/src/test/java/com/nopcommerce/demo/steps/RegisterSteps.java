package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }


    @Then("I should see the Registered Link")
    public void iShouldSeeTheRegisteredLink() {
        new RegisterPage().verifyRegisterText();
    }

//    @When("I click on Register Button")
//    public void iClickOnRegisterButton() {
//        new RegisterPage().clickOnRegisterButton();
//    }



    @Then("I should see the error message that {string}")
    public void iShouldSeeTheErrorMessageThat(String firstNameError) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameError(), "First name is required.", "First Name not Verified");
    }

    @Then("I should see the error message that is {string}")
    public void iShouldSeeTheErrorMessageThatIs(String lastnameError) {
        Assert.assertEquals(new RegisterPage().verifyLastNameError(), "Last name is required.", "Last Name not Verified");
    }

    @Then("I should see the error message thatE {string}")
    public void iShouldSeeTheErrorMessageThatE(String emailError) {
        Assert.assertEquals(new RegisterPage().verifyEmailError(), "Email is required.", "Email not Verified");
    }

    @Then("I should see the error message thatpw  {string}")
    public void iShouldSeeTheErrorMessageThatpw(String passwordError) {
        Assert.assertEquals(new RegisterPage().verifyPasswordError(), "Password is required.", "Password not Verified");
    }

    @Then("I should see the error message thatpwr {string}")
    public void iShouldSeeTheErrorMessageThatpwr(String confirmPWError) {
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordError(), "Password is required.", "Password not Verified");
    }

    @And("I Select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I Enter firstname {string}")
    public void iEnterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I Enter lastname {string}")
    public void iEnterLastname(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I Select Date of birth day {string}")
    public void iSelectDateOfBirthDay(String dateOfBirth) {
        new RegisterPage().dateOfBirthDay(dateOfBirth);
    }

    @And("I Select Date of birth month {string}")
    public void iSelectDateOfBirthMonth(String monthOfBirth) {
        new RegisterPage().dateOfBirthMonth(monthOfBirth);
    }

    @And("I Select Date of birth year {string}")
    public void iSelectDateOfBirthYear(String yearOfBirth) {
        new RegisterPage().dateOfBirthYear(yearOfBirth);
    }

    @And("I enter the email address {string}")
    public void iEnterTheEmailAddress(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter the confirm password {string}")
    public void iEnterTheConfirmPassword(String confirmPW) {
        new RegisterPage().enterConfirmPassword(confirmPW);
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String registrationComplate) {
        new RegisterPage().verifyRegistrationCompleteMessage();
    }

    @And("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
    }

    @And("I Select gender")
    public void iSelectGender() {
    }

    @And("I Enter firstname")
    public void iEnterFirstname() {
    }

    @And("I Enter lastname")
    public void iEnterLastname() {
    }

    @And("I Select Date of birth day")
    public void iSelectDateOfBirthDay() {
    }

    @And("I Select Date of birth month")
    public void iSelectDateOfBirthMonth() {
    }

    @And("I Select Date of birth year")
    public void iSelectDateOfBirthYear() {
    }

    @And("I enter the email address")
    public void iEnterTheEmailAddress() {
    }

    @And("I enter the password")
    public void iEnterThePassword() {
    }

    @And("I enter the confirm password")
    public void iEnterTheConfirmPassword() {
    }

//    @And("I click on register button")
//    public void iClickOnRegisterButton() {
//    }

    @Then("I should register successfully")
    public void iShouldRegisterSuccessfully() {
    }
}

