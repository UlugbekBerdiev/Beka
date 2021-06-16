package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class AlertPract {
    @Test
    public void alertClik() throws InterruptedException {
//        Test case 1
//        go to https://demoqa.com/alerts
//        Click on the ClickMe button for the first Alert,  getText then verify the text is
//        "You clicked a button" and Accept the alert.
        Driver.get().get("https://demoqa.com/alerts");
        Thread.sleep(1000);
        Driver.get().findElement(By.cssSelector("[id=alertButton]")).click();
        String actual1 = Driver.get().switchTo().alert().getText();
        String expect2 = "You clicked a button";
        Driver.get().switchTo().alert().accept();
        Assert.assertEquals(actual1,expect2 );
//        Test case 2
//        go to https://demoqa.com/alerts
//        Click on the ClickMe button for the second Alert,  getText then verify the text is
//        "This alert appeared after 5 seconds" and Accept the alert.

        Driver.get().findElement(By.cssSelector("[id=timerAlertButton]")).click();
          Thread.sleep(6000);
        String actual = Driver.get().switchTo().alert().getText();
        String expect = "This alert appeared after 5 seconds";
        Driver.get().switchTo().alert().accept();
        Assert.assertEquals(actual,expect );

//        Test case 3
//        go to https://demoqa.com/alerts
//        Click on the ClickMe button for the third Alert,  getText then verify the text is
//        "Do you confirm action?" and Dismiss the alert.

        Driver.get().findElement(By.cssSelector("[id=confirmButton]")).click();
        Thread.sleep(1000);
        String actual2 = Driver.get().switchTo().alert().getText();
        String expect3 = "Do you confirm action?";
        Driver.get().switchTo().alert().accept();
        Assert.assertEquals(actual2,expect3 );

//        Test case 4
//        go to https://demoqa.com/alerts Click on the ClickMe button for the last Alert,
//        getText then verify the text is "Please enter your name" then enter your name and accept.

        Driver.get().findElement(By.cssSelector("[id=promtButton]")).click();
        Thread.sleep(1000);
        String actual3 = Driver.get().switchTo().alert().getText();
        String expect4 = "Please enter your name";
        Driver.get().switchTo().alert().sendKeys("Beka");
        Assert.assertEquals(actual3,expect4 );


    }
}
