package ClassActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        Driver.get().manage().window().maximize();
        Driver.get().get("https://www.amazon.com/");
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterTest
    public void close()      {Driver.get().quit();
    }

}
