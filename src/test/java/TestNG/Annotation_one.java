package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_one {
	@Test
	void one() {
		System.out.println("ONE");
	}
 @BeforeTest
	void two() {
		System.out.println("TWO");
	}
 @AfterTest
	void three() {
		System.out.println("THREE");
	}
 @AfterMethod
 void five() {
	 System.out.println("FIVE");
 }
 @BeforeMethod
 void six(){
	 System.out.println("SIX");
 }
}
