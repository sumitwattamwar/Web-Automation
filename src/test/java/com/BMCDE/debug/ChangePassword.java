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


public class ChangePassword extends BaseClass  { 
	
	

@Test(priority=1) 
	
	public void  SetNewPassword() throws InterruptedException  
	{
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[3]/div/ul/li/a")).click();
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sumit.wattamwar+8855@healthpole.com");
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password");
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	Thread.sleep(2000L);
	driver.findElement(By.id("profileBtn")).click(); // Change password code
	Thread.sleep(2000L);
	driver.findElement(By.xpath("//*[@id='navbar']/div[2]/div[4]/div/a[3]")).click();// change pass
	driver.findElement(By.id("current_password")).sendKeys("ssw123");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ssw1234");
	driver.findElement(By.id("password_confirmation")).sendKeys("ssw1234");
	driver.findElement(By.id("btnChangePassword")).click(); 
	
	Reporter.log("====Changed Password Successfully====",true);
	}


}
