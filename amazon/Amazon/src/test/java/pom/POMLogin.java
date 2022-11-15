package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.util.Strings;

import basepackage.BaseAmazonclass;

public class POMLogin extends BaseAmazonclass {

	//object repository
	@FindBy(id="ap_email")            //driver.findelement(By.
	WebElement Username;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement Signinbutton;
	
	//initiate page elements
	public POMLogin() {
		PageFactory.initElements(driver,this);
	}
	
	public void typeusername() {
	  Username.sendKeys("Chovatiya Sejal");
	  }
	
	public void Password() {
		Password.sendKeys("Sejal@123");
	}
	 
	public void Signinbutton() {
		Signinbutton.click();
	}
	
	public String verify() {
		return(driver.getTitle());
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
	
	
	
	
	
	
	
}
