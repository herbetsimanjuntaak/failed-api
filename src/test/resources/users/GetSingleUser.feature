@GoRest @getSingleUser

Feature: Get Single User

  Scenario: Get list of users with a valid endpoint
    Given sends a GET request to the "https://gorest.co.in/public/v2/users" endpoint and user id 7598236
    Then status code should be 200