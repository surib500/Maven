package Selenium;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
public class Xpath_Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Suri//chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://www.hyrtutorials.com/p/waits-demo.html");//s.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		//s.findElement(By.id("btn1")).click();
		//s.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        //s.findElement(By.id("txt1")).sendKeys("Suri");
        s.findElement(By.id("btn2")).click();
        //s.findElement(By.id("txt2")).sendKeys("Babu");
  // WebDriverWait exp=new WebDriverWait(s, Duration.ofSeconds(16));	
   //exp.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2"))).sendKeys("babu");
      //  Wait<WebDriver> flu=new FluentWait<>(s)
       // 		.withTimeout(Duration.ofSeconds(20))
     //   		.pollingEvery(Duration.ofSeconds(15))
        	//	.ignoring(ElementNotInteractableException.class);
        //flu.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2"))).sendKeys("Babu");




	}

}
