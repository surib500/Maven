package TestExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeB {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Suri//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.findElement(By.name("Email")).clear();	
	driver.findElement(By.name("Password")).clear();
	driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	driver.findElement(By.name("Password")).sendKeys("admin");
	driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	String S=driver.getTitle();
    String exp = "nopCommerce";
    if (S.equals(exp))
    {
        System.out.println("Title Matched");
    } else {
        System.out.println("Not a match");
    }
	
	}

}
