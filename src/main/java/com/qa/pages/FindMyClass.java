package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.Base;

public class FindMyClass extends Base {
	/*
	 * 1) //p[contains(text(),' FILTERS')]
	 * 2) //p[text()=' FILTERS']
	 * 
	 * 
	 * 
	 */
	
	//@FindBy(xpath="//p[contains(text()='filter_hd')]")
	@FindBy(xpath="//p[@class='filter_hd']")
	WebElement filtertext;
	@FindBy(xpath="//i[@class='fa fa-search fa-fw fa-2x c_orange']")
	WebElement searchion;
	@FindBy(xpath="//input[@type='text']")
	WebElement searchbox;
	@FindBy(xpath="//img[@class='user_avatar_img']")
	WebElement userimage;
	@FindBy(xpath="//button[@class='profile_btns fg_blue brd_blue']")
	WebElement editprofile;
	public FindMyClass() {
		PageFactory.initElements(driver, this);
	}
	public void userImageIcon() throws InterruptedException {
		Thread.sleep(2000);
		userimage.click();
		
	}
	public EditProfilePage editProfileButton() throws InterruptedException {
		Thread.sleep(2000);
		editprofile.click();
		return new EditProfilePage();
	}
	public String getFilterText() throws InterruptedException {
		//String text=filtertext.getText();
		//return text;
		Thread.sleep(2000);
		System.out.println(filtertext.getAttribute("class"));
		return filtertext.getText();
		//return filtertext.isDisplayed();
		//return driver.getPageSource().contains("Text to check");
	}
	public void clickOnSearchIcon() throws InterruptedException {
		Thread.sleep(2000);
		searchion.click();
	}
	public void enterSearchBox() throws InterruptedException {
		Thread.sleep(2000);
		searchbox.sendKeys("yoga");
	}
	
	public void expandable() throws InterruptedException {
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath(".//*[text()='Gym ']"))).click();
		//act.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-classes/section/div/div/div[1]/div/app-filter/section/div/div[1]/div/div[4]/div[1]/h4/a"))).click();
		act.build().perform();
		Thread.sleep(1000);
		String pre="/html/body/app-root/app-classes/section/div/div/div[1]/div/app-filter/section/div/div[1]/div/div[4]/div[2]/div/div/div/div/div[";
	    int i=1;
	    String post="]/label";
	    try {
	    while(driver.findElement(By.xpath(pre+i+post))!=null) {
	    	String option=driver.findElement(By.xpath(pre+i+post)).getText();
	    	if(option=="NewGym") {
	    		driver.findElement(By.xpath(pre+i+post)).click();
	    	}else
	    	System.out.println(option);
	    	i++;
	    }}catch(Exception ex) {
	    	System.out.println("inside the loop");
	    }
	}
	    //check now count
	    public void classcount() throws InterruptedException {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//div[text()='DEC 27']")).click();
			//Actions act=new Actions(driver);
			Thread.sleep(2000);
			//act.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-classes/section/div/div/div[2]/div[1]/ngx-slick/div/div/div[2]/div/div[2]"))).click();
			//act.moveToElement(driver.findElement(By.xpath(".//*[text()='Gym ']"))).click();
			//act.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-classes/section/div/div/div[1]/div/app-filter/section/div/div[1]/div/div[4]/div[1]/h4/a"))).click();
			//act.build().perform();
			//Thread.sleep(1000);
			String pre="/html/body/app-root/app-classes/section/div/div/div[2]/div[2]/div[";
		    int i=1;
		    String post="]/div/div[1]/figure/span/img";
		    try {
		    while(driver.findElement(By.xpath(pre+i+post))!=null) {
		    	String option=driver.findElement(By.xpath(pre+i+post)).getAttribute("src");
		    	System.out.println(i+" "+option);
		    	i++;
		    }}catch(Exception ex) {
		    	System.out.println("inside the loop");
		    }
		    System.out.println(i);
	}
	

}
