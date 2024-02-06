package TaskGator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TaskGator_Register {

	static WebDriver TG;

	@BeforeTest
	public void url() {
		TG=new ChromeDriver();
		TG.manage().window().maximize();
		TG.get("https://products.ncryptedprojects.com/taskgator/");
		TG.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void Signup() throws InterruptedException {

		TG.findElement(By.xpath("//span[text()='Sign up']")).click();
		TG.findElement(By.id("firstName")).sendKeys("Suri");
		TG.findElement(By.id("lastName")).sendKeys("Babu");
		TG.findElement(By.name("email")).sendKeys("surib450@gmail.com");
		TG.findElement(By.name("contact_number")).sendKeys("9160345690");
		TG.findElement(By.id("password")).sendKeys("Surib500");
		TG.findElement(By.id("repassword")).sendKeys("Surib500");
		JavascriptExecutor js=((JavascriptExecutor)TG);
		js.executeScript("window.scrollBy(0,150)", "");
		TG.switchTo().frame(TG.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		TG.findElement(By.className("recaptcha-checkbox-border")).click();
		TG.switchTo().defaultContent();
		Thread.sleep(1000);
		TG.findElement(By.xpath("//button[@id='sbtRegi']")).click();
		Thread.sleep(5000);
	}
	@AfterTest
	public void close() {
		TG.close();
	}
}
