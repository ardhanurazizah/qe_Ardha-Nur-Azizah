Feature: As a user
  I have be able to success login
  so that i can see products page

  @PositiveLogin
  Scenario: as user i want to input valid to then i can see success login
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    Then user on products page

  @NegativeLogin
  Scenario: as user i want to input invalid username then get error message
    Given user on login page
    When user input invalid username
    And user input valid password
    And user click login button
    Then user see error message

  @PositiveAllItem
  Scenario: as a user I can add products to my shopping cart
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And the user clicks the add to card button in one product
    Then the user can see the number of products in the shopping cart symbol

  @NegativeAllItem
  Scenario: as a user I can add products to my shopping cart
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And the user clicks the add to card button in one product
    And the user click the remove button in one product
    Then the user does not see the number of products in the shopping cart

  @PositiveCheckoutInformation
  Scenario: as a user I can checkout
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And the user clicks the add to card button in one product
    And the user clicks the shopping cart
    And the user to the checkout page
    And the user clicks the checkout button
    And the user to the personal data page
    And the user fills in the first name field
    And the user fills in the last name field
    And the user fills in the postal code field
    And the user clicks the continue button
    And the user on the overview page
    And the user gets the total price
    Then the user successfully checkout by click finish

  @NegativeCheckoutInformation
  Scenario: as a user I can't checkout
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And the user clicks the add to card button in one product
    And the user clicks the shopping cart
    And the user to the checkout page
    And the user clicks the checkout button
    And the user to the personal data page
    And the user clicks the continue button
    And the user see an error first name
    And the user fills in the first name field
    And the user see an error last name
    And the user fills in the last name field
    Then the user see an error postal code