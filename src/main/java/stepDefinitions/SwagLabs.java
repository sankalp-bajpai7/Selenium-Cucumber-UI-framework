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
    public void i_filter_the_displayed_product_list_from_low_to_high() {
        this.useFilter();
    }
    @Then("I select a product")
    public void i_select_a_product() {
        swagLabsLoginActions.selectAProduct();
    }
    @Then("I should be able to view product description")
    public void i_should_be_able_to_view_product_description() {
        //write code for validating product description
        swagLabsLoginActions.validatingProdDescription();
    }



}
