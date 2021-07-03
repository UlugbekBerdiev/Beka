@regression1
Feature:
Scenario: As a user, I should not be directed to password field when I provide invalid user email
Given I am on the amazon signin page
When I enter invalid user email "jon.dow@gmail.com"
And I clicked on continue button
Then An error message "There was a problem" should display
But The password field should not display