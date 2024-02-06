package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orange {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	void Login() throws IOException {
		String file=System.getProperty("user.dir")+"/DataDriven/Test.xlsx";
		int rows=ExcelUtils.getRowCount(file, "Sheet1");
		for(int r=0;r<=rows;r++) {
			//read from excel
			String username=ExcelUtils.getCellData(file, "Sheet1", r, 0);
			String pwd=ExcelUtils.getCellData(file, "Sheet1", r, 1);
			//pass the values to webpage
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//validation
			String exp_url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			String act_url=driver.getCurrentUrl();
			if(act_url.equals(exp_url)) {
				System.out.println("Test is passed");
				ExcelUtils.setCellData(file, "Sheet1", r, 2,"pass");//this will write into xl
				ExcelUtils.fillGreenColor(file, "Sheet1", r, 2);
				driver.findElement(By.className("oxd-userdropdown-name")).click();
				driver.findElement(By.xpath("//a[text()='Cerrar sesión']")).click();
			}else {
				System.out.println("Test is failed");
				ExcelUtils.setCellData(file, "Sheet1", r, 2,"fail");
				ExcelUtils.fillRedColor(file, "Sheet1", r, 2);
			}
		}
	}
	@AfterClass
	void close() {
		driver.close();
	}
}
