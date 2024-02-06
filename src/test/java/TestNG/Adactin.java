package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Adactin {
	static WebDriver driver;
  
	@Test(priority=2)
	void login() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vamshi@133");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		System.out.println("Test 2 passed");
	}
	@Test(priority=1)
	 void url() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
			System.out.println("Test 1 passed");
		}
	@Test(priority=3)
	void close() throws InterruptedException {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 Thread.sleep(2000);
		 driver.close();
		 System.out.println("Test 3 passed");
	 }
	
   
	
}
