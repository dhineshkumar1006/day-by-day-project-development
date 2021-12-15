package com.revised;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B_class {
	
	public static WebDriver driver;//--null
	
	public static  WebDriver getbrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//driver//firefoxdriver.exe");
			
			 driver = new FirefoxDriver();
			
		}
		return driver;

		
	}
	public static  void geturl(String url) {
		
		driver.get(url);
		
	}
	
	public static  void clickonelement(WebElement element) {
		
		element.click();
	}
	
	public static void passvalue(WebElement element , String value) {
		
		element.sendKeys(value);
	}
	
	public static void close() {
		
		driver.close();
	}
	public static void getmouse(String type,WebElement element) {
		
		Actions a = new Actions(driver);
		
		if (type.equalsIgnoreCase("moveto")) {
			
			a.moveToElement(element).click().build().perform();
			
		}	
	
	}
	public static void gettouch(String type,WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		if (type.equalsIgnoreCase("execute")) {
			js.executeScript("arguments[0].scrollIntoview();", element);
			
		}
	
		
		
	}
	public static void getpic(String type,String op ) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		if (type.equalsIgnoreCase("getscreenshot")) {
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\revised\\screenshot/picture.png");
			
			FileUtils.copyDirectory(src, dest);
			
		}
	}
}
	
		
	






		
	
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

