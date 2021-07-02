package utils;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class BrowserUtils {

    /**
     * Verifies whether the element matching the provided locator is NOT displayed on page
     *
     * */
    public static void verifyElementNotDisplayed(WebElement element) {
        try {
            Assert.assertFalse(element.isDisplayed());
                   } catch (NoSuchElementException e) {
            Assert.assertFalse(false);

        }
    }
    public static void wait(int seconds) {

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) { return false; }
    }

    //created by Hakan
    Alert alert;
    WebDriverWait letswait;
    static Select letsSelect;

    public void switchToAlert() {
        alert = Driver.getDriver().switchTo().alert();
    }

    public String alertGetText() {
        return alert.getText();
    }

    public void alertAccept() {
        alert.accept();
    }

    public void alertDismiss() {
        alert.dismiss();
    }

    public void sendKeysOnAlert(String name) {
        alert.sendKeys(name);
    }

    public void waitUntilAlertIsPresent() {
        letswait = new WebDriverWait(Driver.getDriver(), 10);
        letswait.until(ExpectedConditions.alertIsPresent());
    }

    public void waitUntilElementVisible(WebElement element) {
        letswait = new WebDriverWait(Driver.getDriver(), 10);
        letswait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void switchToNewWindow(){
        // Switch to new window opened
        for(String winHandle : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(winHandle);
        }}
    public static void switchBackToOriginWindow(String originWindow) {
        // Close the new window, if that window no more required
        Driver.getDriver().close();
        // Switch back to original browser (first window)
        Driver.getDriver().switchTo().window( originWindow );

    }
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }
    
    public static void selectByVisibleText(WebElement element, String optionToSelect) {
  		letsSelect = new Select(element);
  		letsSelect.selectByVisibleText(optionToSelect);
  }
    public static void JDBCexecuteQuery(String query){
        try{
            String url = "jdbc:mysql://database-1.cbf9mjnqgnfr.us-east-2.rds.amazonaws.com:3306/stock_trading_tracker";
            String userName = "admin";
            String password = "Password123!";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement statement = con.createStatement();
            statement.execute(query);
            System.out.println("Success");
        }catch(Exception e){}
    }
}

