package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.FindMyClass;
import com.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends Base {
	LoginPage lgp;
	LoginPageTest(){
		super();
		
	}
	@BeforeMethod
	public void initilize() {
		SetUp();
		 lgp=new LoginPage();
	}
	/*@Test
	public void LoginPageTitleTest() {
		try {
		//LoginPageTest lt=new LoginPageTest();
		String actual=lgp.validateLoginPage();
		//title is not matched message will be display when assertion is failed
		Assert.assertEquals(actual,"BURN | The most flexible fitness membership in kuwait","Title is not matched");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		}*/
/*	@Test
	public void logo() {
		boolean flag=lgp.logo();
		Assert.assertTrue(flag);
	}*/
	/*@Test
	public void loginTest() {
		lgp.login("atulya@mailinator.com", "123456");
	}*/
	@Test
	public void findMClassTest() throws InterruptedException {
		FindMyClass fmc=lgp.login("atulya@mailinator.com", "123456");
		fmc.expandable();
	}
	@AfterMethod
	public void close() {
		//driver.close();
	}
}
