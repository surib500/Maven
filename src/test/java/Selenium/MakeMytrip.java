package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMytrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver mmt = new ChromeDriver();
		mmt.get("https://www.makemytrip.com/bus-tickets/");
		mmt.manage().window().maximize();
		mmt.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		// Selecting From and To 
		mmt.findElement(By.xpath("//input[@id='fromCity']")).click();
		mmt.findElement(By.xpath("//input[@title='From']")).sendKeys("goa");
		mmt.findElement(By.xpath("//span[@class='sr_city blackText'][text()='Goa']")).click();
		mmt.findElement(By.xpath("//input[@title='To']")).sendKeys("Hyderabad");
		mmt.findElement(By.xpath("//span[@class='sr_city blackText'][text()='Hyderabad Airport, Telangana']")).click();
		//date picking 
		Actions act=new Actions(mmt);
	    WebElement s=mmt.findElement(By.xpath("//span[@aria-label='Next Month']"));
	    act.doubleClick(s).perform();
	    mmt.findElement(By.xpath("//div[@class='DayPicker-Month']//div[@aria-label='Fri Mar 22 2024']")).click();		
	   
	  
		 
	}

}
