package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Result_veryfication {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        serchThis("coffe mug");

    }

    static void serchThis(String word){
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(word+ Keys.ENTER);}

}
