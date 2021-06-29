package stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class SingnUpPageTest {

    HomePage home = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();

    @Given("User in create account page")
    public void user_in_create_account_page() throws InterruptedException {
        home.logInButton.click();
        BrowserUtils.waitFor(1);
        BrowserUtils.highlightElement(loginPage.CreateAccount);
        loginPage.CreateAccount.click();
    }

    @When("User fill out all inputs")
    public void user_fill_out_all_inputs() {
        signUpPage.createNewAccounte();

    }


    @Then("User should see page with his name")
    public void user_should_see_page_with_his_name() {
        WebElement actual = Driver.get().findElement(By.xpath("//h2[contains(text(),'"+signUpPage.firstName2+"')]"));
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("User success");
        BrowserUtils.takeSnapShot(Driver.get(), "target/ScreenShots/test.png" );

    }

}