package com.webdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_TagDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_mwf\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		List<WebElement> a= driver.findElements(By.tagName("a"));
//		System.out.println(a);
		
		Iterator<WebElement> i1=a.iterator();
		while(i1.hasNext())
		{
			WebElement e=i1.next();
			if(e.getText().equals("Live Project"))
			{
				driver.findElement(By.linkText("Live Project")).click();
				System.out.println(e.getText());
			}
			else
			{
				break;
			}
		}
	}
}
