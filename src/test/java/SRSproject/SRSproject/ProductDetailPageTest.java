package SRSproject.SRSproject;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.tools.ant.taskdefs.condition.Contains;
import org.jsoup.select.Evaluator.ContainsData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductListPage;
import Pages.ProductDetailPage;
import Pages.RegistrationForm;
import Utils.Constants;



public class ProductDetailPageTest extends BaseTest {

	ProductDetailPage pdp;
	
@Test(priority=1, description= "Register now link redirection")
	public void PDP_RegisterRedirection_GuestValidation() throws InterruptedException, IOException 
	{
	BasePage.initializtion();
	Thread.sleep(5000);
	
	
	HomePage hp= new HomePage(driver);
	 Thread.sleep(2000);
	 
	 hp.SearchByKeyword();
		Thread.sleep(10000);
		
		
	ProductListPage	plp = new ProductListPage(driver);
	pdp=plp.GuestUser_ClickItem();
	Thread.sleep(4000);

//pdp = new ProductDetailPage(driver);
String title=pdp. Guest_clickProductRegister();
Assert.assertEquals(title, prop.getProperty("Homepage_url"));
Thread.sleep(600);
				
	}
	
	@Test(priority=2, description= "Adding Item to Cart")
	public void AddingItemToCart() throws InterruptedException, IOException 
	{
		BasePage.initializtion();
		Thread.sleep(8000);
		
		
		Thread.sleep(1000);
			LoginPage Lp = new LoginPage(driver);
		Lp.ValidLogin();
		Thread.sleep(8000);
		
		HomePage hp= new HomePage(driver);
		
		
		hp.SearchByKeyword();
		Thread.sleep(10000);
		
		
	ProductListPage	plp = new ProductListPage(driver);
	pdp=plp.GuestUser_ClickItem();
	Thread.sleep(4000);
	

String successmsg= pdp.AddingItem();
Assert.assertEquals(successmsg, Constants.Success_Msg_Reorder);


	
	
		
				
	}
	@Test(priority=3, description= "validating Recently viewed Items is in PDP")
	public void Recently_viewedItems_validation() throws InterruptedException, IOException 
	{
		Thread.sleep(7000);
		HomePage hp= new HomePage(driver);
		
		
		hp.SearchByKeyword();
		Thread.sleep(10000);
		
		
	ProductListPage	plp = new ProductListPage(driver);
	pdp=plp.GuestUser_ClickItem();
	Thread.sleep(4000);
	


System.out.println(pdp.Recently_viwed_Title());

String tile = pdp.Recently_viwed_Title();
pdp.Recently_viwed_Item().click();

Assert.assertEquals(tile,"Recently Viewed");
	
	
		
				
	}
	@Test(priority=4, description= "validating Recently viewed Items is in PDP")
	public void Recently_viewed_Add_validation() throws InterruptedException, IOException 
	{
		Thread.sleep(4000);
		pdp.Recently_viwed_add().click();
		Thread.sleep(500);
		String successmsg= pdp.Adding_Recentlview_Sucssmsg();
		Assert.assertEquals(successmsg, Constants.Success_Msg_Reorder);
	} 
	
	@Test(priority=5, description= "validating Related Products Items is in PDP")
	public void RelatedProducts_validation() throws InterruptedException, IOException 
	{
		Thread.sleep(5000);
	pdp.SearchByKeyword();
		Thread.sleep(10000);
		
		pdp.RelatedProducts();
	String	tile = pdp.RelatedProductsTitle();
		System.out.println(tile);
		
	} 
}
