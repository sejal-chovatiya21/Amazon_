package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonclass;
import pom.POMAddress;

public class Addaddress extends BaseAmazonclass {
	
	POMAddress Address;
	

	  public Addaddress() {
		  super();
		  
	  }
	  @BeforeMethod
	  public void initialsetup() {
		  initialsetup();
		  POMAddress add =new POMAddress();
	  }
	  
	  @Test
	  public void addaddress() {
		  Address.addaddressbutton();
			Address.Fullname(prop.getProperty("name"));
			Address.phonenumber(prop.getProperty("phonenumber"));
			Address.homeaddress(prop.getProperty("homeaddress"));
			Address.city(prop.getProperty("city"));
			Address.province();
			Address.provselec();
			Address.postalcode(prop.getProperty("postalcode"));
			Address.defaultadd();
			Address.addaddressbutton();
	  }
			
			@AfterMethod
			public void close(){
				driver.close();
			}
			
			
			
			
			

		   
	
	
	
	
}
