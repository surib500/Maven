package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver mouse=new ChromeDriver();
	
		mouse.get("https://demoqa.com/buttons");
		mouse.manage().window().maximize();
		Actions m=new Actions(mouse);
		//double click
		WebElement DC=mouse.findElement(By.id("doubleClickBtn"));
		m.doubleClick(DC).perform();
	//right click
		WebElement RC=mouse.findElement(By.id("rightClickBtn"));
		m.contextClick(RC).perform();
		//just click
	   mouse.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
	}
	

}
