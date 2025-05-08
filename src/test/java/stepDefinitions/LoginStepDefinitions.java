package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import setup.Setup;

public class LoginStepDefinitions extends Setup {

    LoginPage loginPage;

    @Given("User is on the login page")
    public void user_on_login_page() {
        driver = setup();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("User inputs empty email and valid password")
    public void user_inputs_empty_email_and_valid_password() throws InterruptedException {
        loginPage.login("", "secret_sauce");
    }

    @Then("User should see a login error")
    public void user_should_see_first_login_error() throws InterruptedException {
        String expected = loginPage.firstErrorMessage();
        String actual = "Epic sadface: Username is required";
        Assert.assertEquals(expected,actual);
    }

    @When("User inputs valid email and empty password")
    public void user_inputs_valid_email_and_empty_password() throws InterruptedException {
        loginPage.login("standard_user", "");
    }

    @Then("User should see a password login error")
    public void user_should_see_second_login_error() throws InterruptedException {
        String expected = loginPage.secondErrorMessage();
        String actual = "Epic sadface: Password is required";
        Assert.assertEquals(expected,actual);
    }

    @When("User inputs empty email and empty password")
    public void user_inputs_empty_email_and_empty_password() throws InterruptedException {
        loginPage.login("", "");
    }

    @Then("User should see a login error message Username is required")
    public void user_should_see_a_login_error_message_username_is_required() throws InterruptedException {
        String expected = loginPage.firstErrorMessage();
        String actual = "Epic sadface: Username is required";
        Assert.assertEquals(expected,actual);
    }

    @When("User inputs invalid email and valid password")
    public void user_inputs_invalid_email_and_valid_password() throws InterruptedException {
        loginPage.login("DFGDFDD", "secret_sauce");
    }

    @Then("User should see a login error message Username and password do not match any user in this service")
    public void user_should_see_a_login_error_message_username_and_password_mismatch() throws InterruptedException {
        String expected = loginPage.firstErrorMessage();
        String actual = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(expected,actual);
    }
}
