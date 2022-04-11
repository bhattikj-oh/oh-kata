package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class FreeCrmPage extends TestBase {

	TestUtil testutil;
	
	

	
	public FreeCrmPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String FreeCrmTitleTest() {
		return driver.getTitle();
	}
	
	public Boolean TitleMessageTest(String titleTest) throws InterruptedException {
		Boolean result = false;
		String title = this.FreeCrmTitleTest();
		if (title.equals(titleTest)) {
			try {
		TestUtil.runTimeInfo("info", "title is correct!! YAY!!!");
		result=true;
		}
			catch(InterruptedException ie) {
				System.out.println("The thread was interrupted");
			}
			
		}
		else {
			try {
			TestUtil.runTimeInfo("error", "Title is not correct!! BUG BUG BUG!!!\"");
			TestUtil.takeScreenshotAtEndOfTest();
		}
			catch(Exception e) {
				System.out.println("The thread was interrupted");
			}
			result = false;
		}
		//	if (title.equals("Free CRM software in the cloud powers sales and customer serviceQQQQ")) {
//		getRunTimeInfoMessage("info", "title is correct!! YAY!!!");
//		Assert.assertTrue(true);
//	} else {
//		getRunTimeInfoMessage("error", "title is not correct!! BUG BUG BUG!!!");
//		takeScreenshot("freecrmloginpage");
//		Assert.assertTrue(false);
//	}
		return result;
	}
	
}
