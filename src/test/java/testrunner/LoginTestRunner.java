package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = {"stepDefinitions", "setup"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true
)


 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = {"stepDefinitions", "setup"},
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", // 👈 Allure plugin
                "json:build/reports/cucumber.json"
        },
        monochrome = true
)

public class LoginTestRunner {

}
