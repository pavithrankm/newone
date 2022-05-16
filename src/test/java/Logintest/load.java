package Logintest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resource.BaseClass;

public class load extends BaseClass {
	
	WebDriver driver;

		
			
		@BeforeTest
			public void login() throws IOException {
				driver = intializeDriver();
				
			}
			
		@Test	
		public void LoadTime() throws IOException {
			
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url1"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("heritageplus");
			System.out.println("Total Time for page load - "+totalTime); 
			
			
			
		}
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url2"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("heritagepoolplus");
			System.out.println("Total Time for page load - "+totalTime); 
			
			
			
		}
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url3"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("FIS-heritageplus");
			System.out.println("Total Time for page load - "+totalTime); 
			
			
			
		}
		
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url4"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("CPS-heritageplus");
			System.out.println("Total Time for page load - "+totalTime); 
			
			
			
		}
		
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url5"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("FIS-heritageplus-spray-heads");
			System.out.println("Total Time for page load - "+totalTime); 
			
			
			
		}
		
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url6"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("FIS-heritageplus-rain-bird");
			System.out.println("Total Time for page load - "+totalTime); 
			
			
			
		}
		
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url7"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("CPS-heritageplus-spray-heads");
			System.out.println("Total Time for page load - "+totalTime); 
			
		}
		
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url8"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("CPS-heritageplus-rain-bird");
			System.out.println("Total Time for page load - "+totalTime); 
			
		}
		for(int i=0; i<3 ;i++) {

			long start = System.currentTimeMillis();

			driver.get(prop.getProperty("url8"));

			long finish = System.currentTimeMillis();
			long totalTime = finish - start; 
			System.out.println("FIS-heritageplus-checkout");
			System.out.println("Total Time for page load - "+totalTime); 
			
		}
		
		
		}
		@AfterMethod
		public void closure() {
			driver.quit();
		}
			
		}



