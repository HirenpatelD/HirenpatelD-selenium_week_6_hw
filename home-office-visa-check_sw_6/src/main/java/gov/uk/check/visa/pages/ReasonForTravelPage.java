package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reason;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement reason1;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement reason2;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void reasonIsTourismToTravelToUK() {
        mouseHoverToElementAndClick(reason);
        log.info("Clicking on reason : " + reason.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on continue Button : " + continueButton.toString());
    }

    public void reasonIsWorkAcademicVisitToTravelToUK() {
        mouseHoverToElementAndClick(reason1);
        log.info("Clicking on reason : " + reason1.toString());

    }

    public void reasonIsJoinPartnerOrFamilyForALongStay() {
        mouseHoverToElementAndClick(reason2);
        log.info("Clicking on reason : " + reason2.toString());
    }
}

