Feature: Recommendations
  As a user
  I want to add network
  So that I can follow others based on recommendations

  Scenario: As user I have be able to success login
    Given I am on the main page 1
    When I click the arrow in the message
    And I can search for users
    And I can click the send message button
    And I can fill in the message to be sent
    And I can click the submit button
    Then I have successfully sent the message