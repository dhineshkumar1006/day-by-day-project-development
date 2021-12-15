package com.revised;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class T_Runner extends B_class {
	
	//public static WebDriver driver;
	
	static Logger log = Logger.getLogger(T_Runner.class);	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BasicConfigurator.configure();
		 
		log.info("browser launched");
		
		getbrowser("chrome");
		
		geturl("http://automationpractice.com/index.php");
		
		WebElement sigin = driver.findElement(By.xpath("//a[@class='login']"));
		
		//sigin.click();
		clickonelement(sigin);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		//email.sendKeys("dhineshfb10@gmail.com");
		passvalue(email, "dhineshfb10@gmail.com");
		
		WebElement pswd = driver.findElement(By.xpath("(//input[@type='password'])"));
		
		//pswd.sendKeys("dinu20");
		passvalue(pswd, "dinu20");
		
		WebElement accsign = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		
		//accsign.click();
		clickonelement(accsign);
		
		log.info("account get signin");
		///////////////////////////////////////////////////////////
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		
		//tshirts.click();
//		Actions a = new Actions(driver);
//		a.moveToElement(tshirts).click().build().perform();
//		clickonelement(tshirts);
		getmouse("moveto", tshirts);
		
		log.info("tshirt clicked");
		
		
		
		WebElement imagecl = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoview();", imagecl);

		gettouch("arguments[0].scrollIntoview|();", imagecl);
		
		log.info("image touched");
		
		WebElement addcart = driver.findElement(By.xpath("(//a[@title='Add to cart'])"));
		
		getmouse("moveto", addcart);
		log.info("added to the cart");
		
		/////////////////////////////////////////////////////////////
		Thread.sleep(5000);
		WebElement firstproceedbtn = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])"));
		
		getmouse("moveto", firstproceedbtn);
		log.info("first proceed clicked");
		
		WebElement secondprobtn = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		
		getmouse("moveto", secondprobtn);
		log.info("second btn clicked");
		
		WebElement thirdprobtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		getmouse("moveto", thirdprobtn);
		log.info("thirdprobtn clicked");
		
		WebElement tick = driver.findElement(By.xpath("(//input[@type='checkbox'])"));
		
		getmouse("moveto", tick);
		log.info("tick");
		
		WebElement fourthprobtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		getmouse("moveto", fourthprobtn);
		log.info(fourthprobtn);
		
		//getpic("getscreenshot", "copyfile");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\revised\\screenshot/picture.png");
		
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
	}
	
}