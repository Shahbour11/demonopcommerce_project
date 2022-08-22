@smoke
Feature: Wishlist


  Scenario: F08_Wishlist | users could add an item to their wishlist
    Given User add an item to wishlist
    Then  user will see a green success message

  Scenario: Check the wishlist
    Given User add an item to wishlist
    When  User waits after adding the item
    And   User navigates to his wishlist
    Then  The quantity value is greater than zero