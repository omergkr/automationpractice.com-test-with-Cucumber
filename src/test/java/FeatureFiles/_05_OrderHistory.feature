Feature:  Order History Functionality


  Background:
    Given Navigate to automationpractice
    When Enter username and password and click Login button

  Scenario: Order History Page
    Given Navigate to Specials
    And   Click Add to Cart and click proceed checkout three times
    Then Click I agree  and click proceed checkout
    When Click to pay and comfirm
    And Clic My Orders check product price
    Then Check ordered product name
    And Check add a mesage



