package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class LoginPage extends Base  {
// we have to define object repository or page factory
	//@findBy use page factory
	@FindBy(xpath="//*[@id=\"LoginButton\"]/a")
	WebElement login;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"logintab\"]/app-loginnew/form/div[3]/button")
	WebElement lgnbtn;
	@FindBy(xpath="/html/body/app-root/app-navigation/header/nav/div/div[2]/figure/a/img")
	WebElement burnlogo;
	//initializing all element of login page use PageFactory
	public LoginPage(){
		//all locator initialize in driver and use this or LoginPage.this means current class object
		PageFactory.initElements(driver, LoginPage.this);
	}
	public String validateLoginPage() {
		return driver.getTitle();
	}
	public boolean logo() {
		return burnlogo.isDisplayed();
	}
	public FindMyClass login(String id,String pwd) throws InterruptedException {
		login.click();
		email.sendKeys(id);
		password.sendKeys(pwd);
		Thread.sleep(1000);
		lgnbtn.click();
		// after login FindMyClass page is landing so FMC page object retun
		return new FindMyClass();
	}
}
