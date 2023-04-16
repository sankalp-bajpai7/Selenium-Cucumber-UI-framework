Feature: Validate PHP Travels website
  I want to validate the PHP Travels website using advanced java programming concepts

  @advancedFWConcepts @Test
  Scenario: Validate PHP Travels website
    Given I want to load PHP Travels website
    When I land on the home page of PHP Travels
    And verify all the web elements of the PHP Travels
    Then I validate the outcomes of all the webpage features for PHP Travels


  @PHPPricing @Test
  Scenario: Validate the pricing page of PHP Travels Website
    Given I want to load PHP Travels website
    When I land on the pricing page of PHP Travels
    Then I should be displayed with the sections containing different pricing options
    When I scroll down to the features info section of the booking software
    Then I should be able to see the FAQs section with various questions
    When I navigate to the footers section
    Then I should be abel to verify all the footer links
