Feature: PLN electricity
  As a user
  I want to see my home page
  So that I can buy electricity tokens or pay bills

  Scenario: As a user I need to be able to login successfully
    Given I am on the login page4
    When I click on PLN electricity products
    And I can input the customer id number
    And I can input the teletree number1
    And I can go directly to the payment page4
    Then I managed to make a purchase of electricity tokens