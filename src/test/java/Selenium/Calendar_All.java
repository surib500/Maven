package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calendar_All {

	public static void main(String[] args) {
		
		WebDriver cal=new ChromeDriver();
		cal.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		cal.manage().window().maximize();
		
		
		//first calendar selecting element on that month 
		cal.findElement(By.id("first_date_picker")).click();
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()=8]")).click();
		
		//second calendar using perticular element of that month
		cal.findElement(By.id("second_date_picker")).click();
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[@class=' ui-datepicker-other-month ']//a[text()=28]")).click();
		
		//third calendar using select class
		cal.findElement(By.id("third_date_picker")).click();
		Select call=new Select(cal.findElement(By.className("ui-datepicker-month")));
		call.selectByIndex(4);
		Select call1=new Select(cal.findElement(By.className("ui-datepicker-year")));
		call1.selectByValue("2016");
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td//a[text()=14]")).click();
        
		//fourth calendar by using NOT contains 
		cal.findElement(By.id("fourth_date_picker")).click();
		Select month=new Select(cal.findElement(By.className("ui-datepicker-month")));
		month.selectByValue("7");
		Select year=new Select(cal.findElement(By.className("ui-datepicker-year")));
		year.selectByVisibleText("2023");
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@data-month, '7'))]//a[text()=2]")).click();
		
		//fifth calendar selecting clickable element in that month
		cal.findElement(By.id("fifth_date_picker")).click();
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()=27]")).click()	;
		
		//sixth calendar using sendkeys 
		cal.findElement(By.id("sixth_date_picker")).sendKeys("22/08/2021");
		}

}
