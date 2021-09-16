package com.BMCDE.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Booking_History extends BaseClass {
@Test(priority=1) 
	
	public void  Booking_History_page() throws InterruptedException  
	{
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[3]/div/ul/li/a")).click();
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sumit.wattamwar@healthpole.com");
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ssw1234");
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	Thread.sleep(2000L);
	driver.findElement(By.id("profileBtn")).click(); 
	Thread.sleep(2000L);
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[4]/div/a[1]")).click();// Booking history
	Thread.sleep(2000L);
	JavascriptExecutor js21 = (JavascriptExecutor) driver;
	js21.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	JavascriptExecutor js211 = (JavascriptExecutor) driver;
	js211.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/a")).click();
	Thread.sleep(3000);
	
	Reporter.log("==== Visited Booking_History_page & logged out Successfully====",true);
}
}