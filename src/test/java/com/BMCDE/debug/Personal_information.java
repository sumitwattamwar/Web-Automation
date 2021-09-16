package com.BMCDE.debug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Personal_information extends BaseClass {
@Test(priority=1) 
	
	public void  Booking_History_page() throws InterruptedException, AWTException  
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
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[4]/div/a[2]")).click();//Personal_information
	Thread.sleep(2000L);
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[2]/div/a")).click();//Edit
	
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[1]/input")).clear();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[1]/input")).sendKeys("sumit.wattamwar+1555@healthpole.com");
	Thread.sleep(2000L);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[2]/div[1]/input")).clear();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[2]/div[1]/input")).sendKeys("First Name");
	Thread.sleep(2000L);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[2]/div[2]/input")).clear();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys("middle");
	Thread.sleep(2000L);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[2]/div[3]/input")).clear();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[2]/div[3]/input")).sendKeys("last");
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[3]/div[1]/select")).click();
	Thread.sleep(200L);
	
	Robot r = new Robot();
	Thread.sleep(200L);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(200L);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(200L);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(200L);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(200L);
	r.keyPress(KeyEvent.VK_DOWN);

	r.keyPress(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[3]/div[2]/input")).clear();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[3]/div[2]/input")).sendKeys("0000000000");
	Thread.sleep(2000L);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[4]/div[1]/input")).clear();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[4]/div[1]/input")).sendKeys("Jintur");
	Thread.sleep(2000L);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[4]/div[2]/div/div[1]/div/input")).clear();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[4]/div[2]/div/div[1]/div/input")).sendKeys("Public Health Dentistry");
	Thread.sleep(2000L);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[5]/button[2]")).click();
	Thread.sleep(2000L);
	Reporter.log("==== Visited personal information and updated Successfully ====",true);
	}
}
