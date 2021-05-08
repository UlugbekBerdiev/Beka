package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


      //1. maximize window.
        driver.manage().window().maximize();

      //explicitly wait for 10 seconds.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      // go to etsy.com.
        driver.get("https://www.etsy.com/");
      //search coffee mug.
        WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
        search.sendKeys("coffee mug" + Keys.ENTER);
      //find all the results and store them in a list of web elements.
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='currency-value']"));
       //loop through all those and get the prices of each item and print it out.
       List<String> elemrntsSorted = new ArrayList<>();
        for (WebElement each : elements){
            elemrntsSorted.add(each.getText());
        }
        Collections.sort(elemrntsSorted );
        System.out.println("min price for mug " + elemrntsSorted.get(0)
                 + "\n averege price for mug" + elemrntsSorted.get(elemrntsSorted.size()/2)
                 + "\n max price for mug " + elemrntsSorted.get(elemrntsSorted.size()-1));
        for (String each : elemrntsSorted) {
            System.out.println("Price for coffee mug " +each);

        }
        driver.quit();
       //then quit.*/
    }
}
