package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.MagentoLoginActions;
import pageLocators.MagentoLoginPageLocators;

import java.util.Map;

import static stepDefinitions.test.ExecutionPreSetup.getData;
import static stepDefinitions.test.ExecutionPreSetup.scenarioName;

public class MagentoLoginSteps {

    MagentoLoginActions mLoginAction = new MagentoLoginActions();
    MagentoLoginPageLocators mPageLocators = new MagentoLoginPageLocators();
    private Map<String, Object> scenarioData;




    @Given("I want to navigate to the Magento home page")
    public void i_want_to_navigate_to_the_magento_home_page() {
        try {
            mLoginAction.navigatetoHomePage();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }



    @And("I click on SignIn link on the top navigation")
    public void i_click_on_sign_in_link_on_the_top_navigation() {
        mLoginAction.navigatetoLoginPage();


    }
    @Then("I should be navigated to Login Page")
    public void i_should_be_navigated_to_login_page() {


    }
    @When("I enter valid credentials and click on the SignIn button")
    public void i_enter_valid_credentials_and_click_on_the_sign_in_button() {
        mLoginAction.enterEmailPassword();



    }
    @Then("I should be displayed with the Dashboard page")
    public void i_should_be_displayed_with_the_dashboard_page() throws InterruptedException {

        mLoginAction.navigatetoDashboardPage();
      //  mLoginAction.scrolltoNewsletter();
        mLoginAction.selectMenJackets();
        //mLoginAction.validateFooterLinks();
    }

}
