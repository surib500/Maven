package TestExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Suri//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("email")).sendKeys("9618329079");
		driver.findElement(By.name("pass")).sendKeys("Amma@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
