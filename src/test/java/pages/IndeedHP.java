package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IndeedHP {

    public IndeedHP(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "text-input-what")
    public WebElement WhatsearchInput;

    @FindBy(id = "text-input-where")
    public WebElement WheresearchInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;



}
