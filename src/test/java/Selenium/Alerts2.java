package Selenium;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/alerts");
	    driver.findElement(By.id("promtButton")).click();	
	    Alert alt=driver.switchTo().alert();
	    Thread.sleep(2000);
	    alt.sendKeys("Suri");
	    
	}

}
