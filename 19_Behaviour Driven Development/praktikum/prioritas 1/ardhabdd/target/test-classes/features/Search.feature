Feature: Search
  As a user
  I want to see the main page
  So that I can look for jobs or other users

  Scenario: As user I have be able to success login
    Given I am on the e page
    When I click the search section
    And I entered username or job
    And will display related searches
    Then I click the found user/job