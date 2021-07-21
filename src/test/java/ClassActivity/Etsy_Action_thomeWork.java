package ClassActivity;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EtsyHomePage;
import utilities.BrowserUtils;
import utilities.Driver;

//        Test case:
//        go to Etsy.com
//        Hover Over on Jewelry & Accessories
//        Mouseover on Bags & Purses
//        Mouseover to Shoulder Bags
//        Click on the shoulder bags
//        Verify you are on the Shoulder bags page

public class Etsy_Action_thomeWork {

    EtsyHomePage etsyHP = new EtsyHomePage();
    @Test
    public void eteyTEst(){
//   go to Etsy.com
        Driver.get().get("https://www.etsy.com/");
 //   Hover Over on Jewelry & Accessories
        BrowserUtils.hoverToElement(etsyHP.jewelryAccessories);
//   Mouseover on Bags & Purses
        BrowserUtils.waitForVisibility(etsyHP.bagsPurses,2);
        BrowserUtils.hoverToElement(etsyHP.bagsPurses);
//        Mouseover to Shoulder Bags
        BrowserUtils.hoverToElement(etsyHP.ShoulderBags);
//        Click on the shoulder bags
       etsyHP.ShoulderBags.click();
//        Verify you are on the Shoulder bags page
        Assert.assertEquals(Driver.get().getTitle(),"Shoulder Bags | Etsy");

        Driver.closeDriver();
    }
}
