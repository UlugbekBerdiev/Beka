package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Tests {
    @BeforeTest
    public void setUp(){
        Driver.get().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }


    @Test
   public void test1(){
       Driver.get().get("https://google.com");
   }


   @AfterTest
    public void tearDown(){
        Driver.closeDriver();
   }

}
