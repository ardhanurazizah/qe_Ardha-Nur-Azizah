Feature: Sort
  As a user
  I want to make sort in posts
  So that I can organize posts

  Scenario: As user I have be able to success login
    Given I am on the h page
    When I click the sort section
    And I choose the most recent or most popular sort
    Then I can view posts by the selected sort