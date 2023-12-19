package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy(css = ".gem-c-button.govuk-button.govuk-button--start")
    WebElement startButton;


    public void clickStartNow() {
        clickOnElement(startButton);
        log.info("Clicking on start button : " + startButton.toString());
    }
}

