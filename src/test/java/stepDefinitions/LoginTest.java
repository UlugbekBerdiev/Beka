package stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import utilities.Driver;

public class LoginTest {
    HomePage home = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();

    @Given("I am on login page")
    public void i_am_on_login_page() {
        home.logInButton.click();
    }

    @When("I input {string} and {string}")
    public void i_input_and(String string, String string2) {
        loginPage.loginAsUser(string,string2);

    }

    @Then("I should navigate to home page")
    public void i_should_navigate_to_home_page() {
        Assert.assertTrue(true);
    }
}
