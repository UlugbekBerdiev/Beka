package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class JavaScript_practice {
    public static void main(String[] args) {
        WebDriver driver = Driver.get();

        JavascriptExecutor js = (JavascriptExecutor)driver;
       // js.executeScript("alert('welcome to hell');");                 one  js pop up alert will be generate
        js.executeScript("window.location = 'http://amazon.com/'"); // navigate to google..com page
        //Vertical scroll down by 600  pixels
        js.executeScript("window.scrollBy(0,600)");



        WebElement element = driver.findElement(By.id("navBackToTop"));
        js.executeScript("arguments[0].scrollIntoView(true);", element); //scrol until element will be visible on the page
    }
}
