package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Calendar_3types {
 static WebDriver cal;
	public static void main(String[] args) throws InterruptedException {
		cal=new ChromeDriver();
		cal.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		cal.manage().window().maximize();
		 
		//first date
		cal.findElement(By.id("first_date_picker")).click();
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td//a[text()=8]")).click();
		//sixth date
		cal.findElement(By.id("sixth_date_picker")).sendKeys("12/21/2023");
		//second date
		cal.findElement(By.id("second_date_picker")).click();
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class, ' ui-datepicker-other-month '))]//a[text()=2]")).click();
		//third date
		cal.findElement(By.id("third_date_picker")).click();
		Select call=new Select(cal.findElement(By.className("ui-datepicker-month")));
		call.selectByIndex(4);
		Select call1=new Select(cal.findElement(By.className("ui-datepicker-year")));
		call1.selectByValue("2016");
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td//a[text()=14]")).click();
        
		
		//switch to new tab
		cal.switchTo().newWindow(WindowType.TAB);
		cal.get("https://demo.guru99.com/test/");
	WebElement	dt=cal.findElement(By.name("bdaytime"));
		dt.sendKeys("12112016");
		dt.sendKeys(Keys.TAB);
		dt.sendKeys("0230");
		Thread.sleep(2000);
		Set<String> win=cal.getWindowHandles();
		Iterator<String> tabs=win.iterator();
		String parent=tabs.next();
		String child=tabs.next();
		cal.switchTo().window(parent).close();
		Thread.sleep(2000);
		cal.switchTo().window(child).close();
		
	}

}
