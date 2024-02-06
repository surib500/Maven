package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paral {

	public WebDriver driver;
	@Test
	@Parameters("browsername")
	public void bro(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default :
			System.out.println("Invalid browser");
			break;
		}
	}
	@Test
	@Parameters("URL")
	public void url(String aurl) {
		driver.get(aurl);
	}
}
