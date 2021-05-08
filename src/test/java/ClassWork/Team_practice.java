package ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Team_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("http://practice.cybertekschool.com/");
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        elements.remove(0);
        elements.remove(elements.size()-1);
        System.out.println(elements.size());
        for(WebElement each : elements){
            System.out.println(each.getText());
             }
        for(WebElement each : elements){
            each.click();
            driver.navigate().back();
        }
        driver.close();
    }
}
