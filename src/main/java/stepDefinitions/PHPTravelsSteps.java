package stepDefinitions;

import frameworkUtils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.PHPTravelActions;

public class PHPTravelsSteps  {

    PHPTravelActions phpTravelActions = new PHPTravelActions();
    BaseClass bc = new BaseClass();

    @Given("I want to load PHP Travels website")
    public void i_want_to_load_php_travels_website() throws InterruptedException {
        phpTravelActions.navigateHomePage();

    }
    @When("I land on the home page of PHP Travels")
    public void i_land_on_the_home_page_of_php_travels() throws InterruptedException {

        phpTravelActions.navigateHomePage();

    }
    @When("verify all the web elements of the PHP Travels")
    public void verify_all_the_web_elements_of_the_php_travels() {


    }
    @Then("I validate the outcomes of all the webpage features for PHP Travels")
    public void i_validate_the_outcomes_of_all_the_webpage_features_for_php_travels() {

        System.out.println("implemented success");
    }


    @When("I land on the pricing page of PHP Travels")
    public void i_land_on_the_pricing_page_of_php_travels() throws InterruptedException {
        phpTravelActions.navigatePricingPage();

    }
    @Then("I should be displayed with the sections containing different pricing options")
    public void i_should_be_displayed_with_the_sections_containing_different_pricing_options() {
        phpTravelActions.validatePricingHeader();


    }
    @When("I scroll down to the features info section of the booking software")
    public void i_scroll_down_to_the_features_info_section_of_the_booking_software() {

        phpTravelActions.scrollDowntoFeatures();
    }
    @Then("I should be able to see the FAQs section with various questions")
    public void i_should_be_able_to_see_the_fa_qs_section_with_various_questions() {
        phpTravelActions.validateFAQ();

    }
    @When("I navigate to the footers section")
    public void i_navigate_to_the_footers_section() {
        phpTravelActions.validateFooters();

    }
    @Then("I should be abel to verify all the footer links")
    public void i_should_be_abel_to_verify_all_the_footer_links() {

        phpTravelActions.validateFooterLinks();
    }

}
