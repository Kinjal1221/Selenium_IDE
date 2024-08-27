//W.a. TestNG program to perform test with webdriver to login processof facebook/saucedemo

package com.ng2;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Webdriver
{
	 WebDriver driver=null;
	 @BeforeTest
	 public void beforeTest() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium_mwf\\chromedriver-win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://saucedemo.com/");
		 Thread.sleep(2000);
	 }
	 @Test(priority = 0)
	 public void usernameTest() throws InterruptedException
	 {
		 driver.findElement(By.id("user-name")).sendKeys("kinjal_user");
		 Thread.sleep(2000);
	 }
	 @Test(priority = 1)
	 public void passwordTest() throws InterruptedException
	 {
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 Thread.sleep(2000);
	 }
	 @Test(priority = 2)
	 public void loginTest() throws InterruptedException, IOException
	 {
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(2000);
		 if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
		 {
			 System.out.println("Your Login Test has been passed...");
			 logout();
		 }
		 else
		 {
			 System.out.println("Your Login Test has been failed...");
			 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File dest=new File("C:\\Screenshots\\1.png");
			 FileUtils.copyFile(src, dest);
			 fail("Standard_user - LoginTest");
		 }
	 }
	 public void logout() throws InterruptedException
	 {
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("logout_sidebar_link")).click();
		 Thread.sleep(2000);
	 }
	 @AfterTest
	 public void afterTest() throws InterruptedException
	 {
		  System.out.println("Bye Bye...");
		  Thread.sleep(2000);
		  driver.close();
	 }
}
