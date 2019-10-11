package com.walmart.qa.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.Myaccount;
import com.walmart.qa.util.Test_util;

public class AccountTest extends TestBase  {
     LoginPage  loginPage;
     Myaccount myaccount;
     HomePage homepage;
     
  
     
	public AccountTest () {
		super();
		
	}
	
	@BeforeMethod
	public void setup()  {
	initialization();
	
	 loginPage= new LoginPage();
	
	//String myaccount=loginPage.login(prop.getProperty("email"),prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("Password"),prop.getProperty("confirmPassword"));
	 	loginPage.login(prop.getProperty("email"), prop.getProperty("Password"));
	 	homepage= new HomePage();
	 	myaccount = new Myaccount();
	 	
	 				
     }
	
	//@Test(priority =1)
//	public void verifyaccountpageTitleTest() {
	//	String accountPageTitle = myaccount.verifyaccountpageTitle();
	//	Assert.assertEquals(accountPageTitle, "Walmart Canada","Account Page Title not matched");
	
	//	}
	@Test(priority=1)
	public void ClickonSignuplinkTest () {
				homepage.ClickonSignuplink();
		
	}
	
	
	
	
	
//@AfterMethod
	
	//public void tearDown() {
	//	driver.quit();
}
		
//}
