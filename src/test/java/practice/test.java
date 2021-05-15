package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Demoqa;
import utilities.ConfigurationReader;
import utilities.Driver;

public class test {

    @Test
    public void clickToElements(){
        Driver.get().get(ConfigurationReader.get("url"));
       Driver.get().findElement(By.xpath("//h5[contains(text(), 'Elements')]/parent::div/parent::div/parent::div")).click();
        Actions act = new Actions(Driver.get());

    }
}
