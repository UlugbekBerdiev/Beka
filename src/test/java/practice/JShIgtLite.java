package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.Driver;

public class JShIgtLite {
    public static void main(String[] args) {
        Driver.get().get("https://www.amazon.com/");
        WebElement element = Driver.get().findElement(By.id("twotabsearchtextbox"));
        BrowserUtils.highlightElement(element );
    }

}
