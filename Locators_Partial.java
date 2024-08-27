//W.A.J.Script for Locating links by  partialLinkText().

package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Partial 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_mwf\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\Kinjal Tailor\\eclipse-workspace\\Selenium\\src\\com\\html\\index.html");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Click Here")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/a[2]")).click();
		driver.findElement(By.linkText("click Here")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
