Feature: Pulsa
  As a user
  I want to see my home page
  So that I can buy credit products

  Scenario: As a user I need to be able to login successfully
    Given Remember me on login page
    When I click the pulsa product
    And I can input the telephone number
    And I can choose a nominal pulse
    And I can click on the nominal chosen
    And I can go directly to the payment page
    Then I managed to make a credit product purchase