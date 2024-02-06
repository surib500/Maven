package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		WebDriver ke=new ChromeDriver();
		ke.get("https://demo.automationtesting.in/Register.html");
		ke.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).click();
		Actions act=new Actions(ke);
		act.keyDown(Keys.SHIFT);//hold the shift
		act.sendKeys("suri");//input value
		act.keyUp(Keys.SHIFT);//release the shift 
		act.perform();//action
		//selecting the character
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		//copy the chacracter
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
	//tab
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		act.perform();
		//ke.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).click();
	   //	paste the character
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

	}

}
