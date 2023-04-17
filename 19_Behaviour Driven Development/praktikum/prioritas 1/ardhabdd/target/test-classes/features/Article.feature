Feature: Share Article
  As a user
  I want to share article
  So that I can post article

  Scenario: As user I have be able to success login
    Given I am on the main page
    When I click on the photo menu
    And I can input a title
    And I can add photos
    And I can input the contents of the article
    Then I have successfully posted the article