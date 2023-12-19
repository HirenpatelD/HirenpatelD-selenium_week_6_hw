package gov.uk.check.visa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "gov/uk/check/visa/steps",
        plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@smoke"
)
public class SmokeRunCukeTest extends AbstractTestNGCucumberTests {
}
