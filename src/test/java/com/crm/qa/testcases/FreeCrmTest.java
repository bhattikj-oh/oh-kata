package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FreeCrmPage;
import com.crm.qa.util.TestUtil;

public class FreeCrmTest extends TestBase{

//	static WebDriver driver;   This is already created from the super 
//	static JavascriptExecutor js;
	FreeCrmPage freeCrmPage;
	


	public FreeCrmTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		freeCrmPage = new FreeCrmPage();
		
		
		
		// Driver is being inherited from super 
		
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
//		driver = new ChromeDriver();
//		js = (JavascriptExecutor) driver;
//		driver.get("https://www.freecrm.com/index.html");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}

	@Test

	//Moving this to the page logic 
	
	public void freeCrmTitleTest() {
		
		
		String title = 	freeCrmPage.FreeCrmTitleTest();
		Assert.assertEquals(title,"Free CRM software for customer relationship management, sales, marketing campaigns and support.");
		
	
		//		String title = driver.getTitle();
		//		System.out.println("title is: " + title);
	}
		
	@Test
	public void freeCrmTitleMessageTest() throws InterruptedException {
		String message = "Free CRM software in the cloud powers sales and customer serviceQQQQ";
		Assert.assertFalse(freeCrmPage.TitleMessageTest(message));
	}
		//none of this is a test
//		if (title.equals("Free CRM software in the cloud powers sales and customer serviceQQQQ")) {
//			getRunTimeInfoMessage("info", "title is correct!! YAY!!!");
//			Assert.assertTrue(true);
//		} else {
//			getRunTimeInfoMessage("error", "title is not correct!! BUG BUG BUG!!!");
//			takeScreenshot("freecrmloginpage");
//			Assert.assertTrue(false);
//		}

	}
	
	//move this to the page logic

//	public static void getRunTimeInfoMessage(String messageType, String message) throws InterruptedException {
//		// Check for jQuery on the page, add it if need be
//		js.executeScript("if (!window.jQuery) {"
//				+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
//				+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
//				+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
//		Thread.sleep(5000);
//
//		// Use jQuery to add jquery-growl to the page
//		js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");
//
//		// js.executeScript("$.getScript('/Users/NaveenKhunteta/Documents/workspace/Test/src/testcases/jquery.growl.js')");
//
//		// Use jQuery to add jquery-growl styles to the page
//		js.executeScript("$('head').append('<link rel=\"stylesheet\" "
//				+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
//		Thread.sleep(5000);
//
//		// jquery-growl w/ no frills
//		js.executeScript("$.growl({ title: 'GET', message: '/' });");
//		
//		if(messageType.equals("error")){
//			js.executeScript("$.growl.error({ title: 'ERROR', message: '"+message+"' });");
//		}else if(messageType.equals("info")){
//			js.executeScript("$.growl.notice({ title: 'Notice', message: '"+message+"' });");
//		}else if(messageType.equals("warning")){
//			js.executeScript("$.growl.warning({ title: 'Warning!', message: '"+message+"' });");
//		}
//
//		// jquery-growl w/ colorized output
////		js.executeScript("$.growl.error({ title: 'ERROR', message: 'Some exception is coming' });");
////		js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
////		js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
//	}
	
//This will be added as a method to the testBase in case any other Tests wish to implement it.
//	public static void takeScreenshot(String fileName) throws IOException{
//		// Take screenshot and store as a file format
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		// now copy the screenshot to desired location using copyFile //method
//		FileUtils.copyFile(src, 
//				new File("." + File.separator+ "screenshots" + File.separator+ fileName +".png"));
//
//	}


