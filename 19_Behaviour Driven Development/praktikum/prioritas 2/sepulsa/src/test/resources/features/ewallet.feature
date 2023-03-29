Feature: e-wallet
  As a user
  I want to see my home page
  So that I can top up my e-wallet

  Scenario: As a user I need to be able to login successfully
    Given I am on the login page2
    When I click on electronic money products
    And I can choose the type of electronic money
    And I can enter a telephone number1
    And I can choose the nominal top up type
    And I can go directly to the payment page3
    Then I managed to top up electronic money