package TestExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFace {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Suri//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("Suri");
		driver.findElement(By.name("lastname")).sendKeys("Babu");
		driver.findElement(By.name("reg_email__")).sendKeys("9000340253");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Amma@123$");
		driver.findElement(By.name("birthday_day")).sendKeys("14");
		driver.findElement(By.name("birthday_month")).sendKeys("Feb");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		}

}
