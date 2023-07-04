@SetOrder
Feature: Place Order
  User want to order product then transaction in saucedemo

  Scenario Outline: Order Product
    #Login Steps
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page

    #Cart & Sales Steps
    When User sort product list by "Name (Z to A)"
    And User add "<productName1>" and "<productName2>" to cart
    And User click icon cart
    Then User already on cart page
    When User remove product "<productName2>"
    And User click checkout button

    #Checkout Steps
    Then User already on Checkout Information Page
    When User input "Wahid" as a firstName, input "Azis" as lastName and input "111" as postCode
    And User click Continue Button
    Then User already on Checkout Overview
    And User click on Finish Button
    And User already on Success Page

    #Logout Steps (Finish)
    And User is already on the last page
    When User click popup menu button
    And User click logout option
    Then User return to login page

  Examples:
      | productName1      | productName2                      |
      | Sauce Labs Onesie | Test.allTheThings() T-Shirt (Red) |