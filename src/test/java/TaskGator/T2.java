package TaskGator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class T2 {
	static WebDriver driver;
	@AfterClass
	public void close() throws InterruptedException {
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 driver.close();
	}
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
}}
