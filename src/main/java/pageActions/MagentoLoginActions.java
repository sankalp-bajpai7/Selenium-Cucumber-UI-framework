package pageActions;

import helperUtils.HelperBaseInterface;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageLocators.MagentoLoginPageLocators;
import pageLocators.PHPTravelPricingPageLocators;

import java.time.Duration;
import java.util.Map;

import static Constants.PHPTravelsHomePageConstants.FooterLinks;
import static Constants.PHPTravelsHomePageConstants.MagentoHomePageURL;
import static stepDefinitions.test.ExecutionPreSetup.getData;
import static stepDefinitions.test.ExecutionPreSetup.scenarioName;

public class MagentoLoginActions implements HelperBaseInterface {

    MagentoLoginPageLocators mLoginPageLocators = new MagentoLoginPageLocators();


    public static WebDriver driver;

    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(10));

    public WebDriver getCurrentDriver() {
        return driver = mLoginPageLocators.getDriver();
    }

    public void setDriver(WebDriver driver) {
        MagentoLoginActions.driver = driver;
    }

    public void navigatetoHomePage() throws InterruptedException {
        navigateURL(getCurrentDriver(), MagentoHomePageURL);
    }
    public void navigatetoLoginPage() {

        mLoginPageLocators.findSignOn(getCurrentDriver());
        mLoginPageLocators.SignInLink.click();
        System.out.println("navigation completed");

    }
    public void enterEmailPassword(){
        Map<String, String> scenarioData = getData(scenarioName);
        String email = scenarioData.get("email");
        String password = scenarioData.get("password");
        System.out.println("email:" +email+  "\npassword:" +password);

        mLoginPageLocators.addEmail(getCurrentDriver());
        mLoginPageLocators.emailField.sendKeys(email);
        mLoginPageLocators.addPassword(getCurrentDriver());
        mLoginPageLocators.passwordField.sendKeys(password);
    }

    public void navigatetoDashboardPage() {
        mLoginPageLocators.clickSignIn(getCurrentDriver());
        mLoginPageLocators.SignInButton.click();
        String dashBoardtitle = driver.getTitle();
        Assert.assertEquals(mLoginPageLocators.dashboardpagetitle,dashBoardtitle);
        System.out.println(" Dashboard navigation completed ");

    }

    public void scrolltoNewsletter(){
        mLoginPageLocators.checkNewsLetter(getCurrentDriver());
        bc.scrollUntilElementVisible(getCurrentDriver(), mLoginPageLocators.check_newsletter);
        HelperBaseInterface.getScreenShot(getCurrentDriver());
        wait.until(ExpectedConditions
                .visibilityOf(mLoginPageLocators.check_newsletter));
        HelperBaseInterface.getScreenShot(getCurrentDriver());

    }

    public void validateFooterLinks() {
        // TODO Auto-generated method stub

//        for(int i=0; i<mLoginPageLocators.magentofooterLinks.size(); i++) {
//
//            if(FooterLinks.contains(mLoginPageLocators.magentofooterLinks.get(i).getText()
//            )) {
//                System.out.println(mLoginPageLocators.magentofooterLinks.get(i).getText()+" footer link found");
//            }
//        }

    }

    public void selectMenJackets(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement menSection = driver.findElement(By.xpath("//a[@id='ui-id-5']"));
        Actions movetoMen = new Actions(driver);
        movetoMen.moveToElement(menSection);
        movetoMen.click().build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement topsMenSection = driver.findElement(By.xpath("//a[@id='ui-id-17']"));
//        wait.until(ExpectedConditions.visibilityOf(topsMenSection));
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Actions movetoTopsSection = new Actions(driver);
//        movetoTopsSection.moveToElement(topsMenSection);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement selectJackets = driver.findElement(By.xpath("//a[@id='ui-id-19']//span[contains(text(),'Jackets')]"));
//        Actions selectJacket = new Actions(driver);
//        selectJacket.moveToElement(selectJackets);
//        selectJacket.click().build().perform();


    }
}
