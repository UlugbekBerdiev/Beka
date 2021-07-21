package tests;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonHP;
import pages.IndeedHP;
import pages.IndeedSearchPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class HomeWorkIndeed {
//    Test Case:
//    1. go to indeed.com
//    2. search the data given by the data provider
//    3. wait until the search job location element is displayed.
//    4. verify that your searched job location matches the data from data provider
//    5. find all the job results title, get text, verify it contains the search terms (use soft assert for assertion so that your test won't fail if the job title doesn't match)
//    6. assertAll() to capture all the soft assert error logs if there are any.


    IndeedHP homeIndeed = new IndeedHP();
    IndeedSearchPage searchPage =new IndeedSearchPage();
        @BeforeTest
        public void setup() {

            Driver.get().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        }

        @AfterTest
        public void close() {
            Driver.get().quit();
        }


        @DataProvider
        public Object[][] dataBucket(){
            return new String[][] {
                    {"SDET", "Washington, DC"},
                    {"ux designer", "Chicago, IL"},
                    {"web developer","Pittsburgh, PA"},
                    {"project manager", "Reston, VA"}
            };

        }
        @Test(dataProvider ="dataBucket")
        public void verifySearchREsult(String position, String cityState)  {
 //    1. go to indeed.com
            Driver.get().get(ConfigurationReader.get("url"));
 //    2. search the data given by the data provider
            homeIndeed.WhatsearchInput.sendKeys(position);
            homeIndeed.WheresearchInput.sendKeys(Keys.chord(Keys.CONTROL, "a" + Keys.BACK_SPACE));
            homeIndeed.WheresearchInput.sendKeys(cityState);
            homeIndeed.submit.click();
//    3. wait until the search job location element is displayed.
               BrowserUtils.waitForVisibility(searchPage.jobANDlocation,3);

//    4. verify that your searched job location matches the data from data provider
               String actualText = searchPage.jobANDlocation.getText().replace(" jobs in","");
               String expectedText = position+" "+cityState;
               Assert.assertEquals(actualText, expectedText );
               SoftAssert softAssert = new SoftAssert();


//    5. find all the job results title, get text, verify it contains the search terms
//    (use soft assert for assertion so that your test won't fail if the job title doesn't match)
               for (WebElement title:searchPage.jobtitleList) {
                   softAssert.assertTrue(position.toLowerCase().contains(title.getText().toLowerCase()));
                   softAssert.assertAll();
               }


        }

    }


