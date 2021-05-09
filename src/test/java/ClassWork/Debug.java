package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Debug {
   static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String baseUrl = "https://saucedemo.com";
        driver.get(baseUrl);

        Login("standard_user", "secret_sauce");
        List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'inventory_item']//div[@class = 'inventory_item_price']"));
        System.out.println(list.size());
        for(WebElement element : list){
            System.out.println(element.getText());
        }
        driver.close();

    }
    static void Login(String username, String pass){
        driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys(username);
        driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
    }
}

