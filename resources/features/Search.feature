@Smoke
Feature: RC-6 Search Functionality
 #at least 1 trade has been entered by the user. ORPR data 06/12/2021.

  Scenario: RC-30 Verify user see result after searching with valid credential

    Given User is on the Homepage after sign in
    When user enters a value "ORPR" for Symbol and actual "11112021"
    And user click Search,
    Then user should be able to filter on the listed trades.

  Scenario: RC-34 Verify user see empty page after searching with invalid credential (empty inputs)
    Given User is on the Homepage after sign in
    When verify if input field symbol and date is empty
    And user click Search,
    Then user should be able to see all existing stocks

  Scenario: RC-35 Verification that search functionality elements located according requirements

    Given User is on the Homepage after sign in
    Then Verify if search button displayed on the page.
    Then Verify if input symbol has default background text.
    Then Verify input date has default background text.
    Then Verify search button is Enabled.


  Scenario: RC-33 Verify if user sees empty page after searching with credentials that does not exist in table

    Given User is on the Homepage after sign in
    When user enters a value "JHDKS" for Symbol and actual "11112021"
    And user click Search,
    Then System should displays only empty table.