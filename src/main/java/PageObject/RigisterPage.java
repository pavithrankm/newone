package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RigisterPage {
	WebDriver driver;
	
	public RigisterPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='firstname']")WebElement FirstName;
	@FindBy(xpath="//input[@id='lastname']")WebElement LastName;
	@FindBy(xpath ="//input[@id='email_address']")WebElement EmailAddress;
	@FindBy(xpath="//input[@id='company_email']")WebElement ConfirmMail;
	
	public WebElement FirstName() {
		return FirstName;
	}
	public WebElement LastName(){
		return LastName;
	}
	public WebElement EamailAddress() {
		return EmailAddress;
	}
	public WebElement ConfirmMail() {
		return ConfirmMail;
	}

}
