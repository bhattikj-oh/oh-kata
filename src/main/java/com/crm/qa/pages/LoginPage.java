package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;
import com.google.gson.annotations.Until;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy (name="email")  //changed this because it's email now instead of username
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(className = "cogmento-loading-spinner")
	WebElement spinner;
	 
	
//	@FindBy(xpath="//a[contains(text(),'Login')]")
//	WebElement loginBtn;

	@FindBy(xpath="//div[contains(@class,'blue submit button')]")
	WebElement loginBtn;
	
	
//	@FindBy(xpath = "//div@class='ui fluid large blue submit button'")
//	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	
	
	FreeCrmPage freeCrmPage;
	
	//Initializing the Page Objects:
	public LoginPage(){
		//when class="cogmento-loading-spinner" disappears 
		
//		new WebDriverWait(driver, TestUtil.IMPLICIT_WAIT).until(ExpectedConditions.invisibilityOf(spinner));
		new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.xpath("//div[@class='cogmento-loading-wrapper']"))));
		PageFactory.initElements(driver, this);

	}
	
	//Actions:
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		
		email.sendKeys(un);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		password.sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginBtn.click();
//		    	JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", loginBtn);
//		    	
		return new HomePage();
	}
	
}
