package com.BMCDE.debug;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


public class SignupPage extends BaseClass { 
	
	
@Test(priority=1) 
	
	public void  Signup() throws InterruptedException  
	{
	        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[3]/div/ul/li/a")).click();
	        Thread.sleep(2000L);
	        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div/a/button")).click();
	        Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[1]/div/input")).sendKeys("sumit.wattamwar+8855@healthpole.com");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[2]/div[1]/div/input")).sendKeys("Password");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[2]/div[2]/div/input")).sendKeys("Password");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[3]/div[1]/div/input")).sendKeys("First Name");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[3]/div[2]/div/input")).sendKeys("Middle");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[3]/div[3]/div/input")).sendKeys("LastName");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[4]/div[1]/div/select")).click();
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[4]/div[1]/div/select/option[18]")).click();
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[4]/div[2]/div/input")).sendKeys("12335555");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[5]/div[1]/div/input")).sendKeys("Jintur");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/section/ul/li/aside[1]/div/div/div/div[2]/div[4]/div[2]/div/div[1]/div/input")).sendKeys("Public Health Dentistry");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[5]/div[2]/div")).click();
			Thread.sleep(2000L);
			driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/div/div[7]/button")).click();
			
			Reporter.log("==== Signed Up & Logged in Successfully====",true);
			
	}


}

