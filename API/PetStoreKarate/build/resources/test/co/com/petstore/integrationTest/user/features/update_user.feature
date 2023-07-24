Feature: Update a user
  Me as a user
  I want to update a user
  To verify  the functioning of the service

  Background:
    * url baseUrl
    * request read('classpath:co/com/petstore/integrationTest/user/requests/user-req.json')

  Scenario Outline: Update a user
    Given path "user", userName
    When method PUT
    And status 200
    Then match $.code == 200

    Examples:
      | id! | userName!   | firstName!   | lastName! | email!                 | password! | number!  |
      | 101 | pepitoBack  | pepitoChange | perez     | correo2@correo.com     | password  | 12312312 |
      | 102 | pepitoBack1 | pepitoCambio | perez     | correoNuevo@correo.com | password  | 12312312 |
      | 103 | pepitoBack2 | pepitoNuevo  | perez     | correoNew@correo.com   | password  | 12312312 |