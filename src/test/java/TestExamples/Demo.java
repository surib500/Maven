package TestExamples;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Scanner s=new Scanner(System.in);
	String page =s.next();
	if(page.equals("Edge"))
	{
		driver = new EdgeDriver();
	}
	else if (page.equals("Chrome"))
	{
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(4000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
