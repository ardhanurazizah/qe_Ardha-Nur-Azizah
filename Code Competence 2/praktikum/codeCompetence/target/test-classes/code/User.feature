Feature: User
  As admin
  I want to log in
  So that I can get tokens

  Scenario: Login - As admin I can login
    Given I set the api POST endpoint
    When I send HTTP POST request
    Then I receive a valid HTTP response code 200
    And I received the token

  Scenario: Get all products - As an admin I can get data of all products
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I received the data of all products

  Scenario: Get a single product - As admin I can get one product data
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I received data id 1

  Scenario: Limit results - As admin I can get product limit
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data with a limit of 5

  Scenario: Sort results - As admin I can get product data starting from highest id to lowest
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data with highest id all the way to low

  Scenario: Get all categories - As admin I can get data of all categories
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data of all categories

  Scenario: Get products in a specific category - As an admin I can get all data based on the selected category
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data all by category

  Scenario: Add new product - As admin I can add new data
    Given I set the api POST endpoint
    When I send HTTP POST request
    Then I receive a valid HTTP response code 200
    And I received new data

  Scenario: Update a product - As admin I can edit data
    Given I set the api PUT endpoint
    When I send HTTP PUT request
    Then I receive a valid HTTP response code 200
    And I received edited data

  Scenario: Delete a product - As an admin I can delete data
    Given I set the DELETE api endpoint
    When I send HTTP DELETE request
    Then I receive a valid HTTP response code 200
    And I received the deleted data details

  Scenario: Get all carts - As admin I can get data of all carts
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive the data of all carts

  Scenario: Get a single cart - As an admin I can get a single cart data
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I received data id 5

  Scenario: Limit results - As admin I can get cart limit
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data with a limit of 5

  Scenario: Sort results - As an admin I can get product data from highest id to lowest
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data with highest id all the way to low

  Scenario: Get carts in a date range - As an admin I can get data from a specified date
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data from specified date

  Scenario: Get user carts - As admin I can get all data based on user id
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive all data based on user id

  Scenario: Add new carts - As an admin I can add new data
    Given I set the GET api endpoint
    When I send HTTP POST request
    Then I receive a valid HTTP response code 200
    And I received new data

  Scenario: Update a cart - As an admin I can edit the data
    Given I set the api PUT endpoint
    When I send HTTP PUT request
    Then I receive a valid HTTP response code 200
    And I received edited data

  Scenario: Delete a cart - As an admin I can delete data
    Given I set the DELETE api endpoint
    When I send HTTP DELETE request
    Then I receive a valid HTTP response code 200
    And I received the deleted data details

  Scenario: Get all users- As admin I can get data of all users
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive the data of all users

  Scenario: Get a single user - As admin I can get one user data
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I received data id 1

  Scenario: Limit results user - As admin I can get cart limit
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data with a limit of 5

  Scenario: Sort results user - As an admin I can get product data from highest to lowest id
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive a valid HTTP response code 200
    And I receive data with highest id all the way to low

  Scenario: Add a new user - As admin I can add new data
    Given I set the GET api endpoint
    When I send HTTP POST request
    Then I receive a valid HTTP response code 200
    And I received new data

  Scenario: Update a users - As admin I can edit data
    Given I set the api PUT endpoint
    When I send HTTP PUT request
    Then I receive a valid HTTP response code 200
    And I received edited data

  Scenario: Delete a user - As an admin I can delete data
    Given I set the DELETE api endpoint
    When I send HTTP DELETE request
    Then I receive a valid HTTP response code 200
    And I received the deleted data details
