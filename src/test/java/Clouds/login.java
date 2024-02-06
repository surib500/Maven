package Clouds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	public static WebDriver cloud;
	@Test(priority=1)
	public void url() throws InterruptedException {
		cloud=new ChromeDriver();
		cloud.get("https://e2e.cloudtesla.com/");
		cloud.manage().window().maximize();
		cloud.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void login() throws InterruptedException {
		cloud.findElement(By.xpath("//input[@id='username']")).sendKeys("surib500");
		cloud.findElement(By.xpath("//input[@id='password']")).sendKeys("Amma@12345");
		cloud.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		cloud.findElement(By.className("caret")).click();
		Thread.sleep(2000);
		cloud.findElement(By.xpath("//a[@target='_self']")).click();
	}

	public void close() {
		cloud.close();
	}
}
