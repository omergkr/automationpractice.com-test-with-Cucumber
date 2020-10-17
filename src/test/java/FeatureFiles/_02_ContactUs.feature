
Feature: ContactUs Functionality

Background:

  Given Navigate to automationpractice

  When Enter username and password and click Login button


  Scenario Outline: Contact us
    Given Navigate to ContactUs
    When  Select to subject Heading and check the Message
    Then  Click to send and check the Message
    And   Write the Message as "<Text>" and send and check the Message

Examples:
    |Text|
    |Könnten Sie mir helfen?|







