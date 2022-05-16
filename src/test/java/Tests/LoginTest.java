package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Resource.BaseClass;

public class LoginTest  extends BaseClass{
	WebDriver driver;
	
	
	@BeforeMethod
	public void Login1() throws IOException {
		driver= intializeDriver();
	}
	
	@Test
	public void Login() throws IOException, InterruptedException {
		
		
		 driver.get(prop.getProperty("url"));
		 
		 LandingPage landingpage = new LandingPage(driver);
		 landingpage.AccountDropdown().click();
		 
		 LoginPage loginpage = new LoginPage(driver);
		 loginpage.EmailAddress().sendKeys(prop.getProperty("email1"));
		 loginpage.Password().sendKeys(prop.getProperty("password1"));
		 loginpage.Signin().click();
		 System.out.println("Login Sucessfull");
		 Thread.sleep(4000);

}
	@AfterMethod
	public void Close() {
	driver.close();
	}
}