package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lis_Text {
	@Test(priority=1)
	void test1() {
		System.out.println("test1");
	}
	@Test(priority=2)
	void test2() {
		System.out.println("test2");
	}
	@Test(priority=3,dependsOnMethods= {"test2"})
	void test3() {
		System.out.println("Test3");
	}
}
