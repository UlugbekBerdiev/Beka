package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class Img_steps {

    @Given("user in main page Amazon.com")
    public void user_in_main_page_Amazon_com() {
        Driver.get().get("https://amazon.com");

    }

    @When("user see on pege")
    public void user_see_on_pege() {
        List<WebElement> listImg = Driver.get().findElements(By.tagName("img"));
        for(WebElement img : listImg){
            Assert.assertTrue(img.getAttribute("naturalWidth").equals("0"));

        }
        throw new cucumber.api.PendingException();
    }

    @Then("all img is showing on the page")
    public void all_img_is_showing_on_the_page() {
       Driver.get().quit();
        throw new cucumber.api.PendingException();
    }
}
