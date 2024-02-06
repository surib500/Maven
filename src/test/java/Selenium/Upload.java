package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver upload=new ChromeDriver();
		
		upload.get("https://demo.guru99.com/test/upload/");
		upload.manage().window().maximize();
		//using sendkeys
		//upload.findElement(By.name("uploadfile_0")).sendKeys("A:\\MY\\5.jpg");
		//using robot
		
		  Actions act=new Actions(upload); 
		  WebElement s=upload.findElement(By.name("uploadfile_0")); 
		  act.click(s).perform();
		 
		  //copy file from locator
		  StringSelection sel=new StringSelection("C:\\Users\\kantu\\OneDrive\\Desktop\\CORE JAVA QUESTIONS.txt");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null) ;
		  Robot file=new Robot();
		  //paste data
 		  file.keyPress(KeyEvent.VK_CONTROL);
 		  Thread.sleep(1000);
 		  file.keyPress(KeyEvent.VK_V);
 		  Thread.sleep(1000);
		  //release keys
		  file.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(1000);
		  file.keyRelease(KeyEvent.VK_V); 
		  Thread.sleep(1000);
		  //press enter
		  file.keyPress(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  file.keyRelease(KeyEvent.VK_ENTER);
		 

	}

}
