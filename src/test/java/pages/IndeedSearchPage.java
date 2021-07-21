package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class IndeedSearchPage {
    public IndeedSearchPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "jobsInLocation")
    public WebElement jobANDlocation;
    @FindBy(xpath = "//div[@class='invalid_location']/h1")
    public WebElement invalidLlocation;


    @FindBy(xpath = "//a[@class=\"jobtitle turnstileLink \"]/b")
    public List<WebElement> jobtitleList;


}
