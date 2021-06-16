package practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;

public class UploadFiles {

    @Test
   public void ubload() throws InterruptedException {
        Driver.get().get("https://demoqa.com/automation-practice-form");
        Driver.get().manage().window().maximize();
        Driver.get().findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Beka\\Desktop\\fotoNasty.jpg");
        Driver.get().quit();
    }
}
