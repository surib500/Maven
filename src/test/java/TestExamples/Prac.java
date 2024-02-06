package TestExamples;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.WebSocket;
public class Prac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Suri//chromedriver.exe");
		WebDriver s= new ChromeDriver();
s.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(1000);
s.findElement(By.name("username")).sendKeys("Admin");
s.findElement(By.name("password")).sendKeys("admin123");
s.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
Thread.sleep(3000);
List <WebElement> images=s.findElements(By.tagName("img"));
System.out.println("No of images : " +images.size());
s.close();

	}

}
