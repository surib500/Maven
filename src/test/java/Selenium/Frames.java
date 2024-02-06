package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver fr=new ChromeDriver();
		fr.manage().window().maximize();
		fr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fr.get("https://demo.automationtesting.in/Frames.html");
		
		  //Normal frame 
		fr.switchTo().frame(fr.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[1]/iframe")));
		  Thread.sleep(2000);
		  fr.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Suri");
		  Thread.sleep(2000);
		  fr.switchTo().defaultContent();
		//Multiple Frames 
		fr.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		fr.switchTo().frame(fr.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe")));
		fr.switchTo().frame(fr.findElement(By.xpath("/html/body/section/div/div/iframe")));
		Thread.sleep(2000);
		fr.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Babu");
		
		fr.switchTo().defaultContent();
		
        
  
       
        
	}

}
