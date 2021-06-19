package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.Driver;
import utils.PropertiesReader;

public class Login_Steps_Definition {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(PropertiesReader.getProperty("url"));
        Assert.assertEquals("Please sign in", loginPage.mainLogInHeader.getText());
    }
    @When("User enters valid {string} and {string} and clicks SignIn")
    public void user_enters_valid_and_and_clicks_sign_in(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.signInButton.click();
    }
    @Then("User should be directed to home page")
    public void user_should_be_directed_to_home_page() {
        Assert.assertEquals(homePage.pageTitle,Driver.getDriver().getTitle());
    }

    @When("User enters invalid {string} and {string} and clicks SignIn")
   public void user_enters_invalid_and_and_clicks_sign_in(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.signInButton.click();
    }
    @Then("User should see alert message {string} and stay on login page")
    public void user_should_see_alert_message_and_stay_on_login_page(String message) {
        Assert.assertEquals(loginPage.alertMessage.getText(),message);
    }


}
