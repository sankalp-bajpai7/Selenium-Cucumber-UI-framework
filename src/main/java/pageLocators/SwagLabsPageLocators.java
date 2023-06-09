package pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    public WebElement AddtoCartForBikeLight;
    public WebElement filterDropbox;
    public WebElement selectProduct;
    public WebElement productDescription;
    public WebElement productPrice;
    public String actualProductDescription = "Rib snap infant onesie for the junior automation engineer in development. " +
            "Reinforced 3-snap bottom closure, " +
            "two-needle hemmed sleeved and bottom won't unravel.";
    public String description;
    public String actualPrice = "$7.99";
    public String price;
    public WebElement addtoCart;
    public WebElement removeButton;
    public String buttonText;
    public String actualButtonText = "Remove";


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

    public void useFilter(WebDriver driver) {
       // filterDropbox = driver.findElement(By.xpath("//*contains(@class,"select_container")"));
        filterDropbox = driver.findElement(By.className("product_sort_container"));
        wait.until(ExpectedConditions.visibilityOf(filterDropbox));
        Select selectFilter = new Select(filterDropbox);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        selectFilter.selectByValue("lohi");

//        AddtoCartForBikeLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
//        WebElement addCart = wait.until(ExpectedConditions.elementToBeClickable(AddtoCartForBikeLight));
//        addCart.click();
    }

    public void setselectProduct(WebDriver driver) {
        selectProduct = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]"));
        wait.until(ExpectedConditions.visibilityOf(selectProduct));
        selectProduct.click();
    }

    public void validateProductDescription(WebDriver driver) {
        productDescription = driver.findElement(By.xpath("//*[@class=\"inventory_details_desc large_size\"]"));
        wait.until(ExpectedConditions.visibilityOf(productDescription));
        description = productDescription.getText();
        System.out.println(description);
    }

    public void validateDisplayedPrice(WebDriver driver) {
        productPrice = driver.findElement(By.xpath("//*[@class=\"inventory_details_price\"]"));
        wait.until(ExpectedConditions.visibilityOf(productPrice));
        price = productPrice.getText();
        System.out.println(price);
    }

    public void addtoCartProdDescPage(WebDriver driver) {
        addtoCart = driver.findElement(By.xpath("//*[@class=\"btn btn_primary btn_small btn_inventory\"]"));
       // addtoCart = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        wait.until(ExpectedConditions.visibilityOf(addtoCart));
        addtoCart.click();
    }
    public void removeButtonAfterAddtoCart(WebDriver driver) {
        removeButton = driver.findElement(By.xpath("//*[@class=\"btn btn_secondary btn_small btn_inventory\"]"));
      //  removeButton = driver.findElement(By.id("remove-sauce-labs-onesie"));
        wait.until(ExpectedConditions.visibilityOf(removeButton));
        buttonText = removeButton.getText();
        System.out.println(buttonText);
    }

}
