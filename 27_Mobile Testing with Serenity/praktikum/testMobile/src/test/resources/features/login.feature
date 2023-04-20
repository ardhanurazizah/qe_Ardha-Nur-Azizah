Feature: As a user i have be able to login so that i can see home screen

  @Register
  Scenario: As a user I can register until it is successful
    Given user on login page
    When user click create one
    And user enter a valid name
    And user enter a valid email
    And user enter a valid password
    And user enter a valid confirm password
    And user click on the register button
    Then user see message "Registration Succesful"

  @LoginNegative1
  Scenario: As a user i cant login because i input invalid password
    Given user on login page
    When user input valid username
    And user input invalid password
    And user click login button
    Then user see error message "Wrong Email or Password"

  @LoginNegative2
  Scenario: As a user i cant login because i input invalid password and email
    Given user on login page
    When user input invalid username
    And user input invalid password
    And user click login button
    Then user see error message "Wrong Email or Password"

  @LoginPositive
  Scenario: As a user i can login because i input valid password and email
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
#    Then user on home page

  @HomePage
  Scenario: As a user I can go to home page
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
#    Then user on home page
#    And user see name account
    And user see email account
    And user see password account
