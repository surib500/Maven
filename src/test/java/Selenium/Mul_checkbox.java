package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mul_checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ch.get("https://demo.automationtesting.in/Register.html");
	List<WebElement>mul =ch.findElements(By.xpath("//input[@type='checkbox']"));
	Thread.sleep(2000);
	for(int i=0;i<mul.size();i++)
	{
		mul.get(0).click();
		mul.get(1).click();
	}

	}

}
