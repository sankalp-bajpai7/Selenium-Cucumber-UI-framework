package pageActions;

import helperUtils.HelperBaseInterface;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageLocators.SwagLabsPageLocators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static Constants.PHPTravelsHomePageConstants.MagentoHomePageURL;
import static Constants.PHPTravelsHomePageConstants.SwagLabsHomePageURL;
import static stepDefinitions.test.ExecutionPreSetup.getData;
import static stepDefinitions.test.ExecutionPreSetup.scenarioName;

public class SwagLabsLoginActions implements HelperBaseInterface {

    SwagLabsPageLocators swagLabsPageLocators = new SwagLabsPageLocators();

    public static WebDriver driver;
    List<WebElement>  links;

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

    public void numberofLinks() {
        links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links on the page : " +links.size());
    }

    public void selectFilter() {
        swagLabsPageLocators.useFilter(getCurrentDriver());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void numberofBrokenLinks() {
        int brokenLinksCount = 0;
        for (WebElement link:links) {
            String pageURL = link.getAttribute("href");
            try{
                HttpURLConnection connection = (HttpURLConnection) new URL(pageURL).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int ResponseCode = connection.getResponseCode();
                if (ResponseCode <200 || ResponseCode >299) {
                   // System.out.println(pageURL + " is a broken link with response code " + ResponseCode);
                    brokenLinksCount++;
                }
            } catch (Exception e) {
               // System.out.println(pageURL + " is a broken link with exception " + e.getMessage());
                brokenLinksCount++;
            }
            }
        System.out.println("Number of broken links : " +brokenLinksCount);
        }

    public void selectAProduct(){
        swagLabsPageLocators.setselectProduct(getCurrentDriver());
    }

    public void validatingProdDescription() {
        swagLabsPageLocators.validateProductDescription(getCurrentDriver());
        Assert.assertEquals(swagLabsPageLocators.actualProductDescription,swagLabsPageLocators.description);
    }

    public void validatePrice() {
        swagLabsPageLocators.validateDisplayedPrice(getCurrentDriver());
        Assert.assertEquals(swagLabsPageLocators.actualPrice, swagLabsPageLocators.price);
//         boolean b = swagLabsPageLocators.actualPrice.contains(swagLabsPageLocators.price);
//        if (b==true) {
//            System.out.println("Price match");
//        }
//        else {
//            System.out.println("Prices dont match");
//        }
    }
    public void addtoCartFromProdDescPage(){
        swagLabsPageLocators.addtoCartProdDescPage(getCurrentDriver());
        swagLabsPageLocators.removeButtonAfterAddtoCart(getCurrentDriver());
        Assert.assertEquals(swagLabsPageLocators.actualButtonText,swagLabsPageLocators.buttonText);

    }

}
