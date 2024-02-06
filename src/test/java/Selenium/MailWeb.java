package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MailWeb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement u=driver.findElement(By.xpath("//input[@id='search']"));
		u.sendKeys("unakku thaan lyrics");
		u.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[2][text()='Unakku Thaan Lyrics | Chithha | Noiseless Tamil']")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.w3softech.in:2096/webmaillogout.cgi");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("suribabu.k@w3softech.in");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Surib500@");
		driver.findElement(By.id("login_submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("suribabu.k@w3softech.in");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Surib500@");
		driver.findElement(By.id("login_submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[1][@class='button-logout']")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	    driver.navigate().to("https://www.google.com/gmail/about/");
	    driver.navigate().back();
	    Set<String> ids=driver.getWindowHandles();
	    Iterator<String> tabs=ids.iterator();
	    String utube=tabs.next();//parent
	    String webmail=tabs.next();//child1
	    String fb=tabs.next();//child2
	    driver.switchTo().window(webmail).close();
	    driver.switchTo().window(fb).close();
	    
	
	
	
		
	
	}

}
