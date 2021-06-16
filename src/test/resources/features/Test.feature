Feature: Search something

  Scenario: Verify search cucumber

    Given user in google.com home page
    When  user search cucumber press enter
    Then  page should display search result