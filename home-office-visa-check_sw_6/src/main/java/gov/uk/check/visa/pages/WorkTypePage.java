package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement work;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void planningToWorkAsHealthCareProfessional() {
        mouseHoverToElementAndClick(work);
        log.info("Clicking on work : " + work.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton.toString());
    }
}

