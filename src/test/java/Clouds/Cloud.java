package Clouds;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cloud {
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
	public void register() throws IOException {
		cloud.findElement(By.xpath("//a[text()='Sign up']")).click();
		String file=System.getProperty("user.dir")+"\\DataDriven\\Cloud.xlsx";
		int row=Utils.getRowCount(file, "Details");
		int col=Utils.getCellCount(file, "Details", 1);
		String data=Utils.getCellData(file, "Details", 1, 1);
		for(int c=1;c<=col; c++) {
			
			String Name=Utils.getCellData(file, "Details", c, 0);
			String Clientid=Utils.getCellData(file, "Details", c, 1);
			String Phone=Utils.getCellData(file, "Details", c, 2);
			String email=Utils.getCellData(file, "Details", c, 3);
			String username=Utils.getCellData(file, "Details", c, 4);
			String Desc=Utils.getCellData(file, "Details", c, 5);
			String pwd=Utils.getCellData(file, "Details", c, 6);
			
			cloud.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Name);
			cloud.findElement(By.xpath("//input[@id='lastName']")).sendKeys(Clientid);
			cloud.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Phone);
			cloud.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			cloud.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
			cloud.findElement(By.xpath("//input[@id='desc']")).sendKeys(Desc);
			cloud.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			cloud.findElement(By.xpath("//button[@type='submit']")).click();
		}
		
	}



}
