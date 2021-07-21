package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.Demoqa;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SpesDefenition {
//close driver make it null after each scenario
//    @After
//    public void close(){
//        Driver.get().quit();
//    }

//Scenario-1 step 1================================================================================================
    @Given("user in main page Demoqa.com")
    public void getMainPage(){
        Driver.get().get(ConfigurationReader.get("url"));
        new Demoqa().setup();
    }

    @ When   ("user click to Elements link")
    public void clickToElements(){
        new Demoqa().clickToElements();
    }

    @ Then    ("user should get in to the page Elements adn see header Elements")
    public void verifyElementsPage(){
        String header = Driver.get().findElement(By.xpath("//div[@class= 'main-header']")).getText();
       Assert.assertEquals(header, "Elements");
        Driver.get().navigate().back();
    }
//Scenario-1 step 2================================================================================================

    @ When    ("user click to Forms link")
    public void clickToForms(){
        new Demoqa().clickToForms();
    }

    @ Then   ("user should get in to the page Forms and see header Forms")
    public void verifyFormsPage(){
        String header = Driver.get().findElement(By.xpath("//div[@class= 'main-header']")).getText();
        Assert.assertEquals(header, "Forms");
        Driver.get().navigate().back();
    }
//Scenario-1 step 3================================================================================================
    @ When    ("user click to Alert link")
    public void clickToAlert(){
        new Demoqa().clickToAlert();
    }

    @ Then   ("user should get in to the page Alert and see header Alert")
    public void verifyAlertPage(){
        String header = Driver.get().findElement(By.xpath("//div[@class= 'main-header']")).getText();
        Assert.assertEquals(header, "Alerts, Frame & Windows");
        Driver.get().navigate().back();
    }
//Scenario-1 step 4================================================================================================
}
