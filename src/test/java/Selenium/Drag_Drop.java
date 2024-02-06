package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
WebDriver dd=new ChromeDriver();
dd.manage().window().maximize();
dd.get("https://demo.guru99.com/test/drag_drop.html");
Actions act=new Actions(dd);
WebElement from=dd.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
WebElement to=dd.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
act.dragAndDrop(from, to).perform();
WebElement sale=dd.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]/a"));
WebElement blank=dd.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));
act.dragAndDrop(sale, blank).perform();
	}

}
