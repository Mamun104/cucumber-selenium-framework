package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = {"stepDefinitions", "setup"},
        plugin = {
                "pretty",
                "json:build/reports/cucumber.json"
        },
        monochrome = true
)

public class LoginTestRunner {

}
