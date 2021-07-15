$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/resources/Amazon.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "As a user, I should not be directed to password field when I provide invalid user email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I am on the amazon signin page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazoneTest.i_am_on_the_amazon_signin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid user email \"jon.dow@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "AmazoneTest.i_enter_invalid_user_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazoneTest.i_clicked_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An error message \"There was a problem\" should display",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazoneTest.an_error_message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The password field should not display",
  "keyword": "But "
});
formatter.match({
  "location": "AmazoneTest.the_password_field_should_not_display()"
});
formatter.result({
  "status": "passed"
});
});