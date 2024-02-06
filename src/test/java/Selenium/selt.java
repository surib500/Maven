package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selt {

	public static void main(String[] args) {
		
		WebDriver sel=new ChromeDriver();
		sel.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		sel.manage().window().maximize();
		sel.findElement(By.linkText("Selenium Practice")).click();
		sel.findElement(By.linkText("Dropdowns")).click();
		Select drop=new Select(sel.findElement(By.id("course")));
		drop.selectByValue("js");
		drop.selectByIndex(2);
		drop.selectByVisibleText("Python");
		Select mul=new Select(sel.findElement(By.id("ide")));
		if(mul.isMultiple())
		{
			mul.selectByIndex(2);
			mul.selectByValue("nb");
		}
		

	}

}
