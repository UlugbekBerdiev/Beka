package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Radio_Chack {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/radio-button");
        WebElement radioYEs = driver.findElement(By.id("yesRadio"));
        WebElement mpressive = driver.findElement(By.id("impressiveRadio"));
        WebElement notEneble = driver.findElement(By.id("noRadio"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;

        Thread.sleep(3000);

        if(!radioYEs.isSelected()){

            executor.executeScript("arguments[0].click();", radioYEs);
        }
        Thread.sleep(3000);
        if(!mpressive.isSelected()){
            executor.executeScript("arguments[0].click();", mpressive);
        }
        if(!notEneble.isEnabled()){
            System.out.println("Passed");
        }
        Thread.sleep(3000);
     driver.close();

    }
}
