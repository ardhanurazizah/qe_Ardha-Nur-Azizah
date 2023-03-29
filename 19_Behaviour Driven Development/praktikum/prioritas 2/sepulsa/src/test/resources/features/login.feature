Feature: Login
  As a user
  I want to see my home page
  So that I can trade

  Scenario: As a user I need to be able to login successfully
    Given Remember me on the login page
    When I enter my email or telephone and password correctly
    And I clicked the login button
    Then I'm on the home page