$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AmazonShoppingCart.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Amazon Shopping Cart functionality",
  "description": "",
  "id": "validate-amazon-shopping-cart-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Validate search item and add item to shopping cart",
  "description": "",
  "id": "validate-amazon-shopping-cart-functionality;validate-search-item-and-add-item-to-shopping-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@TC5"
    },
    {
      "line": 7,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User search the \"\u003citem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User select one of the item from search results",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User will add the item to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Cart link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Validate that added item is displayed in Cart screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "validate-amazon-shopping-cart-functionality;validate-search-item-and-add-item-to-shopping-cart;",
  "rows": [
    {
      "cells": [
        "item"
      ],
      "line": 16,
      "id": "validate-amazon-shopping-cart-functionality;validate-search-item-and-add-item-to-shopping-cart;;1"
    },
    {
      "cells": [
        "masks"
      ],
      "line": 17,
      "id": "validate-amazon-shopping-cart-functionality;validate-search-item-and-add-item-to-shopping-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "Open the URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDefinition.navigateToURL()"
});
formatter.result({
  "duration": 6638123499,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate search item and add item to shopping cart",
  "description": "",
  "id": "validate-amazon-shopping-cart-functionality;validate-search-item-and-add-item-to-shopping-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Smoke"
    },
    {
      "line": 7,
      "name": "@TC5"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User search the \"masks\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User select one of the item from search results",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User will add the item to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Cart link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Validate that added item is displayed in Cart screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "masks",
      "offset": 17
    }
  ],
  "location": "AmazonHomePageStepDefinition.searchItems(String)"
});
formatter.result({
  "duration": 3392463600,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearchResultsPageStepDefinition.selectItemFromSearchResults()"
});
formatter.result({
  "duration": 4559370300,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearchResultsPageStepDefinition.addItemToCart()"
});
formatter.result({
  "duration": 1797570200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageStepDefinition.navigateToAmazonCart()"
});
formatter.result({
  "duration": 1570509700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonShoppingCartPageStepDefinition.validateItemInShoppingCartPage()"
});
formatter.result({
  "duration": 94589000,
  "error_message": "java.lang.AssertionError: Item is not added to shopping cart\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.amazon.practice.stepdefinitions.AmazonShoppingCartPageStepDefinition.validateItemInShoppingCartPage(AmazonShoppingCartPageStepDefinition.java:27)\r\n\tat ✽.Then Validate that added item is displayed in Cart screen(features/AmazonShoppingCart.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 4190667100,
  "status": "passed"
});
});