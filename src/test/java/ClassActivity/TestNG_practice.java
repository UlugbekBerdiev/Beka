package ClassActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNG_practice {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }
     @Test
    public void selectValue() throws InterruptedException {

        Select sel = new Select(driver.findElement(By.id("searchDropdownBox")));
        List<WebElement> departaments = sel.getOptions();
         SoftAssert asSoft = new SoftAssert();

         asSoft.assertEquals(departaments.size(),58);

         for(WebElement each : departaments){
             Thread.sleep(2000);
                 sel.selectByVisibleText(each.getText());
                 Assert.assertTrue(each.isDisplayed());

         }
     }

     @Test
     public void PrimeVideoFromMenu(){
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.id("2")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'prime video']")).isDisplayed());
     }



     @AfterTest
    public void close(){
        driver.quit();
     }

}
