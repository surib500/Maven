package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabs {
	static WebDriver labs;
	@BeforeTest
	public void url() {
		labs=new ChromeDriver();
		labs.get("https://www.saucedemo.com/");
		labs.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		labs.manage().window().maximize();
	}
	@Test(priority=1)
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		labs.findElement(By.id("user-name")).sendKeys("standard_user");
		labs.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
	}
	@Test(priority=2)
	public void sorting() throws InterruptedException {
		Thread.sleep(2000);
		Select sl=new Select(labs.findElement(By.xpath("//select[@class='product_sort_container']")));
		sl.selectByValue("lohi");
	}
	@Test(priority=3)
	public void product_adding() throws InterruptedException {
		Thread.sleep(2000);
		labs.findElement(By.id("item_5_title_link")).click();
		Thread.sleep(2000);
		labs.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(1000);
		labs.findElement(By.className("shopping_cart_link")).click();
	}
	@Test(priority=4)
	public void checkout() throws InterruptedException {
		Thread.sleep(1000);
		labs.findElement(By.id("checkout")).click();
	}
	@Test(priority=5)
	public void Fill_details() throws InterruptedException {
		labs.findElement(By.id("first-name")).sendKeys("Suri");
		labs.findElement(By.id("last-name")).sendKeys("Babu");
		labs.findElement(By.id("postal-code")).sendKeys("520013");
		Thread.sleep(1000);
		labs.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		labs.findElement(By.id("finish")).click();
	}
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(1000);
		labs.close();
	}
}
