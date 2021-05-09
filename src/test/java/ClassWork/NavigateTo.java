package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class NavigateTo {
    public static void main(String[] args) {
        Driver.get().get("https://www.amazon.com/");
        Driver.get().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        inputSendKeys("cofe mug");
        Driver.get().navigate().back();
        inputSendKeys("somthing alse");
        Driver.get().navigate().back();
        Driver.get().navigate().forward();
        Driver.get().navigate().refresh();
        Driver.get().quit();
    }
    static void inputSendKeys(String word){
        WebElement input = Driver.get().findElement(By.cssSelector("input[type='text']"));
        input.sendKeys(word+ Keys.ENTER);
    }
}
