package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonclass;

public class POMSearch extends BaseAmazonclass {
          
	@FindBy(id=("twotabsearchtextbox")) WebElement Search;
	@FindBy(xpath=("//*[@id=\"nav-search-submit-button\"]")) WebElement Searchbutton;
	
	//initiate page elements
		public POMSearch() {
			PageFactory.initElements(driver,this);
		}
		
		public void Search(String search) {
			Search.sendKeys(search);
		}
		public void Searchbutton() {
			Searchbutton.submit();
		}
	  
	
	
	
	
	
}
