Feature: Get a user
  Me as a user
  I want to get a account
  To verify  the functioning of the service

  Background:
    * url baseUrl

  Scenario Outline: Get a user
    Given path "user", userName
    When method GET
    And status 200
    Then match $.id == id

    Examples:
      | userName!   | id! |
      | pepitoBack  | 101 |
      | pepitoBack1 | 102 |
      | pepitoBack2 | 103 |

  Scenario Outline: Get a user with Not Found
    Given path "user", userName
    When method GET
    And status 404
    Then match $.message == "User not found"

    Examples:
      | userName!            |
      | pepitoBacks          |
      | pepiasdasdasdtoBack1 |
      | pepitoasdasdBack2    |