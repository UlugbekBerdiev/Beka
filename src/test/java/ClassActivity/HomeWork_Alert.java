package ClassActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork_Alert {

    WebDriver driver;
    @BeforeTest
    public void setup(){
//    go to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterTest
    public void close(){
        driver.quit();
    }


    @Test
    public void homework1(){
//    Click on the first Alert, verify text equals “I am an alert box!” then Accept.
      driver.findElement(By.xpath("//p[text() = 'Click the button to display an alert box:']/following-sibling::button")).click();
        Alert alert = driver.switchTo().alert();
        String alertOneText = alert.getText();
        Assert.assertEquals(alertOneText,"I am an alert box!");
        alert.accept();
        }

    @Test
    public void homework2(){
//    Click on the second Alert, verify text equals “Press a button!” then Dismiss.
        driver.findElement(By.xpath("//b[text() = 'Click the button to display an confirm box:']/following-sibling::button")).click();
        Alert alert = driver.switchTo().alert();
        String alerTwoText = alert.getText();
        Assert.assertEquals(alerTwoText,"Press a button!");
        alert.dismiss();
    }

    @Test
    public void homework3() throws InterruptedException {
//    Click on the last Alert,
        driver.findElement(By.xpath("//b[text() = 'Click below button for prompt box.']/following-sibling::button")).click();
        Alert alert = driver.switchTo().alert();
 //   verify text equals “Please enter your name”
        String alertLastText = alert.getText();
        Assert.assertEquals(alertLastText,"Please enter your name");
//    Enter a name then Accept
        Thread.sleep(3000);
        alert.sendKeys("Beka");
        alert.accept();
           }




}

