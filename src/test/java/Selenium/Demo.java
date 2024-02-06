package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		d.manage().window().maximize();
		int row =d.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("No of rows = " +row);
		int colomn=d.findElements(By.xpath("//table[@id='customers']//th")).size();
	    System.out.println("No of colomn = " +colomn);
	    List <WebElement> alldata=d.findElements(By.xpath("//table[@id='customers']//td"));
		for(WebElement choice:alldata)
		{
			String name=choice.getText();
			if(name.equals("Amazon"))
			{
				d.findElement(By.xpath("//td[text()='Amazon']//preceding-sibling::td//input")).click();
			}
			else if (name.equals("UK"))
			{
				d.findElement(By.xpath("//td[text()='UK']//following-sibling::td//a")).click();			}
		}
		}

	}


