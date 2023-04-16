package pageLocators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import stepDefinitions.test.ExecutionPreSetup;

public class PHPTravelPricingPageLocators extends ExecutionPreSetup {

    WebDriver driver;

    public 	PHPTravelPricingPageLocators(WebDriver Driver) {
        this.driver = Driver;
    }


    /**
     * When you use PageFactory the only supported
     * method to identify elements is
     * using @FindBy or By. Anything else will
     * throw a null pointer exception.
     * For ex - the below results in a null pointer
     * //public WebElement pricingPageLogo = driver.
     //findElement(By.id("PHPTRAVELS"));
     */
    @FindBy(id="PHPTRAVELS")
    public WebElement pricingPageLogo;


    @FindBy(className="mb-0")
    public WebElement pricingPageHeader;


    @FindBy(css="h2.tac.mb0.mt2")
    public WebElement FeaturesInfoHeader;

    @FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/h2")
    public WebElement FeaturesInfoHeader2;


    @FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/div[3]/div[2]/h3")
    public WebElement Feature_ResponsiveDesign;

    @FindBy(className="jfHeader-subMenuTitle")
    public WebElement Integration;


    @FindBy(xpath="//*[@id=\"content\"]/div[4]/h2/strong")
    public WebElement FAQHeader;

    @FindBy(how = How.LINK_TEXT, using = "Integrations")
    public WebElement IntegrationDropDown;

    @FindBy(how = How.ID, using = "menuToggle-3")
    public WebElement FlightsOption;


    @FindBy(how = How.LINK_TEXT, using = "Kiwi")
    public WebElement KiwiPartner;

    @FindBy(how = How.CSS, using = "img.profimg.br8.maw100")
    public WebElement KiwiDisplayName;

    @FindBy(css="h3.wow.fadeIn.strong.animated")
    public List<WebElement> faqtopics;

    @FindBy(css="div.bannersnack-pages.title")
    public WebElement Footer_Link_Product;

    @FindBy(how = How.LINK_TEXT, using = "Terms of Service")
    public WebElement Footer_TOS;

    @FindBy(css="a.lvl-0.link.nav-link")
    public List<WebElement> footerlinks;




}
