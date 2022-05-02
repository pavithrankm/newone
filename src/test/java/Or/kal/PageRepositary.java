package Or.kal;

import org.openqa.selenium.WebDriver;

public class PageRepositary extends BaseClass{

	
private Login al;





public Login getAl() {
	if (al==null) {
		al = new Login(driver);
	}
	return al;
}

public PageRepositary(WebDriver fdriver) {
	this.driver=fdriver;
}


}



