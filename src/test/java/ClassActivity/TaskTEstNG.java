package ClassActivity;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/*
Test case 1
go to https://saucedemo.com
log in with valid username = standard_user   password = secret_sauce
Verify that you are logged in successfully.
Test case 2
go to https://saucedemo.com
log in with invalid username = invalid_user  password = secret_sauce
Verify that you are not logged in, and you get the error message of:
"Epic sadface: Username and password do not match any user in this service"
 Test case 3
go to https://saucedemo.com
    log in with locked  username = locked_out_user   password = secret_sauce
Verify that you are not logged in, and you get the error message of:
 "Epic sadface: Sorry, this user has been locked out."*/
 //*/
public class TaskTEstNG {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
           driver.get("https://www.saucedemo.com/");

    }

    @Test
    public void verifyLoginSuc(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
        WebElement title = driver.findElement(By.xpath("//span[text() = 'Products']"));
            Assert.assertTrue(title.isDisplayed());

    }
    @Test
    public void invalidLogin(){
        driver.findElement(By.id("user-name")).sendKeys("standard");
        driver.findElement(By.id("password")).sendKeys("Nosecret");
        driver.findElement(By.id("login-button")).click();
        WebElement eror = driver.findElement(By.xpath("//h3[text() = 'Epic sadface: Username and password do not match any user in this service']"));
             Assert.assertTrue(eror.isDisplayed());

    }
    @Test
    public void invaliUsername(){
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement eror = driver.findElement(By.xpath("//h3[text() ='Epic sadface: Sorry, this user has been locked out.']"));
        Assert.assertTrue(eror.isDisplayed());

    }
    @AfterTest
    public void close(){
        driver.quit();
    }



}
