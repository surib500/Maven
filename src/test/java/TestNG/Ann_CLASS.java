package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ann_CLASS {
	@BeforeClass
	void url() {
		System.out.println("Open  url");
	}
	@Test(priority=1)
	void product() {
		System.out.println("Product details");
	}
	@Test(priority=2)
	void payment() {
		System.out.println("payment done");
	}
	@AfterClass
	void close() {
		System.out.println("browser close");
	}

}
