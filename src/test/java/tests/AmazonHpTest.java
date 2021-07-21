package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonHP;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*        Feature: Amazon search.
   Requirement: Perform series of search tests based on the search terms provided (imagine you come up with bunch of search criteria).
   Then verify on the search result page, the search criteria is displayed in results bar.


 * Test case #001
   User in mane page amazon.com
   When user input samsung S20 to search box and hit ENTER
   Then page should displayed result of search
   Check the search results number matches numbers of result displayd on page;
 *
 */

public class AmazonHpTest {

    AmazonHP amazonHp = new AmazonHP();


       @Test
    public void verifyNumberOfResult() {
        //When user input samsung S20 to search box and hit ENTER
        amazonHp.searchInputBox.sendKeys("samsung S20" + Keys.ENTER);

        //Storing result of search to List of Webelements
        List<WebElement> searchResulList = Driver.get().findElements(By.xpath("// div[@data-component-type='s-search-result']"));
        List<WebElement> sponsoredResult = Driver.get().findElements(By.xpath("//span[text()='Sponsored']/parent::span[@class='s-label-popover-default']"));
       //massege displayed on screen ("1-16 of 31 results for "samsung s20 ")
        WebElement numberOFresulDisplayedOnPage = Driver.get().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"));
        //actual number of result without promoutions
        int numberOfactualResult = searchResulList.size() - sponsoredResult.size();
        boolean numOfactualResultEqualNumResultDisplayed = numberOFresulDisplayedOnPage.getText().contains("" + numberOfactualResult);
        //verification of
           Assert.assertTrue(numOfactualResultEqualNumResultDisplayed);


    }
    @BeforeTest
    public void setup() {
        Driver.get().get("https://amazon.com");
        Driver.get().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void close() {
        Driver.get().quit();
    }


}
