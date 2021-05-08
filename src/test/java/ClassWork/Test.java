package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
  static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.lambdatest.com/blog/selenium-java-testing-page-object-model/");
        driver.findElement(By.id("onesignal-slidedown-allow-button")).click();

        List<String> link = new ArrayList<>(Arrays.asList("Live"));
        ClicToLink("info");




        //Store the alert in a variable
        Alert alert = driver.switchTo().alert();
        driver.manage().wait(2000);
        alert.accept();


    }
    public static void ClicToLink(String name){
        driver.findElement(By.xpath("//a[contains(text(), '"+ name+"')]")).click();
    }
}
