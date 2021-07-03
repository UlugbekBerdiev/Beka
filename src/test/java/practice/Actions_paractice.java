package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static utilities.Driver.*;

public class Actions_paractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = get();
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/droppable");

        actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
        //Thread.sleep(3000);
//        actions.moveToElement(driver.findElement(By.id("icp-nav-flyout"))).contextClick();//go to element and perform right click
//        actions.click().perform();//simple click
//        actions.doubleClick();//duble click
       // actions.dragAndDrop(WebelementFrom, WebelementTo)//perform drug and drop one element in to second element



    }
}
