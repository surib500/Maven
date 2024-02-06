package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		WebDriver scroll=new ChromeDriver();
		scroll.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		scroll.manage().window().maximize();
	WebElement cl=	scroll.findElement(By.id("newWindowBtn"));
		JavascriptExecutor js=((JavascriptExecutor)scroll);
		//js.executeScript("window.scrollBy(0,1000)", "");//scroll by pixel
		js.executeScript("arguments[0].scrollIntoView();", cl);//exact click scroll 
		cl.click();
       // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//last of the page
		
	}

}
