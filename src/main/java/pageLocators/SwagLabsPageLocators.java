package pageLocators;

import dev.failsafe.Execution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.test.ExecutionPreSetup;

import java.time.Duration;

public class SwagLabsPageLocators extends ExecutionPreSetup {

    WebDriver driver=super.getBaseDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement usernameField;
    public WebElement passwordField;
    public WebElement loginButton;
    public String homepagetitle = "Swag Labs";

    public void setUsernameField(WebDriver driver) {
        usernameField = driver.findElement(By.id("user-name"));
        wait.until(ExpectedConditions.visibilityOf(usernameField));
    }

    public void setPasswordField(WebDriver driver) {
        passwordField = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(passwordField));
    }

    public void clickLogin(WebDriver driver) {
        loginButton = driver.findElement(By.id("login-button"));
    }
}
