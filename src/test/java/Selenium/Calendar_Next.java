package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Next {

	public static void main(String[] args) {
		WebDriver cal=new ChromeDriver();
		cal.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		cal.manage().window().maximize();
	    //Using next or Prev button using while statement
		String month="June 2030";
		cal.findElement(By.id("first_date_picker")).click();
		while(true) 
            {
			String Cdate=cal.findElement(By.className("ui-datepicker-title")).getText();
			if(Cdate.equals(month)) 
               { 
				break;
			   }
            else
                   {
		    cal.findElement(By.className("ui-datepicker-next")).click();
			       }	
		    }
		cal.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='14']")).click();//select the date
	}
	}


