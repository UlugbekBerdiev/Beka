package practice;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {



    @Test
    public void mrthod(){

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();






    }



}
