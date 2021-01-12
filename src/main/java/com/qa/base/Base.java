package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	//initialize the webdriver
	public static WebDriver driver=null;
	static Properties prop;
	public Base(){
		try {
			prop= new Properties();
			//
			
			//FileInputStream ip=new FileInputStream("F:\\appium_workspace\\FreeCms\\src\\main\\java\\com\\qa\\config\\config.properties");
			FileInputStream ip=new FileInputStream("E:\\appium_workspace\\FreeCms\\src\\main\\java\\com\\qa\\config\\config.properties");
	        prop.load(ip); 	
	        System.out.println("test");
		}catch(Exception e) {
			System.out.println("file not found");
		}
	}
	public static void SetUp() {
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.out.print("driver not found");
			//System.setProperty("webdriver.chrome.driver","F:\\appium_workspace\\FreeCms\\chromedriver");
			//System.setProperty("webdrive.chrome.driver","F:\\chromedriver");
			//System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			System.setProperty("webdrive.chrome.driver","F:\\appium_workspace\\FreeCms\\chromedriver");
			//initialization
			 driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}else if(browser.equals("firefox")){
			//String y=System.getProperty("user.dir");
			//System.out.print(y);
			//System.setProperty("webdriver.gecko.driver","F:\\appium_workspace\\FreeCms\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver","E:\\appium_workspace\\FreeCms\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		driver.manage().window();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
