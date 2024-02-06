package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Types {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchstore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(searchstore.isDisplayed());
		System.out.println(searchstore.isEnabled());
		
		//select the webelement
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		
		System.out.println(male.isSelected());//Falese
		System.out.println(female.isSelected());//False
		
		//select male
		male.click();
		System.out.println(male.isSelected());//True
		System.out.println(female.isSelected());//False
		
		//select female
		female.click();
		System.out.println(male.isSelected());//False
		System.out.println(female.isSelected());//True

	}

}
