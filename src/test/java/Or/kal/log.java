package Or.kal;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class log extends BaseClass{
	
	public void TestRobo() throws Exception{
		getbrowser("chrome");
		     driver.get("http://www.facebook.com");

		     driver.findElement(By.id("email")).sendKeys("Kumar");
		     driver.findElement(By.id("pass")).sendKeys("12345");
		 
		     Robot r=new Robot();
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);
		}
public static void main(String[] args) throws Exception {
	log m = new  log();
	m.TestRobo();
}
}
