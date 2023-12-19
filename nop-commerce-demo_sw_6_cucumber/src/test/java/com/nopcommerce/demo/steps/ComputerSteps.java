package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerSteps {
    @When("I click on Computer Tab")
    public void iClickOnComputerTab() {
        new HomePage().selectTopMenu("Computer");
    }

    @Then("I should see Computer text")
    public void iShouldSeeComputerText() {
        new ComputerPage().verifyComputersText();
    }


    }

