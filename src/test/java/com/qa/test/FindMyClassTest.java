package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.FindMyClass;
import com.qa.pages.LoginPage;

public class FindMyClassTest extends Base {
	LoginPage lgn;
	FindMyClass fmc;
	
	FindMyClassTest(){
		super();
	}
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
	SetUp();
	lgn=new LoginPage();
	fmc=lgn.login("atulya@mailinator.com", "123456");
	}
	
	/*@Test
	public void fiterTextTest() throws InterruptedException {
		String flag=fmc.getFilterText();
		Assert.assertEquals(flag,  "FILTERS","text is not matched");
		System.out.println("Filter is matched");
	}*/
	/*@Test
	public void serchIconTest() throws InterruptedException {
		fmc.clickOnSearchIcon();
		fmc.enterSearchBox();
	}*/
/*	@Test
	public void countGym() throws InterruptedException {
		fmc.expandable();
	}*/
	/*@Test
	public void countGym() throws InterruptedException {
		fmc.classcount();
	}*/
	@Test
	public void clickOnEdit() throws InterruptedException {
		fmc.userImageIcon();
		fmc.editProfileButton();
	}
}
