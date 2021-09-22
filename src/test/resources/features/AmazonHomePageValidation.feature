Feature: Validate Amazon home page functionality

  Background: Open the URL
    Given I navigate to the URL

  @TC1 @Smoke
  Scenario:  Validate the Amazon primary products
    Then I get all the Amazon products list
    Then I validate the product list is correct or not

  @TC2 @Smoke
  Scenario:  Validate the home page Carousel links are working or not
    Given I validate the home page Carousel functionality

  @TC3 @Smoke
  Scenario:  Validate that if user clicks on Sign in button, user navigates to Sign in screen
    When User clicks on Sign in link in homepage
    Then User navigates to Sign in screen

  @TC4 @Smoke
  Scenario:  Validate that if user clicks on Cart link, user navigates to Cart screen
    When User clicks on Cart link
    Then User navigates to Amazon Cart screen

  @TC5 @Smoke
  Scenario:  Validate the language settings in Amazon webpage
    When User clicks on language dropdown
    Then Validate that language selection is working correctly in language settings page