package Selenium;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
	WebDriver ss=new ChromeDriver();
		ss.get("https://www.facebook.com/");
		ss.manage().window().maximize();
		ss.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//local folder
		File pic=((TakesScreenshot)ss).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("C:\\Users\\kantu\\OneDrive\\Desktop\\capture\\fb.jpg"));
	    //project folder
		TakesScreenshot tss=(TakesScreenshot)ss;
		File pic1=tss.getScreenshotAs(OutputType.FILE);
		String folder=System.getProperty("user.dir")+"\\capture\\fac"+".png";
		FileUtils.copyFile(pic1, new File(folder));
		
	}

}
