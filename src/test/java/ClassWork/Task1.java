package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        String url = "https://etsy.com";
        driver.get(url);
        driver.findElement(By.cssSelector("[class=\"wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 " +
                "inline-overlay-trigger signin-header-action select-signin\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class=\"wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger" +
                " register-header-action select-register\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id=\"join_neu_email_field\"]")).sendKeys("jon.dow@gmail.com");
        driver.findElement(By.cssSelector("[id=\"join_neu_first_name_field\"]")).sendKeys("Jon");
        driver.findElement(By.cssSelector("[id=\"join_neu_password_field\"]")).sendKeys("SecretPass123");
        driver.findElement(By.cssSelector("[class=\"wt-btn wt-btn--primary wt-width-full\"]")).click();
        Thread.sleep(3000);
        String ErrMessage = driver.findElement(By.cssSelector("[id=\"aria-join_neu_email_field-error\"]")).getText();
        String sampleMessge = "Sorry, the email you have entered is already in use.";
        if (ErrMessage.equals(sampleMessge))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");
        driver.quit();
    }
}
