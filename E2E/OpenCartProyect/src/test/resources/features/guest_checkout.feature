Feature: Add product in the cart
  Me as a user
  i want to following the steps of checkout
  To verify the functioning of the page

  Background:
    Given searches the "listA" of product and add to the cart
    When should will see the products with the value in the cart

   Scenario: Fill Guest
     When "personA" fills the steps of checkout
     Then should will see a msg like "Your order has been placed!"