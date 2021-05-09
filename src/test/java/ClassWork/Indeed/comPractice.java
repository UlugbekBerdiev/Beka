package ClassWork.Indeed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class comPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://www.indeed.com/");
        WebElement search = driver.findElement(By.id("text-input-what"));
        search.sendKeys("SDET" + Keys.ENTER);
       //storing the elements inside List
        List<WebElement> result = driver.findElements(By.xpath("//h2//a"));

        //counter for counting matching result
        int countMathTitle = 0;

        //checking result
        for(WebElement el : result){
            if(el.getAttribute("title").contains("SDET")){
                countMathTitle++;
            }
        }
        //feryfication if all list of results contain SDET word o not
        if(countMathTitle==result.size()){
            System.out.println("Pass");
        }else System.out.println("Faled");

         driver.quit();
    }
}
