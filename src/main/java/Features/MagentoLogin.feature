@tag
Feature: Magento ECommerce features validation
  This feature file is used for validating the sample ECommerce website given by Magento

  @MagentoLogin
  Scenario: Verify if the customer is able to login properly to Magento
    Given I want to navigate to the Magento home page
    And I click on SignIn link on the top navigation
    Then I should be navigated to Login Page
   	When I enter valid credentials and click on the SignIn button
   	Then I should be displayed with the Dashboard page
