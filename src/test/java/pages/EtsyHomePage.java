package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyHomePage {

    public EtsyHomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (id = "catnav-primary-link-10855")
    public WebElement jewelryAccessories;


    @FindBy (id = "side-nav-category-link-10865")
    public WebElement bagsPurses;

    @FindBy (id = "catnav-l4-10869")
    public WebElement ShoulderBags;




}
