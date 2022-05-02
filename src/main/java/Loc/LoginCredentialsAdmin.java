package Loc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;


public class LoginCredentialsAdmin extends BaseClass {


	@FindBy(id = "username")
	private WebElement usernameAd;
	
	public WebElement getUsernameAd() {
		return usernameAd;
	}

	public WebElement getPasswordAd() {
		return passwordAd;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	@FindBy(id = "login")
    private WebElement passwordAd;

	@FindBy(xpath = "//body//div[@class =\"form-actions\"]//button[@class =\"action-login action-primary\"]")
	private WebElement signinBtn;

	public LoginCredentialsAdmin(WebDriver fdriver) {
		this.driver = fdriver;
//		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}

	
}
