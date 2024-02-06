package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_mmt {

	public static void main(String[] args) {
		WebDriver mmt=new ChromeDriver();
		mmt.manage().window().maximize();
		mmt.get("https://www.makemytrip.com/bus-tickets/");
		 
		String fmonth="March 2024";
		mmt.findElement(By.xpath("//input[@id='travelDate']")).click();
		while(true)
		{
		String cmonth=	mmt.findElement(By.xpath("//div[@class='DayPicker-Months']")).getText();
		if(cmonth.equals(fmonth))
		{
			break;
		}
		else
		{
			mmt.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
		mmt.findElement(By.xpath("//div[@aria-label='Wed Mar 13 2024']")).click();
	}

}
