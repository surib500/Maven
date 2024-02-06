package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_DependsonMethods {
	static WebDriver driver;
	@Test(priority=1)
	void url() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=2)
	void login() throws InterruptedException {
		Thread.sleep(1000);
		//Assert.assertFalse(true);// stop executing login and dashboard
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123", Keys.ENTER);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void dashboard() {
		String expected="OrangeHRM";
		String actual = driver.getTitle();
		System.out.println(actual);
		//Assert.assertEquals(actual, expected); //Failed
	//	Assert.assertNotEquals(expected, actual);//Passed
		//Assert.assertTrue(false);//hard Assert-failed 1
		//Assert.assertFalse(true);//hard Assert-failed 1
		//Assert.assertFalse(false);//hard Assert-passed
		//Assert.assertTrue(true);//hard Assert-passed
	}
	// @Test(priority=4)
	void close() {
		driver.close();
	}
}
