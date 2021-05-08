package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Verizon {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.verizon.com/smartphones");

        List<String> list = new ArrayList<>(Arrays.asList("iPhone 12", "iPhone 12 mini", "iPhone 12 Pro Max", "iPhone 12 Pro", "iPhone SE (2020)", "iPhone 11", "iPhone XR"));

        for(String each : list){
            clickOnGrigAple(each);
            verifyHeader(each);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.quit();
        }


    }

    public static void clickOnGrigAple(String make) {
        WebElement element = driver.findElement(By.xpath("//span[text() = 'Apple']/parent::p/following-sibling::p/child::span[text() = '" + make + "']"));
        element.click();

    }
    public static void verifyHeader(String sts){
        WebElement header = driver.findElement(By.xpath("//span[text() = 'Apple "+ sts+"']"));
        Assert.assertTrue(header.isDisplayed());
    }
}