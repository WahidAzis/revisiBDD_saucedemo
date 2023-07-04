@Sales
Feature: Sales feature
  User want add 2 product to cart in souce demo

  Scenario: Add Product to Cart
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page
    When User sort product list by "Name (Z to A)"
    And User add 2 product to cart
    And User click icon cart
