package Clouds;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Sr {
	WebDriver driver;
	@BeforeClass
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://e2e.cloudtesla.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}@Test(dataProvider= "Data")
	public void signup(String name,String clientid,String phonenumber,String email,String username,String description,String password) throws InterruptedException {
		Thread.sleep(1000);
		WebElement su=driver.findElement(By.xpath("//a[text()='Sign up']"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView()",su);
		su.click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Client id']")).sendKeys(clientid);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='desc']")).sendKeys(description);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@AfterClass
	void close() {
		//driver.quit();
	}
	@DataProvider(name= "Data")
	  String[][] Singupdata(){
	String[][] Data= {{"testuser","test_interviewclient","8989898989","user1@gmail.com","user1","tester", "123456"}};
		return  Data;
		
	}
}
