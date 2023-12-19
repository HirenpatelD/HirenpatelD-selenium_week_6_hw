package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/nopcommerce/demo",
        plugin = {"html:target/cucumber-report/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression"
)
public class RegisterTestRunner extends AbstractTestNGCucumberTests {


}