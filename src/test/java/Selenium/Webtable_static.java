package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_static {

	public static void main(String[] args) {
		WebDriver tab=new ChromeDriver();
		tab.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		tab.manage().window().maximize();
		//No of rows
		int row=tab.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("no of rows " +row);
		//no of columns
		int col=tab.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("no of colums " +col);
		
		//Retrieve the data from specific cell
		String value=tab.findElement(By.xpath("//table[@id='customers']//tr[4]//td[3]")).getText();
		System.out.println("specific name = " +value);
		//Retrieve data all
		for(int r=2;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				String all=tab.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
				System.out.println(all+"     ");
				
			}
	            System.out.println();	
		}
		//click on checkbooks of amazon
		
		  List<WebElement>tabledata=tab.findElements(By.xpath("//table[@id='customers']//td"));
		  
		  for(WebElement options:tabledata) { 
			  String values=options.getText();
		  if(values.equals("Amazon"))
		      { 
			  tab.findElement(By.xpath("//td[text()='Amazon']//preceding-sibling::td//input")).click(); 
			  }
	      else  if (values.equals("UK")) 
			  {  
		      tab.findElement(By.xpath("//tr[6]//following-sibling::td//a")).click();
		      }
		  
		  }
		 
}}
