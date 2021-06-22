package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
           }

    public final String pageTitle = "Transactions";

    //Created by Beka
    @FindBy(xpath = "//a[text()='Home ']")
    public WebElement labelHome;
    //Created by Beka
    @FindBy(name= "symbol")
    public WebElement symbolInput;
    //Created by Beka
    @FindBy(name= "date")
    public WebElement dateInput;
    //Created by Beka
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;
    //Created by Beka
    @FindBy(xpath = "//td[text()='ORPR']")
    public WebElement secondColomFirsRowFromTable;
    @FindBy(xpath = "//thead")
    public WebElement headerOfTable;

    @FindBy(xpath = "//tr")
    public List<WebElement> ListOfAllRowsFromTable;



}
