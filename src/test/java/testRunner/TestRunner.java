package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "D:\\Automation\\CucumberExample\\features",
        glue = "stepsDefinition",
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}
