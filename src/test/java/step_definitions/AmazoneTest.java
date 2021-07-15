package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AmazonHP;
import utilities.ConfigurationReader;
import utilities.Driver;


public class AmazoneTest {

    AmazonHP amazonHP = new AmazonHP();
    String priceFromFirstResult;

    @Given("User on the amazon main page")
    public void user_on_the_amazon_main_page() {
      Driver.get().get(ConfigurationReader.get("url"));
      String actualTitle = Driver.get().getTitle();
      Assert.assertEquals("Amazon.com. Spend less. Smile more.",actualTitle);
    }

    @When("User Search for Book {string}")
    public void user_Search_for_Book(String book) {
        amazonHP.searchInputBox.sendKeys(book);
           }

    @When("Click search button")
    public void click_search_button() {
        amazonHP.searchButton.click();
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Amazon.com : qa testing for beginners", actualTitle);
    }

    @Then("User Should be able to click First item in the listed results")
    public void shoud_be_able_to_click_st_item_in_the_listed_results() {
        WebElement FirstSearchResult = Driver.get().findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//span[@class='a-price-whole']"));
        Assert.assertTrue(FirstSearchResult.isDisplayed());
        priceFromFirstResult = FirstSearchResult.getText();
        FirstSearchResult.click();
       }

    @Then("User Should be able to click to add to cart")
    public void shud_be_able_to_click_to_add_to_cart() {
        WebElement addToCartButton = Driver.get().findElement(By.id("add-to-cart-button"));
        WebElement newBuyBoxPrice = Driver.get().findElement(By.id("newBuyBoxPrice"));
        String BoxPrice = newBuyBoxPrice.getText().substring(1,3);
        Assert.assertTrue(addToCartButton.isDisplayed());
        Assert.assertEquals(priceFromFirstResult, BoxPrice);
        addToCartButton.click();
        String titleCart = Driver.get().getTitle();
        Assert.assertEquals("Amazon.com Shopping Cart", titleCart);

    }

    @Then("User should be able to click proceed to checkout")
    public void user_should_be_able_to_click_proceed_to_checkout() {
        WebElement btnProceed_to_checkout = Driver.get().findElement(By.id("hlb-ptc-btn-native"));
        btnProceed_to_checkout.click();
        String titleLogIn = Driver.get().getTitle();
        Assert.assertEquals("Amazon Sign-In", titleLogIn);
    }

}
