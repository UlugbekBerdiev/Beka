@Smoke
Feature: Logout functionality

  Scenario: User successfully log out from system

    Given User is on the Homepage after sign in
    When  User clicks on LogOut button
    Then  User should be directed on LogOut confirmation page
    And   User should see header "Are you sure you want to log out?"
    When  User clicks on LogOut Confirmation button
    Then  User should be directed to Log In page
    And   User should see message "You have been signed out"

  Scenario: System should allow user to stay Logged In if user navigates back from Logout confirmation page

    Given User is on the Homepage after sign in
    When  User clicks on LogOut button
    Then  User should be directed on LogOut confirmation page
    When  User click navigate back and refreshes page
    Then  User should stay on home page.


