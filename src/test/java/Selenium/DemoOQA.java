package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoOQA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver oqa=new ChromeDriver();
		oqa.manage().window().maximize();
		oqa.get("https://demoqa.com/elements");
	
		oqa.findElement(By.id("item-0")).click();
		oqa.findElement(By.id("userName")).sendKeys("Suribabu");
		oqa.findElement(By.id("userEmail")).sendKeys("Surib500@gmail.com");
		oqa.findElement(By.id("currentAddress")).sendKeys("Vijayawada");
		oqa.findElement(By.id("permanentAddress")).sendKeys("Vijayawada");
	//	oqa.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button")).click();
		Thread.sleep(3000);
		oqa.findElement(By.id("item-1")).click();
		oqa.findElement(By.className("rct-checkbox")).click();
		Thread.sleep(2000);
		oqa.findElement(By.className("rct-checkbox")).click();
		Thread.sleep(2000);
		oqa.findElement(By.id("item-2")).click();
		oqa.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
		Thread.sleep(2000);
		
		//oqa.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
		//
	//	oqa.close();
	}

}
