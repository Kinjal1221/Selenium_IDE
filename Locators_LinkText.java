//W.A.J.Script for Locating links by linkText().

package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_LinkText
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_mwf\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
