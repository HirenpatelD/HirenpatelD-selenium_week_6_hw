package com.tutorialsninja.demo.runner;

//@CucumberOptions(
//        features = "src/test/java/resources/features",
//        glue = "com/tutorialsninja/steps",
//        plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//        tags = "@smoke"
//)
//
//public class SmokeRunCukeTest extends AbstractTestNGCucumberTests {
//}

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "com/tutorialsninja/demo/steps",
        plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@smoke"
)
public class SmokeRunCukeTest extends AbstractTestNGCucumberTests {
}