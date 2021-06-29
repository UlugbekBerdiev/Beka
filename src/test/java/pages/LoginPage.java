package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public	LoginPage() {
		 PageFactory.initElements(Driver.get(), this);
	 }

	@FindBy(id ="input-13")
	public  WebElement userName;

	@FindBy(id ="input-16")
	public  WebElement pssword;
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement submit;

	@FindBy(css ="[data-qa=register]")//button[@type='submit']
	public WebElement CreateAccount;

	public void loginAsUser(String userName, String passWord){
		this.userName.sendKeys(userName);
		this.pssword.sendKeys(passWord);
		submit.click();

	}
}
