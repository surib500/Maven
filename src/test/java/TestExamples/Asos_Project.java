package TestExamples;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asos_Project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Suri//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.asos.com/");
		driver.findElement(By.linkText("WOMEN")).click();
		Thread.sleep(3000);
		List <WebElement> s=driver.findElements(By.className("AIjKzKx"));
		System.out.println("No of Headers : " +s.size());
		driver.close();
		//driver.findElement(By.linkText("WOMEN")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/header/div[3]/div/div[1]/div/ul/li[1]/div/div/div/button/span")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"myaccount-dropdown\"]/div/div/div/div[1]/div/span/a[2]")).click();
        //driver.findElement(By.name("Email")).sendKeys("Surib500@gmail.com");
        //driver.findElement(By.id("FirstName")).sendKeys("Suri");
        //driver.findElement(By.id("LastName")).sendKeys("Babu");
        //driver.findElement(By.id("Password")).sendKeys("Surib5000@");
        //driver.findElement(By.name("BirthDay")).sendKeys("14");
        //driver.findElement(By.name("BirthMonth")).sendKeys("February");
        //driver.findElement(By.name("BirthYear")).sendKeys("1998"); 
        //driver.findElement(By.xpath("//*[@id=\"register-form\"]/form/fieldset/div[1]/div[6]/fieldset/div[2]/label")).click();
        //driver.findElement(By.id("marketingGlobalLabel")).click();		
	}}
