package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bofa {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.bankofamerica.com/");
         List<String> list = new ArrayList<>(Arrays.asList("Small", "Wealth", "Bussines", "Security"));

         for(String each : list){
         driver.findElement(By.xpath("//a[contains(text(), '"+each+"')]")).click();
         Thread.sleep(1000);
         driver.navigate().back();
         Thread.sleep(1000);

         }
    }
}
