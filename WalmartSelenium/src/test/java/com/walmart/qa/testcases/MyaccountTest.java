package com.walmart.qa.testcases;

//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.AddressesPage;
import com.walmart.qa.pages.CreditCardPage;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.Myaccount;
import com.walmart.qa.pages.Myaccountlink;
import com.walmart.qa.pages.MylistPage;
import com.walmart.qa.pages.OrderHistoryPage;
import com.walmart.qa.pages.PersonalSettingsPage;
import com.walmart.qa.pages.Recommendationpage;
import com.walmart.qa.pages.SignOutPage;
import com.walmart.qa.pages.SubscriptionLink;

public class MyaccountTest extends TestBase {
	LoginPage loginPage;
    Myaccount account1;
	HomePage homepage;
	Recommendationpage Recommendationpage;
	Myaccountlink Myaccountlink;
	 MylistPage mylistlink;
	 SignOutPage signoutlink;
	 CreditCardPage creditcardlink;
	 AddressesPage addressesslink;
	 PersonalSettingsPage personalsettingslink;
	 SubscriptionLink mysubscriptionslink;
	 OrderHistoryPage orderhistorylink;

	

	
	public MyaccountTest() {
		super();
		
	}
		
	@BeforeMethod
	public void setup(){
	initialization();
	
	loginPage= new LoginPage();
	loginPage.login(prop.getProperty("email"), prop.getProperty("Password"));
	homepage = new HomePage();
	homepage.ClickonSignuplink();
	account1 = new Myaccount();
	
	
	
	}
	
	@Test(priority=1)
	public void clickOnRecommendationlink()  {
		Recommendationpage =  account1.clickOnRecommendationlink();
		
	}
     @Test(priority=2)
     public void clickOnOrderhistory() {
    	 orderhistorylink = account1.clickOnOrderhistory();
    	  	  
    	}
     @Test(priority=3)
     public void clickOnMysubscriptionsTest() {
    	 mysubscriptionslink = account1.clickOnMysubscriptions();
     }
    	     	       	   	
     @Test(priority=4)
     public void clickOnpersonalsettingsTest() {
    	 personalsettingslink= account1.clickOnpersonalsettings();
     }
     @Test(priority=5)
     public void clickOnAddressesTest() {
    	 addressesslink= account1.clickOnAddresses();
     }
     @Test(priority=5)
     public void clickOnCreditcardTest() {
    	 creditcardlink= account1.clickOnCreditcard();
     }
     @Test(priority=6)
     public void clickOnSignoutTest() {
    	signoutlink= account1.clickOnSignout();
     }
     @Test(priority=7)
     public void clickOnmylistTest() {
    	mylistlink= account1.clickOnmylist();
     }

	  @Test(priority=8) public void clickOnMyaccountlink() { Myaccountlink =
	 account1.clickOnMyaccountlink(); 
	  }
	
     
@AfterMethod
	
public void tearDown() {
		driver.quit();
	}
	
    }
	
	
	
	


