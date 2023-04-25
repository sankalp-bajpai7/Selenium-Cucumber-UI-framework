package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.SwagLabsLoginActions;
import pageLocators.SwagLabsPageLocators;

public class SwagLabs {


    SwagLabsLoginActions swagLabsLoginActions = new SwagLabsLoginActions();
    SwagLabsPageLocators swagLabsPageLocators = new SwagLabsPageLocators();

    @Given("I am on landing page for swag labs")
    public void landingPage() {
        try {
            swagLabsLoginActions.navigatetoHomePage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("I provide the username and password")
    public void enterLoginPassword() {
        swagLabsLoginActions.enterUsernameandPassword();
    }


    @And("I click on Login")
    public void redirectToHomepage() {
        swagLabsLoginActions.gotoHomePage();
    }


    @Then("I should be displayed the swag labs landing page")
    public void validatingHomepage() {
        swagLabsLoginActions.validateHomepage();
    }

    @Then("I should be displayed the swag labs landing page and calculate the number of links on the page")
    public void countBrokenLinks() {
        swagLabsLoginActions.validateHomepage();
        swagLabsLoginActions.numberofLinks();
        swagLabsLoginActions.numberofBrokenLinks();
    }

    @When("I click on Login and redirect to homepage")
    public void i_click_on_login_and_redirect_to_homepage() {
        //swagLabsLoginActions.gotoHomePage();
        this.redirectToHomepage();
        //swagLabsLoginActions.validateHomepage();
        this.validatingHomepage();
    }
    @Then("I can filter the list from price low to high")
    public void useFilter() {
        swagLabsLoginActions.selectFilter();

    }

    @When("I provide the username and password and login to homepage")
    public void i_provide_the_username_and_password_and_login_to_homepage() {
       this.enterLoginPassword();
       this.redirectToHomepage();
    }
    @When("I filter the displayed product list from low to high")
    public void setFilter() {
        this.useFilter();
    }
    @Then("I select a product")
    public void selectAProduct() {
        swagLabsLoginActions.selectAProduct();
    }
    @Then("I should be able to view product description")
    public void viewProductDescription() {
        //write code for validating product description
        swagLabsLoginActions.validatingProdDescription();
    }

    @Given("I have logged in and have set filter of low to high")
    public void i_have_logged_in_and_have_set_filter_of_low_to_high() {
        this.landingPage();
        this.enterLoginPassword();
        this.redirectToHomepage();
        this.useFilter();
    }
    @When("I am able to view product description")
    public void i_am_able_to_view_product_description() {
        this.viewProductDescription();
    }
    @Then("I validate the price")
    public void i_validate_the_price() {
        swagLabsLoginActions.validatePrice();
    }
    @Then("I click on add to cart to proceed")
    public void i_click_on_add_to_cart_to_proceed() {
        //Write code for adding to cart and redirecting to validate the product is added
        swagLabsLoginActions.addtoCartFromProdDescPage();
    }




}
