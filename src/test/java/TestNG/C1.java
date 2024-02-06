package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
   void s (){
	   System.out.println("babu");
   }
   @BeforeTest
   void ss() {
	   System.out.println("Suri");
   }
}
