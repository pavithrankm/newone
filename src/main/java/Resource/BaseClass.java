package Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException {
		
		prop =new Properties();
		
		String propPath= System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\data.properties";
		
		FileInputStream fis =new FileInputStream(propPath);
		prop.load(fis);
		
		
		String browserName=prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")) {
			
			WebDriverManager.iedriver().setup();
			 driver =new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public String takeScreenshot() throws IOException {
		

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(src, new File(path));
		
		File Destination = new File(path);
		try {
			FileUtils.copyFile(src, Destination);
		} catch (IOException e) {
			System.out.println("screenshot captured failed...");
		}

		return path;
	}
		
	}


