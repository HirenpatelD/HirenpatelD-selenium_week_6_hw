package com.nopcommerce.demo.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends com.nopcommerce.demo.utility.Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement sortByDisplayDropDown;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;

    public String verifyDesktopsText() {
        log.info("Verifying Desktop Text:" + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void selectBySortBySortByDropDown(String sortBy) {
        log.info("Selecting Sort by DropDOwn:" + sortByDropDown.toString());
        selectByVisibleTextFromDropDown(sortByDropDown, sortBy);
    }

    public void selectByDisplayDropDown(String displayBy) {
        log.info("Selecting by Display DropDown:" + sortByDisplayDropDown.toString());
        selectByVisibleTextFromDropDown(sortByDisplayDropDown, displayBy);
    }

    public void selectByProductList() {
        log.info("Selecting by Product list:" + productList.toString());
        clickOnElement(productList);
    }

    public void clickOnBuildYourOwnComputer() {
        log.info("Clicking on Buil Your Computor:" + buildYourOwnComputer.toString());
        clickOnElement(buildYourOwnComputer);
    }


}
