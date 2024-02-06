package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class provider {
	public WebDriver driver;
	@BeforeMethod
	public void url() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://products.ncryptedprojects.com/taskgator/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="swag")
	public void login(String user, String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.id("sbtLogin")).click();
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	@AfterMethod
	public void close()  {
		driver.quit();
	}
	@DataProvider(name="swag")
	String [][]details(){
		String [][] us_pa= {
				{"buyer.ncrypted@gmail.com","123"},
				{"seller.ncrypted@gmail.com","123456"}};
		return us_pa;
	}

}
