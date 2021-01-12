package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class EditProfilePage extends Base {
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstname;
	
	public EditProfilePage() {
		PageFactory.initElements(driver, this);
	}
    public void FirstName() throws InterruptedException {
    	Thread.sleep(2000);
    	firstname.clear();
    	firstname.sendKeys("Atulya1");
    }
}
