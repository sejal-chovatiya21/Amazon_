package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basepackage.BaseAmazonclass;

public class POMAddress extends BaseAmazonclass {
 
	@FindBy(id=("nav-link-accountList")) WebElement Hello;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[1]/img") WebElement YourAddresses;
	@FindBy(xpath ="//*[@id=\"ya-myab-address-add-link\"]/div/div") WebElement Addaddress;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-countryCode\"]/span/span") WebElement Region;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressFullName\"]")  WebElement Fullname;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]") WebElement Phonenumber;
    @FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressLine1\"]")WebElement Address;
    @FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressCity\"]") WebElement City;
    @FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span" ) WebElement Province;
    @FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]") WebElement Postalcode;
    @FindBy(xpath="@FindBy(xpath=") WebElement Default;
    @FindBy(xpath=" @FindBy(xpath") WebElement Addaddressbutton;
    @FindBy(xpath=" @FindBy(xpath=") WebElement Saveaddess;
    
  //Initiate Page elements
  		public POMAddress() {
  			PageFactory.initElements(driver, this);
  		}
    
  		public void Hello() {
  			Hello.click();
  			System.out.println(Hello);
  		}
  		
  		public void Fullname(String name) {
			Fullname.sendKeys(name);
			
		}
		public void phonenumber(String number) {
			Phonenumber.sendKeys(number);
			
		}
		public void homeaddress(String address) {
			Address.sendKeys(address);
			
		}
		public void city(String name) {
			City.sendKeys(name);
			
		}
		public void province() {
			Province.click();
			
		}
		public void provselec() {
			Actions action= new Actions(driver);
			action.moveToElement(Addaddressbutton).build().perform();
			Addaddressbutton.click();
			
		}
		public void postalcode(String code) {
			Postalcode.sendKeys(code);
			
		}
		public void defaultadd() {
			Default.click();
			
		}
		public void addaddressbutton() {
			Addaddress.click();
			String actual=Addaddress.getText();
			Assert.assertEquals(actual, "Address saved");
			System.out.println(actual);
		}
		
  		
		 
  		
    
    
	
	
	
	            
	
	
	
	
	
	
	
	
}
