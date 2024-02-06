package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {
	static WebDriver driver;
	@Test(priority=1,groups= {"main"})
	void Driver() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority=2,groups= {"one"})
	void orange() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	@Test(priority=3,groups= {"two"})
	void adactin() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://adactinhotelapp.com/");
	}
	@Test(priority=4,groups= {"one","two"})
	void fb() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
	}
}
