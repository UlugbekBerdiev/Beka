package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Class_work {
    public static void main(String[] args) throws InterruptedException {
        Driver.get().get("https://www.techlistic.com/p/demo-selenium-practice.html");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        WebElement readMe = Driver.get().findElement(By.xpath("//div[@class= 'jump-link flat-button ripple']//a[@title = '10 Best Demo Websites for Automation Testing Practice']"));
        Thread.sleep(2000);
        readMe.click();
        Driver.get().close();

        Driver.get().navigate();
    }

}
