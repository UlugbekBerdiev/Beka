package practice;

import org.testng.annotations.Test;
import utilities.Driver;

public class Frame_paractice {

    @Test
    public void frame(){
        Driver.get().get("http://practice.cybertekschool.com/nested_frames");
        Driver.get().switchTo().frame("frame-left");
        Driver.get().switchTo().frame("frame-middle");

    }
}
