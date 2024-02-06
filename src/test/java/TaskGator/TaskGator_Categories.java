package TaskGator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TaskGator_Categories {
	static WebDriver driver;
	@Test(priority=1)
	public void url() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://products.ncryptedprojects.com/taskgator/");

	}
	@Test(priority=2)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("buyer.ncrypted@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("sbtLogin")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void Categories() {
	  

	}
}