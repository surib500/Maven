package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Screenshot {
	
static WebDriver fb;
	public static void main(String[] args) throws IOException {
		 fb=new ChromeDriver();
		fb.get("https://www.facebook.com/");
		fb.manage().window().maximize();
		fb.findElement(By.id("email")).sendKeys("9618329079");
		fb.findElement(By.id("pass")).sendKeys("Amma@123$");
		fb.findElement(By.xpath("//button[@name='login']")).click();
		capture();
	}

		public static  void capture() throws IOException{
			TakesScreenshot tss=(TakesScreenshot)fb;
			File pic=tss.getScreenshotAs(OutputType.FILE);
			String folder=System.getProperty("user.dir")+"\\capture\\facebook_login.png";
			FileUtils.copyFile(pic, new File(folder));
			
		}			
		

	

}
