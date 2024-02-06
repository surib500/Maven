package TestExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Suri//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S335649124%3A1683819540908132&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=Af_xneGTWlQb7PdKsq3LqdQM-sv7rqdoqsgMogqSeTa0TcUpkcSY3_bAE5pq0qZSeZPdoD3lnl-59g&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(), 'Create account')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'For my personal use')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("suri");
		driver.findElement(By.name("lastname")).sendKeys("babu");
		driver.findElement(By.name("username")).sendKeys("suri96183");
		driver.findElement(By.name("passwd")).sendKeys("Surib500@");
		driver.findElement(By.name("confirmpasswd")).sendKeys("Surib500");
		driver.findElement(By.xpath("//div[contains(text(), 'Show password')]")).click();
	}

}
