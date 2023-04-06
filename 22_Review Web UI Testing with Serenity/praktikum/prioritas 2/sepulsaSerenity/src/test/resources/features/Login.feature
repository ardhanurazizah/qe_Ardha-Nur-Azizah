Feature: As a user
  I have successfully logged in
  so that I can see the product page

  @PositiveLogin
  Scenario: as a user I want to enter valid for then I can see successful login
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    Then user is on the product page

  @PositiveVoucherGame
  Scenario: as a user I want to buy a game voucher product
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    And user click on the game voucher product
    And user click on the voucher menu
    And user click on the selected voucher type
    And user fill in the phone number voucher
    And user click on the selected voucher package
    And user to the payment page voucher
    Then user see the total payment voucher

  @PositivePulsa
  Scenario: as a user I want to buy pulse products
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    And user click pulse product
    And user fill in the phone number
    And user click on the pulse package
    And user to the payment page
    Then user see the total payment

  @NegativePulsa
  Scenario: as a user I failed to buy pulse products
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    And user click pulse product
    And user fill in the excess phone number
    Then user see an error message

  @NegativeVoucherGame
  Scenario: as a user I failed to purchase a game voucher product
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    And user click on the game voucher product
    And user click on the voucher menu
    And user click on the selected voucher type
    And user fill in the excess cellphone number
    Then user see an error message voucher

  @PositivePaymentMethod
  Scenario: as a user I can choose a payment method when buying credit products
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    And user click pulse product
    And user fill in the phone number
    And user click on the pulse package
    And user to the payment page
    Then user see the total payment
    And user chooses a payment method
    Then user successfully select a payment method and click pay now

  @NegativePaymentMethod
  Scenario: as a user I failed to buy credit products and can't choose payment method
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    And user click pulse product
    And user fill in the excess phone number
    Then user see an error message
    Then user cannot go to the payment page and choose a payment method

  @NegativeLogin1
  Scenario: as a user I want to enter invalid for then I can see failed login1
    Given user on main page
    When user click login button
    And user on the login page
    And user enter an invalid email
    And user enter an invalid password
    And user click the login button
    Then user see error message

  @NegativeLogin2
  Scenario: as a user I want to enter invalid for then I can see failed login2
    Given user on main page
    When user click login button
    And user on the login page
    And user enter an invalid email
    And user enter a valid password
    And user click the login button
    Then user see error message

  @NegativeLogin3
  Scenario: as a user I want to enter invalid for then I can see failed login3
    Given user on main page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter an invalid password
    And user click the login button
    Then user see error message

