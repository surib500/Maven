package TaskGator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T1 {
	static WebDriver driver;
	@Test
	void login() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vamshi@133");
	}
	@BeforeClass
	void url() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		System.out.println("Test 1 passed");
	}
}
