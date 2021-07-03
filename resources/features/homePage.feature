@Smoke @Regression
Feature: Stock Trade homepage components verification


  Scenario: User should be able to be directed to the home page by clicking on logo
  Given User is on the Homepage after sign in
    Then Logo is displayed
    When User clicks on logo
    Then User should be able to be directed to the home page

  Scenario: User should be able to be directed to the home page by clicking on home tab, located to the right side of the logo
    Given User is on the Homepage after sign in
    Then home tab is displayed
    When User clicks on home tab


  Scenario: User should be able to navigate to Finom Group website
    Given User is on the Homepage after sign in
    Then Finom Group tab is displayed
    When User click on Finom Group tab
    Then User should be able to navigate to Finom Group website


  Scenario: User should be able to navigate to  PrimeTech_SDET_Batch1 slack channel.
    Given User is on the Homepage after sign in
    Then Slack Channel tab is displayed
    When User click on Slack Channel tab
    Then User should be able to navigate to PrimeTech_SDET_Batch1 slack channel

  Scenario: User should be able to navigate to Tools dropdown window and navigate to to Options Calculator page
    Given User is on the Homepage after sign in
    Then Tools tab is displayed
    When User click on Tools tab
    Then User should see Tools dropdown window
    And User click on Options Calculator tab
    Then User should be able to navigate to Options Calculator page


  Scenario: User should be able to navigate to Finviz website
    Given  User is on the Homepage after sign in
    Then User click on Tools tab
    When User clicks on Todays Market info tab
    Then User should be able to navigate to Finviz website

  Scenario: User should be able to navigate to Vol ETF/ETN Price converter page
    Given User is on the Homepage after sign in
    And User click on Vol ETF-ETN Price converter tab
    Then User should be able to navigate to Vol ETF-ETN Price converter page


  Scenario: User should be able to see Symbol search box, located to the right side of Tools tab
    Given  User is on the Homepage after sign in
    Then Symbol search box is displayed


  Scenario: User should be able to see textbox mm/dd/yyyy and calender date picker, located to the right side of Symbol search box
    Given  User is on the Homepage after sign in
    Then textbox mm-dd-yyyy and calender date picker is displayed


  Scenario: User should be able to see Search button, located to the right side of textbox mm/dd/yyyy
    Given  User is on the Homepage after sign in
    Then Search button is displayed


  Scenario: User should be able to see Logout button, located to the right side of Search button
    Given  User is on the Homepage after sign in
    Then Logout button is displayed


  Scenario: User should be able to see Add trade button, located underneath the global header.
    Given  User is on the Homepage after sign in
    Then Add trade button is displayed


  Scenario: User should be able to see names of each column on table
    Given  User is on the Homepage after sign in
    Then User should see able to all data table column names
