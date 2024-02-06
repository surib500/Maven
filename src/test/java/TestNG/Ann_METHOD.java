package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ann_METHOD {
	@BeforeMethod
	void url() {
		System.out.println("Open url");
	}
	@Test(priority=1)
	void product() {
		System.out.println("Product details");
	}
	@AfterMethod
	void close() {
		System.out.println("close browser");
	}
	@Test(priority=2)
    void payment() {
    	System.out.println("Payment done");
    }
}
