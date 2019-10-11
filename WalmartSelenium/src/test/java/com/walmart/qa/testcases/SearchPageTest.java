package com.walmart.qa.testcases;


import java.util.List;
import java.util.Properties;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.JacketPage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.Myaccount;
import com.walmart.qa.pages.Pagination;
import com.walmart.qa.pages.Searchpage;

public class SearchPageTest extends TestBase {
	LoginPage loginpage;
	Myaccount myaccount;
	Searchpage searchpage;
	
	
	
	public SearchPageTest() {
	super();
		
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("email"), prop.getProperty("Password"));
	    searchpage = new Searchpage();
	        
	}
	
   // @Test(priority=1)
    //public void Alertpopup() {
	//searchpage.alert();
	//}
		//String beforeXpath="//*[@id=\"shelf-pagination\"]/div[2]/ul/li[";
		//String afterXpath= "]/a";
	  		//for (int i=1; i<=7; i++) {
		//	String actualxpath= beforeXpath+i+afterXpath;
		//	WebElement element= driver.findElement(By.xpath(actualxpath));
		//	System.out.println(element.getText());
		//	if(element.getText().equals("//*[@id=\"thumb-0SONWS8UYCFK\"]/a/div[3]/div[1]/div[1]/h2")) {
		//		System.out.println("leather : " +element.getText()+ " is found" );
		//		 break;
		 
		//	}
	@Test(priority=1)
	public void EnterInputinSearchpageTest() {
    searchpage.Inputinsearch();
    }
	
    @Test (priority=2)
	public void PaginationTest() {
	searchpage.InputinSearch();
	
    }
    
  //  @Test (priority=3)
  //  public void ClickonHalloweenlinkTest() {
    //	searchpage.ClickonHalloweenLink();
    	
   // }
    //@Test (priority=4)
    //public void ClickonelectronicslinkTest() {
    //	searchpage.Clickonelectronicslink();
    //}
    //@Test (priority=5)
    //public void ClickonClothinglinkTest() {
    //	searchpage.Clickonclothinglink();
    //}
    //@Test (priority=6)
    //public void ClickonThanksgivingTest() {
    	//searchpage.Clickonthanksgivinglink();
   // }
    
}	
	//@Test(priority=2)
	//public void EnterInsearchLink() {
	//	searchpage.EnterInSearchlink();
	//}
	