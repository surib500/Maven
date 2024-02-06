package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
	public WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) {
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else {
			driver=new EdgeDriver();
			driver.manage().window().maximize();

		}
	}
	@Test
	@Parameters({"url"})
	void launch(String appurl) {
		driver.get(appurl);
	}
	@AfterClass
	void close() {
		driver.quit();
	}
}