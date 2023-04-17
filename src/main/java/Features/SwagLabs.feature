Feature: Swag-labs automation scenarios

  @SwagLabsLogin
  Scenario:Validate if customer is able to login to the Swag Labs
    Given I am on landing page for swag labs
    When I provide the username and password
    And I click on Login
    Then I should be displayed the swag labs landing page