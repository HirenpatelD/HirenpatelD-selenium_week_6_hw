package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement result;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement verify;

    public String verifyTheTextYouWillNotNeedAVisaToComeToTheUK() {
        String verificationText = getTextFromElement(text);
        log.info("Verifying the text: " + text.toString());
        return verificationText;
    }

    public String verifyTheTextYouNeedAVisaToWorkInHealthCare() {
        String verifyResult = getTextFromElement(result);
        log.info("Verifying the result: " + result.toString());
        return verifyResult;

    }

    public String verifyTheTextYouNeedAVisaToJoinYourFamilyOrPartnerInUK() {
        String result = getTextFromElement(verify);
        log.info("Verifying the result: " + verify.toString());
        return result;
    }

}

