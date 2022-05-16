package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='header-email']")WebElement EmailAddress;
	@FindBy(xpath="//input[@id='header-pass']")WebElement Password;
	@FindBy(xpath="//button[@class='action login primary']") WebElement Signin;
	public WebElement EmailAddress() {
		return EmailAddress;
	}
	public WebElement Password() {
		return Password;
	}
	
	public WebElement Signin() {
		return Signin;
	}
}
