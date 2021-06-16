package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Demoqa;
import utilities.ConfigurationReader;
import utilities.Driver;

public class test {

WebDriver driver;
    @Test
    public void test3() throws InterruptedException {

        String expectedAlertMessage = "Please enter your name";
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        WebElement clickMeBtn2 = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
        clickMeBtn2.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert letshandle = driver.switchTo().alert();


        String actualAlertMessage = letshandle.getText();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
       Thread.sleep(3000);
        letshandle.sendKeys("Johnwertwt");
        letshandle.accept();
        Thread.sleep(3000);

    }}
