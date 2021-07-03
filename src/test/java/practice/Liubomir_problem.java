package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Liubomir_problem {
  @Test
          public void testing(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.finomgroup.com/");
        WebElement Logo = driver.findElement(By.xpath("//img[@title='Finom Group']"));
        Assert.assertTrue(Logo.isDisplayed());
        Assert.assertEquals(Logo.getAttribute("alt"), "Finom Group");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.finomgroup.com/");
        driver.quit();
    }
}
