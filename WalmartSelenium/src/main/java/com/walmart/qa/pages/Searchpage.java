package com.walmart.qa.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.walmart.qa.base.TestBase;

public class Searchpage extends TestBase{
	
	 @FindBy (xpath="//*[@id=\"global-search\"]")
     WebElement searchlink;
     
	 @FindBy (xpath="/html/body/div[1]/header/div[2]/div/div[4]/form/button")
	 WebElement button;
	 
	 @FindBy (xpath="//*[@id=\"shelf-sort\"]/ul/li[4]/a")
	 WebElement price;
     
	 @FindBy (xpath="//*[@id=\"header-halloween\"]/a")
	 WebElement halloweenlink;
	 
	 @FindBy (xpath="//*[@id=\"header-thanksgiving\"]/a")
	 WebElement thanksgivinglink;
	
	 @FindBy (xpath="//*[@id=\"header-electronics\"]/a")
	 WebElement electronicslink;
	 
	 @FindBy (xpath="//*[@id=\"header-clothing\"]/a")
	 WebElement clothinglink;
	
	public Searchpage() {
		PageFactory.initElements(driver, this);
		
	}
	public JacketPage Inputinsearch() {
	searchlink.click();
	searchlink.sendKeys("leather jackets");
	button.click();
	price.click();
	price.click();
	return new JacketPage();
	}
	
	
	public JacketPage InputinSearch() {
	searchlink.click();
	searchlink.sendKeys("leather jackets");
	button.click();
	price.click();
	price.click();
	List pagination = driver.findElements(By.xpath("//*[@id=\"loadmore\" and @class='page-select-list-btn']//parent::ul[@class='page-select-list hide-list-items-mobile show-tail-ellipsis-mobile']"));
	//check if pagination link exist
	    if(pagination.size()>0) {
		System.out.println("pagination exists" + pagination.size());
	    //click on pagination link
		for(int i=0; i<pagination.size(); i++);{
		int i = 0;
		((WebElement)pagination.get(i)).click();
        }
       	} else {
			System.out.println("pagination not exists");
		}
	 // Select rangeSelector= new Select (driver.findElement(By.xpath("//select[@class='page-select']")));
	 // rangeSelector.selectByIndex(1);
	  
	  return new JacketPage();
	}
	
	
     public Halloweenpage ClickonHalloweenLink() {
    	 halloweenlink.click();
    	 return new Halloweenpage();
    	 
     }
	
     public ThanksgivinPage Clickonthanksgivinglink() {
    	 thanksgivinglink.click();
    	 return new ThanksgivinPage();
	
	}
     
     
     public Electronicspage Clickonelectronicslink() {
    	 electronicslink.click();
    	 return new Electronicspage();
     }
     
     
     public ClothingPage Clickonclothinglink() {
    	clothinglink.click();
    	 return new ClothingPage();
}		
}
//	public void alert() {
	//driver.switchTo().alert();
    //Alert alert= driver.switchTo().alert();
	//alert.dismiss();			
		
	//}
		
	//public void EnterInSearchlink() {
	//searchlink.sendKeys("Leather Jackets");

	//}
	

	
	
	
	
	
	
	


