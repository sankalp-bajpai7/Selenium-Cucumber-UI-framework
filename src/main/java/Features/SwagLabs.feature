Feature: Swag-labs automation scenarios


  @SwagLabsLogin
  Scenario:Validate if customer is able to login to the Swag Labs
    Given I am on landing page for swag labs
    When I provide the username and password
    And I click on Login
    Then I should be displayed the swag labs landing page

  @SwagLabsLogin
  Scenario:Find the number of links on the landing page
    Given I am on landing page for swag labs
    When I provide the username and password
    And I click on Login
    Then I should be displayed the swag labs landing page and calculate the number of links on the page

  @SwagLabsLogin
  Scenario:Filter the list from price low to high
    Given I am on landing page for swag labs
    When I provide the username and password
    And I click on Login and redirect to homepage
    Then I can filter the list from price low to high


  @SwagLabsLogin
  Scenario:Validate if customer is able to click on a product and read its details
    Given I am on landing page for swag labs
    When I provide the username and password and login to homepage
    And I filter the displayed product list from low to high
    Then I select a product
    And I should be able to view product description

  @SwagLabsLogin
  Scenario:Validate if customer is able to redirect to product details and add to cart
    Given I have logged in and have set filter of low to high
    When I select a product
    And I am able to view product description
    Then I validate the price
    And I click on add to cart to proceed