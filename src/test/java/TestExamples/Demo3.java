package TestExamples;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver s=new ChromeDriver();
		s.get("https://www.demoblaze.com/index.html");
		Thread.sleep(3000);
		boolean img= s.findElement(By.id("nava")).isDisplayed();
		String img1=s.findElement(By.id("nava")).getText();
		System.out.println("Image of Logo : "  +img);
		System.out.println("logo name : " +img1);
		//s.findElement(By.linkText("CATEGORIES")).click();
		Thread.sleep(2000);
		s.findElement(By.linkText("Monitors")).click();
	//List<WebElement> header=	s.findElements(By.className("nav-link"));
	//System.out.println("No of Headers : " +header.size());
	//List <WebElement> Links=s.findElements(By.tagName("a"));
//	System.out.println("No of Links : " +Links.size());
	
	//for(WebElement All_Links:header)
	//{
		//System.out.println(All_Links.getText());
	//}
	//	s.close();
	}
}
