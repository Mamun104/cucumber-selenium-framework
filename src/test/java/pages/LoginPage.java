package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    @FindBy(id = "user-name")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement submitButton;
    @FindBy(css = "span[class='title']")
    WebElement dashboardTitle;
    @FindBy(className = "error-message-container")
    WebElement loginErrorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String pass) throws InterruptedException {
        Thread.sleep(1000);
        usernameField.sendKeys(user);
        Thread.sleep(1000);
        passwordField.sendKeys(pass);
        Thread.sleep(1000);
        submitButton.click();
    }

    public String firstErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        return loginErrorMessage.getText();
    }

    public String secondErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        return loginErrorMessage.getText();
    }
}

