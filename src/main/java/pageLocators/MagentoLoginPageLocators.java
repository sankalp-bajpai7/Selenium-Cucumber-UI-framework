package pageLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.test.ExecutionPreSetup;

public class MagentoLoginPageLocators extends ExecutionPreSetup {

    WebDriver driver=super.getBaseDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement SignInLink;
    public WebElement SignInButton;
    public WebElement emailField;
    public WebElement passwordField;

    public List<WebElement> headerLinks;
    public WebElement check_newsletter;

    public String dashboardpagetitle = "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";

    public void findSignOn(WebDriver driver) {
        SignInLink = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));


        wait.until(ExpectedConditions.visibilityOf(SignInLink));
    }

    public void addEmail(WebDriver driver){
        emailField = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(emailField));


    }

    public void addPassword(WebDriver driver){
        passwordField = driver.findElement(By.id("pass"));
        wait.until(ExpectedConditions.visibilityOf(passwordField));
    }

    public void clickSignIn(WebDriver driver) {
        SignInButton = driver.findElement(By.id("send2"));
        wait.until(ExpectedConditions.visibilityOf(SignInButton));

    }

//    @FindBy(xpath="/html/body/div[2]/footer/div")
//    public List<WebElement> magentofooterLinks;


//    public void newsLetter(WebDriver driver){
//        Magento_Newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
//        wait.until(ExpectedConditions.visibilityOf(Magento_Newsletter));
//    }

    public void checkNewsLetter(WebDriver driver){
        check_newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        wait.until(ExpectedConditions.visibilityOf(check_newsletter));

    }



}
