@Beka
Feature:  Log in
  As a user i should be able to
  log in using valid user credentials

  Scenario Outline: Login using valid user credentials

    Given  I am on login page
    When  I input "<username>" and "<password>"
    Then  I should navigate to home page
    Examples:

      | username                   | password       |
      | andre.cartwright@gmail.com | SecretWord1234 |
      | latia.howell@gmail.com     | SecretWord1234 |
      | latia.howell@gmail.com     | SecretWord1234 |


