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
    public void i_am_on_landing_page_for_swag_labs() {
        try {
            swagLabsLoginActions.navigatetoHomePage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("I provide the username and password")
    public void i_provide_the_username_and_password() {
        swagLabsLoginActions.enterUsernameandPassword();
    }


    @And("I click on Login")
    public void i_click_on_login() {
        swagLabsLoginActions.gotoHomePage();
    }


    @Then("I should be displayed the swag labs landing page")
    public void i_should_be_displayed_the_swag_labs_landing_page() {
        swagLabsLoginActions.validateHomepage();
    }



}
