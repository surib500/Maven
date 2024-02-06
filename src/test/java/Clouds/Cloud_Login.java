package Clouds;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cloud_Login {
	public static WebDriver cloud;
	@BeforeClass
	public void url() throws InterruptedException {
		cloud=new ChromeDriver();
		cloud.get("https://e2e.cloudtesla.com/");
		cloud.manage().window().maximize();
		cloud.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);}

	@Test
	public void login() throws IOException, InterruptedException {
		String file=System.getProperty("user.dir")+"/DataDriven/Cloudlogin.xlsx";
		int row=Utils.getRowCount(file, "Details");		

		for(int r=0;r<=row;r++) {

			String email=Utils.getCellData(file, "Details", r, 0);
			String pwd=Utils.getCellData(file, "Details", r, 1);
			Thread.sleep(2000);

			cloud.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
			cloud.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			cloud.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			//actual and expected results

			String exp="https://e2e.cloudtesla.com/dashboards/create";
			String act=cloud.getCurrentUrl();
			if(act.equals(exp)) {
				System.out.println("Test is Pass");
				Utils.setCellData(file, "Details", r, 2, "Pass");
				Utils.fillGreenColor(file, "Details", r, 2);
				cloud.findElement(By.className("caret")).click();
				Thread.sleep(1000);
				cloud.findElement(By.xpath("//a[@target='_self']")).click();
			}
			else {
				Thread.sleep(1000);
				System.out.println("Failed");
				Utils.setCellData(file, "Details", r, 2, "Fail");
				Utils.fillRedColor(file, "Details", r, 2);
			}}
	}
	@AfterClass
	void close() {
		cloud.close();
	}

}
