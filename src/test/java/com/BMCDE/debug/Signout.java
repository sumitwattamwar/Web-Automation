package com.BMCDE.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Signout extends BaseClass {
@Test(priority=1) 
	
	public void  Booking_History_page() throws InterruptedException  
	{
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[3]/div/ul/li/a")).click();
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sumit.wattamwar+1555@healthpole.com");
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password");
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	Thread.sleep(2000L);
	driver.findElement(By.id("profileBtn")).click(); 
	Thread.sleep(2000L);
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[4]/div/a[5]")).click();
	Thread.sleep(2000L);

	}
}