Feature: Create a user
  Me as a user
  I want to create a account
  To verify  the functioning of the service

  Background:
    * url baseUrl
    * request read('classpath:co/com/petstore/integrationTest/user/requests/user-req.json')

  Scenario Outline: Create account
    Given path 'user'
    When method POST
    And status 200
    Then match $.code == 200

    Examples:
      | id! | userName!   | firstName! | lastName! | email!            | password! | number!  |
      | 101 | pepitoBack  | pepito     | perez     | correo@correo.com | password  | 12312312 |
      | 102 | pepitoBack1 | pepito     | perez     | correo@correo.com | password  | 12312312 |
      | 103 | pepitoBack2 | pepito     | perez     | correo@correo.com | password  | 12312312 |