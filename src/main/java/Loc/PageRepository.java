package Loc;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;


public class PageRepository extends BaseClass {

	private LoginCredentialsAdmin Adm;

	
	public LoginCredentialsAdmin getAdm() {
		if (Adm==null) {
			Adm = new LoginCredentialsAdmin(driver);
		}
		return Adm;
	}

	public PageRepository(WebDriver fdriver) {
		this.driver=fdriver;
	}
}