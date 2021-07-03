package practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class DatePickerHelil {
    public static void main(String[] args) {
        pastDatePicker("June/10/2021");
    }

    public static void pastDatePicker(String dateToPick) {
        Driver.get().get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
        Driver.get().findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
        // 5/July/2018
        String[] dayMonthYear = dateToPick.split("/");
        // verify the date heading is displayed
        WebElement dateYear = Driver.get().findElement(By.xpath("(//table[@class='table-condensed']//th[@class='datepicker-switch'])[1]"));
        Assert.assertTrue(dateYear.isDisplayed());
        // split the dateYear to month and year
        String gotText = dateYear.getText();
        String[] monthyear = gotText.split(" ");
        // pick the given date
        while (!(monthyear[0].equals(dayMonthYear[1]) && monthyear[1].equals(dayMonthYear[2]))) {
            Driver.get().findElement(By.xpath("(//table[@class='table-condensed']//th[@class='prev'])[1]")).click();
            gotText = Driver.get().findElement(By.xpath("(//table[@class='table-condensed']//th[@class='datepicker-switch'])[1]")).getText();
            monthyear = gotText.split(" ");
        }
        // pick the day
        Driver.get().findElement(By.xpath("//td[text()='" + dayMonthYear[0] + "']")).click();
    }
}