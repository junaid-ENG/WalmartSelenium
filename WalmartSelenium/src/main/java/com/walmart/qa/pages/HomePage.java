package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy (xpath="//button[@id='account-signin-btn']")
	WebElement Signuplink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
			
		
	}
	public Myaccount ClickonSignuplink() {
		Signuplink.click();
		return new Myaccount();
		
		
	}
	
	
	
	
	

}
