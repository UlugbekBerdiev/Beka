    package ClassActivity;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;

    import java.util.HashSet;
    import java.util.Iterator;
    import java.util.concurrent.TimeUnit;

    public class HomeWork_windows {
        WebDriver driver;

        @BeforeTest
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/popup.php");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }
        @AfterTest
        public void close(){
            driver.quit();
        }
    //    Test case 1
    //    go to http://demo.guru99.com/popup.php
    //    Get title and store it in a variable.
    //    Click on Click Me button and switch over to next window, provide an email click Submit.
    //    Get text of the user ID and password and store them in variables, print them out.
    //    Then verify the text “This access is valid only for 20 days.”
    //    Close the window.
    //    Go back to main window, and get title then verify equals to your stored title.
    //    Quite driver.
         @Test
        public void windowHandle() throws InterruptedException {
     //    Get title and store it in a variable.
             String title = driver.getTitle();
    //    Click on Click Me button
             driver.findElement(By.xpath("//a[text() = 'Click Here']")).click();
    // and switch over to next window,
             HashSet<String> windowIDs = (HashSet<String>) driver.getWindowHandles();
             Iterator<String> iter = windowIDs.iterator();
             String parentWinID = iter.next();
             String childWinID = iter.next();
             driver.switchTo().window(childWinID);
     //provide an email click Submit.
             driver.findElement(By.name("emailid")).sendKeys("Beka@gmail.com");
             driver.findElement(By.name("btnLogin")).click();
             Thread.sleep(3000);
    //    Get text of the user ID and password and store them in variables, print them out.
             String userID = driver.findElement(By.xpath("//td[text() = 'User ID :']/following-sibling::td")).getText();
             String password = driver.findElement(By.xpath("//td[text() = 'Password :']/following-sibling::td")).getText();
             System.out.println("userID:- " + userID + "  password : -" + password);
    //    Then verify the text “This access is valid only for 20 days.”
           WebElement massege = driver.findElement(By.xpath("//td/h3[text() = 'This access is valid only for 20 days.']"));
             Assert.assertTrue(massege.isDisplayed());
     //    Close the window.
             driver.close();
     //    Go back to main window, and get title then verify equals to your stored title.
             driver.switchTo().window(parentWinID);
             String homeTitle = driver.getTitle();
             Assert.assertEquals(homeTitle,title );
         }


    }
