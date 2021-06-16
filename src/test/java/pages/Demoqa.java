package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Demoqa {
//================================================================================================
    public  void setup(){

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

    }
//================================================================================================


   //click to Elements button in main page Demoqa.com
    public void clickToElements(){
        Driver.get().findElement(By.xpath("//h5[contains(text(), 'Elements')]/parent::div/parent::div/parent::div")).click();
    }
    //click to Forms button in main page Demoqa.commvn
    public void clickToForms(){
        Driver.get().findElement(By.xpath("//h5[contains(text(), 'Forms')]/parent::div/parent::div/parent::div")).click();
    }
    //click to Alert button in main page Demoqa.com
    public void clickToAlert(){
        Driver.get().findElement(By.xpath("//h5[contains(text(), 'Alert')]/parent::div/parent::div/parent::div")).click();

    }


}
