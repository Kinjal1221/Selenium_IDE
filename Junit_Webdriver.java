//W.a. junit program to perform test with webdriver to login process of facebook/saucedemo

package com.uni1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Webdriver 
{
	WebDriver driver=null;
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_mwf\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@After
	public void after() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
