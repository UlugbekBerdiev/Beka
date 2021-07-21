package ClassActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Amazon_test {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterTest
    public void close(){
        driver.quit();
    }

//    Test case 1
//    go to amazon.com
//    get all the options in the departments select dropdown
//    verify there are total 59 departments. And print them out.

    @Test
    public void selectValue() {

        Select sel = new Select(driver.findElement(By.id("searchDropdownBox")));
        List<WebElement> departaments = sel.getOptions();

        SoftAssert asSoft = new SoftAssert();

        asSoft.assertEquals(departaments.size(), 58);
        for(WebElement dep : departaments){
        System.out.println(dep.getText());}
    }
    @Test
    public void getPrice(){
        Driver.get().get("https://www.amazon.com/s?k=coffee+mug&ref=nb_sb_noss_1");
        List<WebElement> prices = Driver.get().findElements(By.xpath("//span[@class = 'a-price']/child::span[@class='a-offscreen']"));
        for (WebElement each: prices) {
            System.out.println(each.getText());
        }
        System.out.println();
    }

//    Test case 2
//    go to amazon.com
//    verify that you are on the amazon home page. (verify with title).
//    verify dropdown value is by default "All Departments"
//    select department Home & Kitchen, and search coffee mug.
//    verify you are on coffee mug search results page (use title).
//    verify you are in Home & Kitchen department.
    @Test
    public void verify(){
      String actualTitleHomePage =  driver.getTitle();
      String expTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        Assert.assertEquals(expTitle,actualTitleHomePage);

        Select sel = new Select(driver.findElement(By.id("searchDropdownBox")));
      String defaultOption = sel.getFirstSelectedOption().getText();
      String expectedOption = "All Departments";
        Assert.assertEquals(expectedOption,defaultOption);

        sel.selectByVisibleText("Home & Kitchen");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug"+ Keys.ENTER);
        String actualTitleCoffeeMugPage = driver.getTitle();
        String expTitleCoffeeMugPage = "Amazon.com : coffee mug";
        Assert.assertEquals(actualTitleCoffeeMugPage,expTitleCoffeeMugPage);

        String departament = sel.getFirstSelectedOption().getText();
        System.out.println(departament);
        String expectedHomeKitchen = "Home & Kitchen";
        Assert.assertEquals(departament,expectedHomeKitchen);


    }
    }
