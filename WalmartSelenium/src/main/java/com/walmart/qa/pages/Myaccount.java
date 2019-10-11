package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class Myaccount extends TestBase {

	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='My Recommendations']")
	WebElement Recommendationpage;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='My Account ']")
	WebElement Myaccountlink;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='Order History ']")
	WebElement Orderhistory;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='My Lists']")
	WebElement MyListLink;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='My Subscriptions']")
	WebElement Mysubscriptions;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='Personal Settings']")
	WebElement PersonalSettings;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='Addresses']")
	WebElement Addressess;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='Credit Cards']")
		WebElement Creditcard;
	
	@FindBy (xpath="//parent::ul[@class='nav-list marg-b-1unit']//a[text()='Sign Out']")
	WebElement Signout;
	

	public Myaccount () {
		PageFactory.initElements(driver, this); //Initialization
		
	}
	
	
	public Recommendationpage clickOnRecommendationlink() {
		Recommendationpage.click();
				return new Recommendationpage();
		
	}
	public Myaccountlink clickOnMyaccountlink() {
		Recommendationpage.click();
				return new Myaccountlink();
		
	}
	
	public OrderHistoryPage clickOnOrderhistory() {
		Orderhistory.click();
				return new OrderHistoryPage();
	
}
	public MylistPage clickOnmylist() {
		MyListLink.click();
		return new MylistPage();
	}
	
	
	
	public Myaccountlink clickontheMyaccountlink() {
		Myaccountlink.click();
		return new Myaccountlink();
	
	
}
	public SubscriptionLink clickOnMysubscriptions() {
		Mysubscriptions.click();
				return new SubscriptionLink();
	}
	public PersonalSettingsPage clickOnpersonalsettings() {
		PersonalSettings.click();
				return new PersonalSettingsPage();
	}
	
	public AddressesPage clickOnAddresses() {
		Addressess.click();
		
		return new AddressesPage();
	}
	public CreditCardPage clickOnCreditcard() {
		Creditcard.click();
		
		return new CreditCardPage();
	}
	public SignOutPage clickOnSignout() {
		Signout.click();
		
		return new SignOutPage();
		
	}
	
}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
