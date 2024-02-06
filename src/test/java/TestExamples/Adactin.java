package TestExamples;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver adactin=new ChromeDriver();
		adactin.get("https://adactinhotelapp.com/");
		String title=adactin.getTitle();
		System.out.println(title);
		String url=adactin.getCurrentUrl();
		System.out.println(url);
		adactin.navigate().to("https://demo.opencart.com/");
		String title1=adactin.getTitle();
		System.out.println(title1);
		String url1=adactin.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(1000);
		adactin.navigate().back();
		Thread.sleep(2000);
		adactin.navigate().forward();
		Thread.sleep(2000);
		adactin.navigate().refresh();
		adactin.quit();

	}

}
