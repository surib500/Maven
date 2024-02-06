package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mul_Window {

	public static void main(String[] args) {
		WebDriver win=new ChromeDriver();
		win.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		win.manage().window().maximize();
		win.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement scroll=win.findElement(By.id("newWindowsBtn"));
		JavascriptExecutor js=((JavascriptExecutor)win);
		js.executeScript("arguments[0].scrollIntoView();", scroll);;
		scroll.click();
		Set<String> windows=win.getWindowHandles();
		Iterator<String> tabs=windows.iterator();
		String parent = tabs.next();
		String child1=tabs.next();
		String child2=tabs.next();
		String  title=win.switchTo().window(parent).getTitle();
		System.out.println("Child2 URL = "    +title);
		win.quit();

	}

}
