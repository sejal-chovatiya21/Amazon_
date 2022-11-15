package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonclass;
import pom.POMLogin;

public class Logintestcases extends BaseAmazonclass {
         POMLogin log;
	public Logintestcases() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		POMLogin log = new POMLogin();
	}
	
	@Test
	public void Title() {
		String actual = log.verify();
		Assert.assertEquals(actual, "Amazon");
	}
	

	
	
	@AfterMethod
	public void close() {
		driver.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	    
	
	
}
