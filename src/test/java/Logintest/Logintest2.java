package Logintest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resource.BaseClass;

public class Logintest2 extends BaseClass {
	

	@BeforeTest
	public void login() throws IOException {
		intializeDriver();
		
	}
	
	@Test
	public void fisstg2heritageplus() throws IOException, InterruptedException {
		
		
		for(int i=0;i<3 ; i++) {
		
		WebDriver driver = intializeDriver();
		
		
		
		long start = System.currentTimeMillis();

		driver.get(prop.getProperty("url6"));

		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("fis-stg2.heritageplus-bird");
		System.out.println("Total Time for page load - "+totalTime); 
		
	}
}
	
	@Test
	public void CPSstg2heritageplusSpray() throws IOException, InterruptedException {
		
		
		for(int i=0;i<3 ; i++) {
		
		WebDriver driver = intializeDriver();
		
		
		
		long start = System.currentTimeMillis();

		driver.get(prop.getProperty("url7"));

		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("CPS-stg2.heritageplus-bird-Spray heads");
		System.out.println("Total Time for page load - "+totalTime); 
		
	}
}
	@Test
	public void CPSstg2heritageplusRainBird() throws IOException, InterruptedException {
		
		
		for(int i=0;i<3 ; i++) {
		
		WebDriver driver = intializeDriver();
		
		
		
		long start = System.currentTimeMillis();

		driver.get(prop.getProperty("url8"));

		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("CPS-stg2.heritageplus-bird-Rain Bird");
		System.out.println("Total Time for page load - "+totalTime); 
		
	}
}
	@Test
	public void FisCheckoutCart() throws IOException, InterruptedException {
		
		
		for(int i=0;i<3 ; i++) {
		
		WebDriver driver = intializeDriver();
		
		
		
		long start = System.currentTimeMillis();

		driver.get(prop.getProperty("url9"));

		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("FIS-Checkout-Cart");
		System.out.println("Total Time for page load - "+totalTime); 
		
	}
}
	@Test
	public void FisCheckout() throws IOException, InterruptedException {
		
			
		
		for(int i=0;i<3 ; i++) {
		
		WebDriver driver = intializeDriver();
		
		
		
		long start = System.currentTimeMillis();

		driver.get(prop.getProperty("url10"));

		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("FIS-Checkout");
		System.out.println("Total Time for page load - "+totalTime); 
		
	}
}
	


}
