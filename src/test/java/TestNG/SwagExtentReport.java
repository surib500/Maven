package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagExtentReport {
static WebDriver labs;
@Test(priority=1)
public void url() {
	labs=new ChromeDriver();
	labs.get("https://www.saucedemo.com/");
	labs.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	labs.manage().window().maximize();
}
@Test(priority=2)
public void login() throws InterruptedException {
	Thread.sleep(2000);
	labs.findElement(By.id("user-name")).sendKeys("standard_user");
	labs.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
}
@Test(priority=3)
public void close() throws InterruptedException {
	Thread.sleep(2000);
	labs.close();
}
}