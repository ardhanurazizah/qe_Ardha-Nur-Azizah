Feature: PDAM
  As a user
  I want to see my home page
  So that I can pay PDAM bills

  Scenario: As a user I need to be able to login successfully
    Given I am on the login page3
    When I click on PDAM product
    And I can enter the customer number
    And I can enter a telephone number2
    And I can click check bill
    And I can go directly to the payment page6
    Then I managed to make PDAM bill payments