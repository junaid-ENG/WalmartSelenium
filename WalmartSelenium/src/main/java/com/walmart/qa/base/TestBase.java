package com.walmart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.walmart.qa.util.Test_util;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
	try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream ("C:\\Users\\Hammad\\git\\walmart-pro\\WalmartTest\\src\\main\\java\\com\\walmart\\qa\\config\\config.properties");
				prop.load (ip);
				
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println ("error");
	} catch (IOException e) {
		e.printStackTrace ();
		System.out.println ("this is IOException");

	}}

public static void initialization () {
	
	String browserName = prop.getProperty("browser");
	if (browserName.equals("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hammad\\Desktop\\Selenium\\geckodriver.exe");
	     driver = new FirefoxDriver();//launch firefox
	     	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Test_util.PAGE_LONG_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Test_util.IMPLICIT_Wait, TimeUnit.SECONDS);
	
	
	driver.get(prop.getProperty("url"));   
	
	
	
}
}


		

