package setup;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

import java.time.Duration;

public class Setup {

    public WebDriver driver;

    public WebDriver setup() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}
