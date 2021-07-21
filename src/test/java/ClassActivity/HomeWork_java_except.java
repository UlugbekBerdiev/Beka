package ClassActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomeWork_java_except {
//    You are tasked by your company to find an element with id "mega-banner-add" and get the text out of it.
//       You comany doesn't know which of the two websites it can be found at: either google website or yahoo website.
//    1.  Instantiate your driver instance;
//    2.  Navigate to the google website first,
//    3.  search for the element and try to get the text out of it;
//    4.  In case it's not found there, you code must recover from the exception that might arise;
//    5.  Once you have recovered from exception - navigate to the yahoo website and perform the search there;
//    6.  In the finally block: quit your driver instance and either print "nothing was found" or the text of the element in question

    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void homeWork_exceptions(){
//    2.  Navigate to the google website first,
        driver.get("http://www.google.com");
//    3.  search for the element and try to get the text out of it;

        try {
            WebElement  adjective = driver.findElement(By.id("mega-banner-add"));
            System.out.println(adjective.getText());
//    5.  Once you have recovered from exception - navigate to the yahoo website and perform the search there;
        }catch (Exception e){
            System.out.println("Achtung! Exceptions was thrown and catch block was triggered");
            driver.get("http://www.yahoo.com");
            WebElement  adjective = driver.findElement(By.id("mega-banner-add"));
            System.out.println(adjective.getText());
        }finally {
            driver.quit();
            System.out.println("nothing was found");
        }
    }
}
