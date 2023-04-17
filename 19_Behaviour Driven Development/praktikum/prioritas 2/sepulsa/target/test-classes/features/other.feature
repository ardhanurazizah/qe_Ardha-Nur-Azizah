Feature: payment methods
  As a user
  I want to see the transaction page
  So that I can choose a payment method

  Scenario: As a user I need to be able to successfully choose a product
    Given I am on the payment page
    When I click on the selected product
    And I get transaction details
    And I can input the promo code
    And I can choose a payment method
    Then I managed to direct to the selected method