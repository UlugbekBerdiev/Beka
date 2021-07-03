package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class DatePicker {


    @Test
    public void datePick(){
        Driver.get().get("https://demoqa.com/date-picker");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        selectDate("27", "June", "2021");

    }

    static void selectDate(String day, String month, String year){
if(day.length()>1 && day.length()<3) {
    Driver.get().findElement(By.id("datePickerMonthYearInput")).click();
    WebElement selectMonth = Driver.get().findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
    WebElement selectYear = Driver.get().findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
    Select selYear = new Select(selectYear);
    Select selMonth = new Select(selectMonth);
    selYear.selectByVisibleText(year);
    selMonth.selectByVisibleText(month);

    try {
        Driver.get().findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0" + day + "']")).click();
    } catch (Exception e) {
        Driver.get().findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0" + day + " react-datepicker__day--weekend']")).click();
    }
}else System.out.println("Incorrect day format please input two digit");
    }}
