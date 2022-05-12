package Logintest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resource.BaseClass;

public class LoginTest extends BaseClass {

	@Test
	public void login() throws IOException {
		
		WebDriver driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
}
