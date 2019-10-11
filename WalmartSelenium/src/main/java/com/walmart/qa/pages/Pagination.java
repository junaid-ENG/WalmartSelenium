package com.walmart.qa.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.walmart.qa.base.TestBase;

public class Pagination extends TestBase{

 @FindBy (xpath="#shelf-pagination > div.page-select-list-container > ul > li > a")
 WebElement Pageselector;
 	
 
 @FindBy (xpath="\"#shelf-pagination > div.page-select-list-container > ul > li >a:nth-child(\"+1+\")\"")
 WebElement paginationSelector;
 

public int Paginitionloop() {
	
	
	Dimension pagination = Pageselector.getSize();
	return 0;
	
	
	
	
	
}
}