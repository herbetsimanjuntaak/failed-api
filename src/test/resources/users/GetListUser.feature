@GoRest @getListUser

Feature: Get List of Users API
  As a user of the GoRest API
  I want to retrieve a list of users
  So that I can view user data

  Scenario: Get list of users with a valid endpoint
    Given sends a GET request to the "https://gorest.co.in/public/v2/users" endpoint
    Then status code should be 200