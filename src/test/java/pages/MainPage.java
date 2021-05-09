package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class MainPage {
    public MainPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//div[@class = 'card mt-4 top-card'][1]")
    public WebElement elements;

    @FindBy (xpath = "//div[@class = 'card mt-4 top-card'][2]")
    public WebElement forms;

    @FindBy (xpath = "//div[@class = 'card mt-4 top-card'][3]")
    public WebElement alertsFrameWindows;

    @FindBy (xpath = "//div[@class = 'card mt-4 top-card'][4]")
    public WebElement widgets;

    @FindBy (xpath = "//div[@class = 'card mt-4 top-card'][5]")
    public WebElement interactions;

    @FindBy (xpath = "//div[@class = 'card mt-4 top-card'][6]")
    public WebElement bookStore;

    public void verifyAfterClickPage(WebElement element,String header){
     element.click();
        WebElement headerOfpage = Driver.get().findElement(By.xpath("//div[text() = '"+header+"']/parent::div[@class = 'pattern-backgound playgound-header']"));
        Assert.assertTrue(headerOfpage.isDisplayed());
        Driver.get().navigate().back();
    }







}
