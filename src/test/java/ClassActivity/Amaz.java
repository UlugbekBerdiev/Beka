package ClassActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

/*
* Test case 001
* 
*
*
*
*
* */

public class Amaz {

    @Test
    public void searchTests(){
        Driver.get().get("https://www.amazon.com");
        List<WebElement> elements = Driver.get().findElements(By.xpath("//"));

    }
}
