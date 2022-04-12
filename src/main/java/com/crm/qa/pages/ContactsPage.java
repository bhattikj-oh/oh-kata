package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement createBtn;
	
	@FindBy(xpath = "//button[contains(text(), 'Save']")
	WebElement saveBtn;
	
	
	
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectContactsByName(String name){
		WebElement contactElement = driver.findElement(By.xpath("//a[text()='"+name+"']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(contactElement).click();

	}
	
	public void selectCheckboxOfContact(String name) {
		WebElement contactCheckbox = driver.findElement(By.xpath("//a[text()='"+name+"']//parent::div[contains(text(),'checkbox']"));
		Actions actions = new Actions(driver);
				actions.moveToElement(contactCheckbox).click();	
				
				
	}
	
	public void createNewContact(String ftName, String ltName, String comp){
//		Select select = new Select(driver.findElement(By.name("title")));
//		select.selectByVisibleText(title); 
		// No field called Title
		
		createBtn.click();
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
		
	}
	
	
	

}
