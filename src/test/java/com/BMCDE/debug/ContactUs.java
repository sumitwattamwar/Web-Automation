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

public class ContactUs  extends BaseClass { 

	@Test(priority=1) //contact

	public void  OtherQueries() throws InterruptedException  
	{
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/footer/footer/div/div/div/div/div[1]/div/a[1]")).click(); 
		WebElement staticDropdown= driver.findElement(By.id("selectType"));
		org.openqa.selenium.support.ui.Select dropdown=new org.openqa.selenium.support.ui.Select(staticDropdown);
		dropdown.selectByIndex(3);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div[1]/div[1]/div/input")).sendKeys("First NAme"); 
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div[1]/div[2]/div/input")).sendKeys("Last Name");
		/*Thread.sleep(2000L);
	    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div[2]/div/input")).sendKeys("EVEnt/CDE"); */
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div[2]/div[1]/div/input")).sendKeys("sumit.wattamwar@gmail.com");
		Thread.sleep(2000L);         
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div[2]/div[2]/div/input")).sendKeys("8421222768"); 
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div[3]/div/textarea")).sendKeys("Test Message"); 
		Thread.sleep(2000L);
		driver.findElement(By.id("submitContactUS")).click();

		Thread.sleep(2000L);
		String Expected = ("Thank you for submitting your query. We will get back to you shortly.");
		String Actual = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[2]/div/h2")).getText();
		System.out.println("This is title: "+Actual);
		Assert.assertEquals(Expected, Actual);		

		Reporter.log("====Messege Sent Successfully====",true);
	}

}
