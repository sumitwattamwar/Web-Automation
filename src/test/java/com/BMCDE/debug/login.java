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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class login extends BaseClass  { 
	
	

@Test(dataProvider="BMCDE_Data")//Login
	
	public void  Login(String username,String password) throws InterruptedException
	{
	        Reporter.log("====Login  Started====",true);
	        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[3]/div/ul/li/a")).click();
	        Thread.sleep(2000L);
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			Thread.sleep(2000L);
			Reporter.log("====Logged in Successfully====",true);
			System.out.println(driver.getTitle());
	}

}

