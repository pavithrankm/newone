package Or.kal;

import java.io.FileNotFoundException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.BaseClass;
import Loc.PageRepository;
//import commonFunctions.CommonFunctions;
//import pageObjects.CheckoutStepFlowAdmin;
//import pageObjects.LoginCredentialsAdmin;

public class CheckoutFlowTest extends BaseClass {
	public static PageRepository pr = new PageRepository(driver);
	@BeforeSuite
	public void browser() throws Exception {
		getbrowser("chrome");
	}
	@BeforeMethod
	public void  url() throws FileNotFoundException, Exception {
		getUrl(testData("adminURL"));
	}
	@Test
	public void checkoutFlowAdmin() throws InterruptedException, FileNotFoundException {
		WebElement usernameAd = pr.getAdm().getUsernameAd();
		String testData = testData("adUN");
		inputValueMethod(usernameAd, testData);
//		PageFactory.initElements(driver,LoginCredentialsAdmin.class);
//		LoginCredentialsAdmin.usernameAd.sendKeys(properties.getProperty("adUN"));
//		LoginCredentialsAdmin.passwordAd.sendKeys(properties.getProperty("adPW"));
//		LoginCredentialsAdmin.signinBtn.click();

//		PageFactory.initElements(driver,CheckoutStepFlowAdmin.class);
//		
//		JavascriptExecutor executorCheck1 = (JavascriptExecutor) driver;
//		executorCheck1.executeScript("window.scroll(0,400)");
//		CheckoutStepFlowAdmin.storesClick.click();
//		
//		Thread.sleep(3000);
//		JavascriptExecutor executorCheck2 = (JavascriptExecutor) driver;
//		
//		executorCheck2.executeScript("window.scroll(0,100)");
//		CheckoutStepFlowAdmin.configurationClick.click();
//		
//		JavascriptExecutor executorCheck3 = (JavascriptExecutor) driver;
//		executorCheck3.executeScript("window.scroll(0,450)");
//		CheckoutStepFlowAdmin.salesClick.click();
//		
//		Thread.sleep(3000);
//		JavascriptExecutor executorCheck4 = (JavascriptExecutor) driver;
//		executorCheck4.executeScript("window.scroll(0,800)");
//		CheckoutStepFlowAdmin.paymentMethodClick.click();
//		
//		Thread.sleep(3000);
//		JavascriptExecutor executorCheck5 = (JavascriptExecutor) driver;
//		executorCheck5.executeScript("window.scroll(0,2100)");	
//		CheckoutStepFlowAdmin.enabledPaymentClick.click();
//
//		JavascriptExecutor executorCheck6 = (JavascriptExecutor) driver;
//		executorCheck6.executeScript("window.scroll(0,2100)");	
//		CheckoutStepFlowAdmin.enabledYesClick.click();
	}
	
}
