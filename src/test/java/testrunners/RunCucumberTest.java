package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features", // Path to the feature files
        glue = "stepdefinitions", // Path to the step definitions
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"} // Reporting plugins
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    // No additional code is required
}
