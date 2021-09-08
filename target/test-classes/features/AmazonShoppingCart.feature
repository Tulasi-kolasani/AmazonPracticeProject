Feature: Validate Amazon Shopping Cart functionality

  Background: Open the URL
    Given I navigate to the URL


  @TC5 @Smoke
  Scenario Outline: Validate search item and add item to shopping cart
    Then User search the "<item>"
    Then User select one of the item from search results
    Then User will add the item to cart
    Then User clicks on Cart link
    Then Validate that added item is displayed in Cart screen

    Examples:
      |item|
      |masks|