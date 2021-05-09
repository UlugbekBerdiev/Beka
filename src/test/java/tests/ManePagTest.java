package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ManePagTest {

    @BeforeTest
    public void setup(){
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    @AfterTest
    public void close(){
        Driver.get().quit();
    }

    @Test(priority = 1)
    public void verifyPage(){
        String curentUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(curentUrl,ConfigurationReader.get("url") );
    }
    @Test
    public void verify(){
        new MainPage().verifyAfterClickPage(new MainPage().elements, "Elements");
    }
    @Test
    public void verify2(){
        new MainPage().verifyAfterClickPage(new MainPage().forms, "Forms");
    }
    @Test
    public void verify3(){
        new MainPage().verifyAfterClickPage(new MainPage().alertsFrameWindows, "Alerts, Frame & Windows");
    }
    @Test
    public void verify4(){
        new MainPage().verifyAfterClickPage(new MainPage().widgets, "Widgets");
    }
    @Test
    public void verify5(){
        new MainPage().verifyAfterClickPage(new MainPage().interactions, "Interactions");
    }
    @Test
    public void verify6(){
        new MainPage().verifyAfterClickPage(new MainPage().bookStore, "Book Store");
    }
}
