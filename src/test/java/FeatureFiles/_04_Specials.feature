

Feature: Specials Functionality

Background:
  Given Navigate to automationpractice
  When Enter username and password and click Login button

  Scenario: Specials Page

    Given Navigate to Specials
    When  Check the number of  products
    Then  Check lowest price
    And   Check Product Name A to Z

