package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I click on Desktops tab")
    public void iClickOnDesktopsTab() {
        new HomePage().clickOnDesktopTab();
    }

    @And("I call selectMenu and pass all desktop {string}")
    public void iCallSelectMenuAndPassAllDesktop(String allDesktop) {
        new HomePage().selectMenu(allDesktop);
    }

    @And("I should navigate to desktop page")
    public void iShouldNavigateToDesktopPage() {
    }

    @Then("I should get desktop text like {string}")
    public void iShouldGetDesktopTextLike(String desktopText) {
        Assert.assertEquals(new HomePage().verifyDesktopsText(), desktopText, "Incorrect Text");
    }

    @When("I click on Laptop and Notebooks tab")
    public void iClickOnLaptopAndNotebooksTab() {
        new HomePage().clickOnLaptopAndNotebook();
    }

    @And("I call selectMenu and pass all laptop and notebook {string}")
    public void iCallSelectMenuAndPassAllLaptopAndNotebook(String allLaptopAndNotebooks) {
        new HomePage().selectMenu(allLaptopAndNotebooks);
    }

    @And("I should navigate to laptop and notebook page")
    public void iShouldNavigateToLaptopAndNotebookPage() {
    }

    @Then("I should get laptop and notebook text like {string}")
    public void iShouldGetLaptopAndNotebookTextLike(String laptopAndNotebookText) {
        Assert.assertEquals(new HomePage().verifyLaptopAndNoteText(), laptopAndNotebookText, "Incorrect Text");
    }

    @When("I click on Components tab")
    public void iClickOnComponentsTab() {
        new HomePage().clickOnComponents();
    }

    @And("I call selectMenu and pass all components {string}")
    public void iCallSelectMenuAndPassAllComponents(String allComponents) {
        new HomePage().selectMenu(allComponents);
    }

    @And("I should navigate to Components page")
    public void iShouldNavigateToComponentsPage() {
    }

    @Then("I should get components like {string}")
    public void iShouldGetComponentsLike(String componentsText) {
        Assert.assertEquals(new HomePage().verifyComponentsText(), componentsText, "Incorrect Text");
    }
}

