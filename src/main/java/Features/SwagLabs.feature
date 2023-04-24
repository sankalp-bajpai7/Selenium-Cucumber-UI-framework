Feature: Swag-labs automation scenarios

  @SwagLabsLogin
  Scenario:Validate if customer is able to click on a product and read its details
    Given I am on landing page for swag labs
    When I provide the username and password and login to homepage
    And I filter the displayed product list from low to high
    Then I select a product
    And I should be able to view product description