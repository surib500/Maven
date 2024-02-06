package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver loc=new ChromeDriver();
		loc.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		loc.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("Suri");
		loc.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("Babu");
		loc.findElement(By.xpath("//input[3][@type='text']")).sendKeys("surib500@gmail.com");
		loc.findElement(By.xpath("//input[@type='password']")).sendKeys("Surib500");
		loc.findElement(By.xpath("//input[4][@type='password']")).sendKeys("Surib500");
		Thread.sleep(4000);
		loc.navigate().to("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		loc.findElement(By.id("username")).sendKeys("vamshinani");
		loc.findElement(By.id("password")).sendKeys("Vamshi@133");
		loc.findElement(By.id("login")).click();
	}

}
