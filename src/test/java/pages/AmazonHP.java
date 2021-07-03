package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class AmazonHP {

        public AmazonHP() {
            PageFactory.initElements(Driver.get(),this);
        }
        @FindBy(id="twotabsearchtextbox")
       public WebElement searchInputBox;
        @FindBy(id="nav-search-submit-button")
        public  WebElement searchButton;
        @FindBy(id="searchDropdownBox")
        public  WebElement departmentSelectButton;
        @FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']/option")
        public  List<WebElement> listOfDepartments;
}