package com.BMCDE.debug;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class howitworks extends BaseClass { 


	@Test(priority=1) //GetStarted

	public void  GetStarted() throws InterruptedException  
	{
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"submitContactUS\"]")).click();
		Thread.sleep(2000L);
	}
	@Test(priority=2) //EstimatedEarnings

	public void EstimatedEarnings() throws InterruptedException
	{
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"ticket_price\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"ticket_price\"]")).sendKeys("100000"); 
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"ticket_quantity\"]")).clear();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"ticket_quantity\"]")).sendKeys("10");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"gst_charges\"]")).clear();
		Thread.sleep(2000L);
	    driver.findElement(By.xpath("//*[@id=\"gst_charges\"]")).sendKeys("10"); 
	    Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"buyer\"]")).click();
		Thread.sleep(4000L);
		Reporter.log("==== Estimated Earnigs Successfully ====",true);
	    
	}
	
	@Test(priority=3) //GetStarted its free

	public void  GetStartedfree() throws InterruptedException  
	{
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"submitContactUS\"]")).click();
		Thread.sleep(2000L);
		
   }
	@Test(priority=4) //contact_us_link
	public void  contact_us_link() throws InterruptedException  
	{
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[7]/p[2]/a[1]")).click();
		Thread.sleep(2000L);
		
		
   }
	}
	