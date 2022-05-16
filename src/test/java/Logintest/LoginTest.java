package Logintest;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resource.BaseClass;

public class LoginTest extends BaseClass {
	WebDriver driver;
	
	@BeforeTest
	public void login() throws IOException {
		intializeDriver();
		
	}
	@Test
	public void Heritageplus() throws IOException, InterruptedException {
		
		
		for(int i=0;i<3 ; i++) {
		
		 driver = intializeDriver();
		
		
		
		long start = System.currentTimeMillis();

		driver.get(prop.getProperty("url1"));

		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("heritageplus");
		System.out.println("Total Time for page load - "+totalTime); 
		
	}
}
	
@Test
public void Heritagepoolplus() throws IOException, InterruptedException {
	
	
	for(int i=0;i<3 ; i++) {
	
	 driver = intializeDriver();
	
	
	
	long start = System.currentTimeMillis();

	driver.get(prop.getProperty("url2"));

	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("heritagepoolplus");
	System.out.println("Total Time for page load - "+totalTime); 
	}	
}

@Test
public void FIS() throws IOException, InterruptedException {
	
	
	for(int i=0;i<3 ; i++) {
	
	 driver = intializeDriver();
	
	
	
	long start = System.currentTimeMillis();

	driver.get(prop.getProperty("url3"));

	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("fis-stg2.heritageplus");
	System.out.println("Total Time for page load - "+totalTime); 
}
}
@Test
public void CPS() throws IOException, InterruptedException {
	
	
	for(int i=0;i<3 ; i++) {
	
	 driver = intializeDriver();
	
	
	
	long start = System.currentTimeMillis();

	driver.get(prop.getProperty("url4"));

	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("cps-stg2.heritageplus");
	System.out.println("Total Time for page load - "+totalTime); 
}
}

@Test
public void FisShopProduct() throws IOException, InterruptedException {
	
	
	for(int i=0;i<3 ; i++) {
	
	 driver = intializeDriver();
	
	
	
	long start = System.currentTimeMillis();

	driver.get(prop.getProperty("url5"));

	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("FisShopProduct");
	System.out.println("Total Time for page load - "+totalTime); 
}
}
	@Test
	public void FisShopProduct1() throws IOException, InterruptedException {
		
		
		for(int i=0;i<3 ; i++) {
		
		 driver = intializeDriver();
		
		
		
		//long start = System.currentTimeMillis();

		driver.get(prop.getProperty("url5"));

//		long finish = System.currentTimeMillis();
	//	long totalTime = finish - start; 
		//System.out.println("FisShopProduct");
	//	System.out.println("Total Time for page load - "+totalTime); 
		
		
		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	            "return performance.timing.loadEventEnd - performance.timing.navigationStart;");        
	        System.out.println(loadtime + " milliseconds");
		continue ;
		}
		
		
	
	
}
@AfterMethod
public void closure() {
	driver.quit();
}
}