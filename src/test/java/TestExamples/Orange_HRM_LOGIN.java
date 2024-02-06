package TestExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Orange_HRM_LOGIN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String act=driver.getTitle();
		String exp="OrangeHRM";
	if(act.equals(exp))
	{
		System.out.println("match");
	}
	else
	{
		System.out.println("not match");
	}
	}

	}


