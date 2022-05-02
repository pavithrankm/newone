package Or.kal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@id=\"login\"]")
	private WebElement loginBtn;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
//	public AdactinLoginPage() {
//		PageFactory.initElements(driver, this);
//	}
	
	public Login(WebDriver fdriver) {
		this.driver = fdriver;
		PageFactory.initElements(driver, this);
		PageFactory.initElements(fdriver, fdriver);
		
	}

}
