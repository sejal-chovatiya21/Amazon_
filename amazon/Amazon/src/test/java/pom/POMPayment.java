package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonclass;

public class POMPayment extends BaseAmazonclass {

	@FindBy(id=("nav-link-accountList")) WebElement Hello;
	@FindBy(xpath=("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2")) WebElement Yourpayment;
	@FindBy(xpath=("@FindBy(xpath=(")) WebElement PaymentDisplay;
	@FindBy(xpath=("//*[@id=\"pp-EDUx47-12\"]/span/input")) WebElement Addpayment;
	
	public POMPayment() {
		PageFactory.initElements(driver,this);
	}
	
	public void YourPayment() throws InterruptedException {
		Yourpayment.click();
		boolean result=PaymentDisplay.isDisplayed();
		System.out.println(result);
		Addpayment.click();		
		//AddPayment1.click();
	
	
}


}