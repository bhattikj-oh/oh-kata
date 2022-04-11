package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FreeCrmPage extends TestBase {

	
	public FreeCrmPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String FreeCrmTitleTest() {
		return driver.getTitle();
	}
	
	
}
