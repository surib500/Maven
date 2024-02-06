package PRACTICE;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DataDriven.ExcelUtils;

public class Swag_Login {
	public static WebDriver task;
	@BeforeClass
	public void url() throws InterruptedException {
		task=new ChromeDriver();
		task.get("https://www.saucedemo.com/");
		task.manage().window().maximize();
		task.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);}

	@Test
	public void register() throws IOException, InterruptedException {
		String file=System.getProperty("user.dir")+"/DataDriven/Swag.xlsx";
		int row=ExcelUtils.getRowCount(file, "Details");
		for(int r=0;r<=row;r++) { 
			//we need to read from XL
			String uname=ExcelUtils.getCellData(file, "Details", r, 0);
			String pwd=ExcelUtils.getCellData(file, "Details", r, 1);
			//login WebElemetns we need to write
			Thread.sleep(2000);
			task.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			task.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			task.findElement(By.xpath("//input[@id='login-button']")).click();

			//act and exp results 

			String exp="https://www.saucedemo.com/inventory.html";
			String act=task.getCurrentUrl();
			if(act.equals(exp)) {
				System.out.println("Passed");
				ExcelUtils.setCellData(file, "Details", r, 2, "Pass");
				ExcelUtils.fillGreenColor(file, "Details", r, 2);
				task.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
				Thread.sleep(1000);
				task.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			}
			else {
				System.out.println("Failed");
				ExcelUtils.setCellData(file, "Details", r, 2, "Fail");
				ExcelUtils.fillRedColor(file, "Details", r, 2);}
		}
	}
	@AfterClass
	void close() {
		task.close();
	}
}
