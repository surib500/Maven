package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[text()=' Customers']")).click();
		driver.findElement(By.xpath("//a[text()='Customers']")).click();
		//how many pages in table
		String pages=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(pages);//all text appared
		
		int total=Integer.parseInt(pages.substring(pages.indexOf("(")+1,pages.indexOf("Pages")-1));
		System.out.println("Pages in table:"+total);//1689 only number i need to appear
		
		for(int p=1;p<5;p++) 
		    {
			WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()='"+p+"']"));
			System.out.println(activepage.getText());
			}
			//rows in page
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
			System.out.println("no of rows in activepage:"+rows);
			for(int r=1;r<rows;r++) {
				String Emails=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tr["+r+"]//td[6]")).getText();
				System.out.println(Emails);
			}  
		}
	}