package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtils;

public class SearchTests {
    Login_Steps_Definition loginSteps = new Login_Steps_Definition();
    //===================================================================================
    //Scenario Outline: RC-30 Verify user see result after searching with valid credential
    HomePage HP = new HomePage();

    @Given("User is on the Homepage after sign in")
    public void User_is_on_the_Homepage_after_sign_in() {
        loginSteps.user_is_on_login_page();
        loginSteps.user_enters_valid_and_and_clicks_sign_in("Ulugbek", "SuperUlugbek123!");
        //verify if page is display label
        Assert.assertTrue(HP.labelHome.isDisplayed());
    }

    @When("user enters a value {string} for Symbol and actual {string}")
    public void user_enters_a_value_orpr_for_symbol_and_actual_date(String symbol, String date) {
       BrowserUtils.JDBCexecuteQuery("INSERT INTO records values('43452','1','2','ORPR','2021-11-11','1.23','2021-11-11','1.23','13.4')");
        HP.symbolInput.sendKeys(symbol);
        HP.dateInput.sendKeys(date);
    }

    @And("user click Search,")
    public void user_click_search() {
        HP.searchButton.click();
    }

    @Then("user should be able to filter on the listed trades.")
    public void user_should_be_able_to_filter_on_the_listed_trades() {
        Assert.assertEquals(HP.secondColomFirsRowFromTable.getText(), "ORPR");
        BrowserUtils.JDBCexecuteQuery("DELETE FROM records WHERE id='43452'");
    }

    //===========================================================================================================
    // Scenario Outline: RC-34 Verify user see empty page after searching with invalid credential (empty inputs)
    @When("verify if input field symbol and date is empty")
    public void verify_if_input_field_symbol_and_date_is_empty() {
        Assert.assertTrue(HP.symbolInput.getText().isEmpty());
        Assert.assertTrue(HP.dateInput.getText().isEmpty());
    }

    @Then("user should be able to see all existing stocks")
    public void user_should_be_able_to_see_onle_header_of_table() {
        Assert.assertTrue(HP.headerOfTable.isDisplayed());
        Assert.assertTrue(HP.ListOfAllRowsFromTable.size() != 0);
    }

    //===========================================================================================================
    //Scenario: RC-35 Verification that search functionality elements located according requirements
    @Then("Verify if search button displayed on the page.")
    public void verify_if_search_button_displayed_on_the_page() {
        Assert.assertTrue(HP.searchButton.isDisplayed());
    }

    @Then("Verify if input symbol has default background text.")
    public void verify_if_input_symbol_has_default_background_text() {
        Assert.assertEquals(HP.symbolInput.getAttribute("placeholder"),"Symbol");
    }

    @Then("Verify input date has default background text.")
    public void verify_input_date_has_default_background_text() {
        Assert.assertEquals(HP.dateInput.getAttribute("placeholder"),"Date");

    }

    @Then("Verify search button is Enabled.")
    public void verify_search_button_is_enabled() {
        Assert.assertTrue(HP.searchButton.isEnabled());
    }

    @Then ("System should displays only empty table.")
    public void System_should_displays_only_empty_table(){
        BrowserUtils.verifyElementNotDisplayed(HP.secondColomFirsRowFromTable);
    }

}
