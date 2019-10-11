package com.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walmart.qa.base.TestBase;

public class LoginPage extends TestBase{
	//OBJECT REPOSITORY
	@FindBy (name="email")
	WebElement emailaddress;

@FindBy (name="firstName")
  WebElement firstname;

@FindBy (name="lastName")
 WebElement lastname;

@FindBy (name ="password")
 WebElement password;

@FindBy (name ="confirmPassword")
 WebElement confirmPassword;

@FindBy (xpath="//*[@id=\"tnc\"]")
 WebElement Privacypolicy;

@FindBy (xpath="//div[@class='buttons-container wgrid-4w4 wgrid-4w8 wgrid-4w6 marg-l-0']//preceding-sibling::button[@id='create-account-btn']")
 WebElement CreateMyAccount;

@FindBy (xpath="//button[@id='account-signin-btn']")
WebElement signinbutton;

//initializing the page object or Page factory
public LoginPage () {
	PageFactory.initElements(driver, this);}// all these elements in this driver and THIS means current class variable will b initialize.
	
	//Actions
public String validateLoginPageTitle() {
 	return driver.getTitle();
}

//public Myaccount login(String email,String fname, String lname, String pwd, String cnpwd) {
	//emailaddress.sendKeys(email);
   //firstname.sendKeys(fname);
  //lastname.sendKeys(lname);
  // password.sendKeys(pwd);
   // confirmPassword.sendKeys(cnpwd);
    //Privacypolicy.click();
   // CreateMyAccount.submit();
 // return new Myaccount ();

public Myaccount login(String email, String pwd) {
	emailaddress.sendKeys(email);
	password.sendKeys(pwd);
	signinbutton.click();
	
	return new Myaccount();


  
}

}






