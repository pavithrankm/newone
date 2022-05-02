package Or.kal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class javv  extends BaseClass{
	
	public static PageRepositary pr = new PageRepositary(driver);
@BeforeSuite
void sam() throws Exception {
getbrowser("chrome");
}
		@BeforeClass
		public void mac() {
			
			
		}
		
		@Test
		public void ma() throws Exception {
		
			getUrl(testData("url"));
			
			
		
		WebElement launch = driver.findElement(By.id("twotabsearchtextbox"));
		waitUntilElementVisibility(launch);
		launch.sendKeys("pass");
		
		String title = getTitle();
		Assert.assertEquals(title, title);
	}

	
}
