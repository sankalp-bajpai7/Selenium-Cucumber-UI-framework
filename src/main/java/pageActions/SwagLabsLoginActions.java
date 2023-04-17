package pageActions;

import helperUtils.HelperBaseInterface;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageLocators.SwagLabsPageLocators;

import java.time.Duration;
import java.util.Map;

import static Constants.PHPTravelsHomePageConstants.MagentoHomePageURL;
import static Constants.PHPTravelsHomePageConstants.SwagLabsHomePageURL;
import static stepDefinitions.test.ExecutionPreSetup.getData;
import static stepDefinitions.test.ExecutionPreSetup.scenarioName;

public class SwagLabsLoginActions implements HelperBaseInterface {

    SwagLabsPageLocators swagLabsPageLocators = new SwagLabsPageLocators();

    public static WebDriver driver;

    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(10));

    public WebDriver getCurrentDriver() {
        return driver = swagLabsPageLocators.getDriver();
    }

    public static void setDriver(WebDriver driver) {
        SwagLabsLoginActions.driver = driver;
    }
    public void navigatetoHomePage() throws InterruptedException {
        navigateURL(getCurrentDriver(), SwagLabsHomePageURL);
    }

    public void enterUsernameandPassword() {
        Map<String, String> scenarioData = getData(scenarioName);
        String username = scenarioData.get("username");
        String password = scenarioData.get("password");

        System.out.println("username:" +username+  "\npassword:" +password);
        swagLabsPageLocators.setUsernameField(getCurrentDriver());
        swagLabsPageLocators.usernameField.sendKeys(username);
        swagLabsPageLocators.setPasswordField(getCurrentDriver());
        swagLabsPageLocators.passwordField.sendKeys(password);
    }

    public void gotoHomePage(){
        swagLabsPageLocators.clickLogin(getCurrentDriver());
        swagLabsPageLocators.loginButton.click();
    }

    public void validateHomepage() {
      String homepagetitle =   driver.getTitle();
      Assert.assertEquals(swagLabsPageLocators.homepagetitle, homepagetitle);
        System.out.println(homepagetitle);
    }
}
