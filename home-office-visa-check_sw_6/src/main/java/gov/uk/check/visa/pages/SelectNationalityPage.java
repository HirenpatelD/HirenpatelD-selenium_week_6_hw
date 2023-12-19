package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(id = "response")
    WebElement selectNationality;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
    WebElement continueButton;


    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(selectNationality, nationality);
        log.info("select nationality : " + nationality + "from drop down menu" + selectNationality.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton.toString());
    }
}

