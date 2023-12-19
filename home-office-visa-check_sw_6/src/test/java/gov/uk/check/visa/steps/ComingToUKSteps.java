package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComingToUKSteps {
    @Given("I am on Home page")
    public void iAmOnHomePage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select nationality {string}")
    public void iSelectNationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I select reason is Tourism")
    public void iSelectReasonIsTourism() {
        new ReasonForTravelPage().reasonIsTourismToTravelToUK();
    }

    @And("I click on a continue button")
    public void iClickOnAContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @Then("I get a result {string}")
    public void iGetAResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheTextYouWillNotNeedAVisaToComeToTheUK(), result, "Incorrect result");
    }

    @And("I select a nationality {string}")
    public void iSelectANationality(String nationality1) {
        new SelectNationalityPage().selectNationality(nationality1);
    }

    @And("I click continue button")
    public void iClickContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I select work and academic visit reason is Work, academic visit or business")
    public void iSelectWorkAndAcademicVisitReasonIsWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().reasonIsWorkAcademicVisitToTravelToUK();
    }

    @And("I click the continue button")
    public void iClickTheContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @And("I select intended to stay for longer than six months")
    public void iSelectIntendedToStayForLongerThanMonths() {
        new DurationOfStayPage().durationToStayInUK();
    }

    @And("I click on the continue button")
    public void iClickOnTheContinueButton() {
        new DurationOfStayPage().clickOnContinueButton();
    }

    @And("I select have planning to work for Health and care professional")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().planningToWorkAsHealthCareProfessional();
    }

    @And("I click a continue button")
    public void iClickAContinueButton() {
        new WorkTypePage().clickOnContinueButton();
    }

    @Then("I get result {string}")
    public void iGetResult(String result1) {
        Assert.assertEquals(new ResultPage().verifyTheTextYouNeedAVisaToWorkInHealthCare(), result1, "Incorrect result");
    }

    @And("I select The nationality {string}")
    public void iSelectTheNationality(String nationality3) {
        new SelectNationalityPage().selectNationality(nationality3);
    }

    @And("I clicks on continue button")
    public void iClicksOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I select join partner reason is Join partner or family for a long stay")
    public void iSelectJoinPartnerReasonIsJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().reasonIsJoinPartnerOrFamilyForALongStay();
    }

    @And("I clicks on the continue button")
    public void iClicksOnTheContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @And("I select state My partner of family member have uk immigration status is yes")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusIsYes() {
        new FamilyImmigrationStatusPage().familyMemberHaveUKImmigrationStatus();
    }

    @And("I clicks the continue button")
    public void iClicksTheContinueButton() {
        new FamilyImmigrationStatusPage().clickOnContinueButton();
    }

    @Then("I get the result {string}")
    public void iGetTheResult(String result3) {
        Assert.assertEquals(new ResultPage().verifyTheTextYouNeedAVisaToJoinYourFamilyOrPartnerInUK(), result3, "Incorrect result");
    }
}
