package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Actions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebElement selectElement = driver.findElement(  );
//        Actions selectItem = new Actions(driver);

driver.quit();
    }

    public void openChromeBrowser(){
       Driver.get().findElement(By.xpath(""));
    }

    public void enterLoginPassword(){
        Driver.get().findElement(By.xpath(""));
    }


}
