package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Properties;

public class Test_getDriver {

    public static void main(String[] args) throws InterruptedException {


         Driver.get().get("https://juliemr.github.io/protractor-demo/");

        inputFistSecond(10, 20);
        Thread.sleep(2000);
        verifyHeader("30");

    }
    @Test
    public void test1(){
        Assert.assertEquals(inputFistSecond(10, 50), "60");
    }

    static String inputFistSecond(int one, int two){
        String a = one+"";
        String b = two+"";

        Driver.get().findElement(By.xpath("//input[@ng-model= 'first']")).sendKeys(a);
        Driver.get().findElement(By.xpath("//input[@ng-model= 'second']")).sendKeys(b);
        Driver.get().findElement(By.xpath("//button[@ng-click = 'doAddition()']")).click();
        WebElement header = Driver.get().findElement(By.xpath("//h2"));
        return header.getText();
    }

    static void verifyHeader(String expected){
        WebElement header = Driver.get().findElement(By.xpath("//h2"));
        Assert.assertEquals(header.getText(), expected);
    }


}
