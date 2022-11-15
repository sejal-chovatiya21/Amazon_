package testlayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonclass;
import pom.POMPayment;

public class Payment extends BaseAmazonclass {

	
	POMPayment Orders;
	POMPayment Payment;
	public  Payment() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Payment=new POMPayment();
		Orders=new POMPayment();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		
	}
	@Test(enabled=false)
	public void payments() throws InterruptedException {
		Orders.hello1();
		Payment.YourPayment();
	}
	@Test
	public void addpayment() throws InterruptedException {
		Orders.hello11();
		Payment.YourPayment();
	}
	
}
