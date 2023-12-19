package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
//    @Given("I am on homepage")
//    public void iAmOnHomepage() {
//    }
//
   @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("Welcome message is displayed")
    public void welcomeMessageIsDisplayed() {
        new LoginPage().verifyWelcomeText();
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmail(email);

    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage() {
        new LoginPage().verifyErrorMessage();
    }

    @Then("I should see the logout Button")
    public void iShouldSeeTheLogoutButton() {
        new LoginPage().verifyLogoutLinkIsDisplayed();
    }

    @And("I should see the logout link")
    public void iShouldSeeTheLogoutLink() {

    }

    @And("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {

    }

    @And("I click on logout button")
    public void iClickOnLogoutButton() {
        new LoginPage().clickOnLogoutLink();
    }

    @Then("I should see login link")
    public void iShouldSeeLoginLink() {
        new HomePage().verifyLoginLinkIsDisplayed();
    }
}

