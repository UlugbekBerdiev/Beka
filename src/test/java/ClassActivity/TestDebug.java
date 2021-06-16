//package ClassActivity;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class TestDebug {
//
//
//
//    @Test
//    public void selectDDValues() {
////            WebDriverManager.chromedriver().setup();
////           WebDriver driver = new ChromeDriver();
////            driver.get("https://www.amazon.ca/");
////            driver.manage().window().maximize();
//            WebElement departments_dropdown= driver.findElement(By.id("searchDropdownBox"));
//            Select department = new Select(departments_dropdown);
//
//            List<WebElement> department_list = department.getOptions();
//
//            int total_department = department_list.size();
//            Assert.assertEquals(total_department,59);
//
//            System.out.println("Total department count is " + total_department);
//            for(WebElement ele:department_list) {
//                String department_name=ele.getText();
//                System.out.println("Departments are =====" + department_name);
//            }
//
//
//    }
//}
