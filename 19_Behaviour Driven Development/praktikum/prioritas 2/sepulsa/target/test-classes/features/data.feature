Feature: Data Packages
  As a user
  I want to see my home page
  So that I can buy data package products

  Scenario: As a user I need to be able to login successfully
    Given I am on the login page1
    When I click product data plan
    And I can enter a telephone number
    And I can choose a data package
    And I can go directly to the payment page2
    Then I managed to purchase a data package