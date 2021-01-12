package com.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.EditProfilePage;
import com.qa.pages.FindMyClass;
import com.qa.pages.LoginPage;

public class EditProfileTest extends Base {
	LoginPage log;
	FindMyClass fm;
	EditProfilePage editp;
	EditProfileTest(){
		super();
	}
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		SetUp();
		log=new LoginPage();
	    fm=log.login("atulya@mailinator.com", "123456");
	    fm.userImageIcon();
		editp=fm.editProfileButton();
	}
	@Test
	public void editProileTest() throws InterruptedException {
		editp.FirstName();
	}

}
