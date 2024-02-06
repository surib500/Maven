package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OH {
	public WebDriver driver;
	@BeforeClass
	void launch() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	void login() throws IOException, InterruptedException
	{
		String file=System.getProperty("user.dir")+"/DataDriven/TD.xlsx";
		int rows=ExcelUtils.getRowCount(file, "Sheet1");
		for(int r=0;r<=rows;r++) {
			String username=ExcelUtils.getCellData(file, "Sheet1", r, 0);
			
			String password=ExcelUtils.getCellData(file,"Sheet1",r,1);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
			
			//checking whethere we are getting exact reponse or not
			String expurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			String acturl=driver.getCurrentUrl();
			if(acturl.equals(expurl)) {
				System.out.println("The both url have matched");
				ExcelUtils.setCellData(file, "Sheet1", r, 2,"passed");
				Thread.sleep(2000);
				//By using above step we can eneter the data into excel
				ExcelUtils.fillGreenColor(file, "Sheet1", r, 2);
				driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				
			}else {
				System.out.println("The both url have not matched");
				ExcelUtils.setCellData(file, "Sheet1", r, 2,"failled");
				ExcelUtils.fillRedColor(file, "Sheet1", r, 2);
			}
				
		}
		
	}
	@AfterClass
	void close() {
	driver.close();

}
}

