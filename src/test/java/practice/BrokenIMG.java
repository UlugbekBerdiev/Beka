package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class BrokenIMG {

    @Test
    public void validateImg(){
        Driver.get().get("https://demoqa.com/broken");
        WebElement imeg = Driver.get().findElement(By.xpath("//p[text() = 'Broken image']/following-sibling::img"));
        Assert.assertEquals( imeg.getAttribute("naturalWidth"),"0");
        List<WebElement> imeges = Driver.get().findElements(By.tagName("img"));

        for (WebElement img : imeges){
            if(img.getAttribute("naturalWidth").equals("0")){
                System.out.println("index "+ imeges.indexOf(img)+" Broken");
            }else System.out.println("good"+img.getAttribute("naturalWidth"));
        }

Driver.get().quit();
    }
}
