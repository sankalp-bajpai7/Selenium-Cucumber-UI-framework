package pageActions;

import static Constants.PHPTravelsHomePageConstants.PHPTravelsHomePageTitle;
import static Constants.PHPTravelsHomePageConstants.PHPTravelsHomePageURL;
import static Constants.PHPTravelsHomePageConstants.PHPTravelsPricingPageTitle;
import static Constants.PHPTravelsHomePageConstants.PHPTravelsPricingPageURL;
import static Constants.PHPTravelsHomePageConstants.FAQTitles;
import static Constants.PHPTravelsHomePageConstants.FooterLinks;
import java.time.Duration;

import helperUtils.HelperBaseInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helperUtils.HelperBaseInterface;
import pageLocators.PHPTravelPricingPageLocators;
import stepDefinitions.test.ExecutionPreSetup;

public class PHPTravelActions extends ExecutionPreSetup implements HelperBaseInterface {
    // HelperBaseInterface HInterface; - u cannot create constructors for interface
    public static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    private WebDriver getDriver() {
        return driver = getBaseDriver(); // this driver comes from executionpreSetup
    }

    public void setDriver(WebDriver inputdriver) {
        PHPTravelActions.driver = inputdriver;
    }

    PHPTravelPricingPageLocators PricingPageLocators = PageFactory.initElements(getDriver(),
            PHPTravelPricingPageLocators.class);

    /**
     * here we initialize the baseINTERFACE METHOD to this local driver so that
     * subsequent operations can be done
     *
     * @throws SecurityException
     * @throws NoSuchMethodException
     */

    public void openPage() {
        driver = initializeBrowser(driver, "FireFox");
        setDriver(driver);
    }

    public void navigateHomePage() throws InterruptedException {
        navigateURL(driver, PHPTravelsHomePageURL);
        if (getTitle().equals(PHPTravelsHomePageTitle)) {
            System.out.println("Landed on Home Page");
        }
    }

    public void navigatePricingPage() throws InterruptedException {
        navigateURL(getDriver(), PHPTravelsPricingPageURL);
        if (getTitle().equals(PHPTravelsPricingPageTitle)) {
            System.out.println("Landed on Pricing Page");
        }

    }

    public void validatePricingHeader() {

        if (PricingPageLocators.pricingPageLogo.isDisplayed()) {
            System.out.println("LogoFound");
        }
        if (PricingPageLocators.pricingPageHeader.getText().equalsIgnoreCase("Plans and Prices")) {
            System.out.println("PageHeader Found");
        }

    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void chooseIntegrations() {
        PricingPageLocators.IntegrationDropDown.click();
        // bc.getScreenShot(getDriver());

        if (PricingPageLocators.FlightsOption.isDisplayed()) {
            PricingPageLocators.FlightsOption.click();
            // bc.waitShort(getDriver());

        }

        if (PricingPageLocators.KiwiPartner.isDisplayed()) {

            // bc.waitShort(getDriver());
            PricingPageLocators.KiwiPartner.click();
            // bc.waitForLoad(getDriver());
            // bc.getScreenShot(getDriver());
            if (PricingPageLocators.KiwiDisplayName.isDisplayed()) {
                System.out.println(" found");
                // bc.getScreenShot(getDriver());
            } else {
                System.out.println("not found");
            }
        } else {
            System.out.println("not found");
        }
        // .findElement(By.name("Flights")).click();

    }

    public void scrollDowntoFeatures() {
        bc.scrollUntilElementVisible(getDriver(), PricingPageLocators.FeaturesInfoHeader2);
        HelperBaseInterface.getScreenShot(getDriver());
        wait.until(ExpectedConditions
                .visibilityOf(PricingPageLocators.FeaturesInfoHeader));
        HelperBaseInterface.getScreenShot(getDriver());
        if(PricingPageLocators.Feature_ResponsiveDesign.isDisplayed()) {
            System.out.println("SubMenu found");
        }
    }

    public void validateFAQ() {

        wait.until(ExpectedConditions
                .visibilityOf(PricingPageLocators.FAQHeader));

        int length1 = PricingPageLocators.faqtopics.size();

        for(int i=0; i<length1; i++) {
            String temp = PricingPageLocators.faqtopics.get(i).getText();
            if(FAQTitles.contains(temp)) {
                System.out.println(temp+" is present");
            }else {
                System.out.println(temp+" is absent");
            }

        }



    }

    public void validateFooters() {
        // TODO Auto-generated method stub
        bc.scrollUntilElementVisible(getDriver(), PricingPageLocators.Footer_Link_Product);
        HelperBaseInterface.getScreenShot(getDriver());
        bc.scrollUntilElementVisible(getDriver(), PricingPageLocators.Footer_TOS);
        HelperBaseInterface.getScreenShot(getDriver());
    }

    public void validateFooterLinks() {
        // TODO Auto-generated method stub

        for(int i=0; i<PricingPageLocators.footerlinks.size(); i++) {

            if(FooterLinks.contains(PricingPageLocators.footerlinks.get(i).getText()
            )) {
                System.out.println(PricingPageLocators.footerlinks.get(i).getText()+" footer link found");
            }
        }

    }








}
