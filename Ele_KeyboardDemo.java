//W.A.J.Script To use Mouse and Keyboard event using Action class 2. Keyboard event

package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_KeyboardDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_mwf\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.id("email"));
		
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(email)
				.click()
				.keyDown(email, Keys.SHIFT)
				.sendKeys(email, "kinjaltailor")
				.keyUp(email, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		a1.perform();
	}
}
