package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonHP;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonSearchDataProvider {

    AmazonHP amazonHp = new AmazonHP();

    @AfterTest
    public void close() {
        Driver.get().quit();
    }
//    Test case:
//    go to amazon.com
//    verify that you are on the home page
//    search {testdata} and click search
//    wait for the element to be visible - this could be any searched item or the any text unique to the search.
//    get text of the search criteria text element
//    verify it matches the search input
//    TestData:
//    coffee mug
//    pretty coffee mug
//    cool coffee mug
//    cute coffee mug

    @DataProvider
    public Object[] data(){
        Object[] data = new String[]{"coffee mug","pretty coffee mug", "cool coffee mug", "cute coffee mug" };

        return data;
    }
    @Test(dataProvider ="data")
    public void verifySearchREsult(String input){
        Driver.get().get("https://amazon.com");
        amazonHp.searchInputBox.sendKeys(input);
        amazonHp.searchButton.click();

           }

}
