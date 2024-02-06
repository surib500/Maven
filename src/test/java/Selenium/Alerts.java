package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver alrt=new ChromeDriver();
		alrt.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	    alrt.findElement(By.name("alert")).click();
	    alrt.switchTo().alert();
	   String box= alrt.switchTo().alert().getText();
	    System.out.println(box);
	    alrt.switchTo().alert().accept();
	    Thread.sleep(2000);
	    alrt.findElement(By.name("confirmation")).click();
	    alrt.switchTo().alert();
	    String box1=alrt.switchTo().alert().getText();
	    System.out.println(box1);
	    alrt.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    alrt.findElement(By.name("prompt")).click();
	    alrt.switchTo().alert();
	   String box2= alrt.switchTo().alert().getText();
	   System.out.println(box2);
	   Thread.sleep(2000);
	   alrt.switchTo().alert().sendKeys("Suri");
	   
	  /* alrt.switchTo().alert().accept();
	   
	  Actions act=new Actions(alrt);
	  WebElement action=alrt.findElement(By.id("double-click"));
	  act.doubleClick(action).perform();
	  alrt.switchTo().alert().accept();
	  // alrt.close();*/
	   
	}

}
