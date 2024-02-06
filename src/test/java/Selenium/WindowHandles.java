package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver win=new ChromeDriver();
		win.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		win.manage().window().maximize();
		WebElement scroll=win.findElement(By.id("newWindowBtn"));
		JavascriptExecutor js=((JavascriptExecutor)win);
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		scroll.click();
		String s=win.getTitle();
System.out.println(s);
Set<String> windows=win.getWindowHandles();//handle the windows
Iterator<String> ids=windows.iterator();//repetation of windows 
String first=ids.next();//parent
String second=ids.next();//child
System.out.println(first);
System.out.println(second);
String url1=win.switchTo().window(first).getCurrentUrl();
System.out.println(url1);
String url2=win.switchTo().window(second).getCurrentUrl();
System.out.println(url2);
win.quit();
	}

}
