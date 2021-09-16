package com.BMCDE.debug;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FooterElements extends BaseClass {

	@Test(priority=1) //Contact_Us

	public void  Contact_Us() throws InterruptedException  
	{
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body > footer > footer > div > div > div > div > div.__footer-bms-logo > div > a:nth-child(1)")).click();
		Thread.sleep(6000);
		Reporter.log("==== Visited Contact_Us Successfully ====",true);
	}
	
	@Test(priority=2) //TermsOfUSe

	public void  TermsOfUSe() throws InterruptedException  
	{
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body > footer > footer > div > div > div > div > div.__footer-bms-logo > div > a:nth-child(2)")).click();
		Thread.sleep(6000);
		Reporter.log("==== Visited TermsOfUSe Successfully ====",true);
	}
	
	@Test(priority=3) //privacy_policy

	public void  privacy_policy() throws InterruptedException  
	{
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body > footer > footer > div > div > div > div > div.__footer-bms-logo > div > a:nth-child(3)")).click();
		Thread.sleep(6000);
		Reporter.log("==== Visited privacy_policy Successfully ====",true);
	}
	
	@Test(priority=4) //fb

	public void  fb() throws InterruptedException  
	{
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("[title='Facebook']")).click();
		Thread.sleep(6000);
		Reporter.log("==== Visited fb Successfully ====",true);
	}
	
	@Test(priority=5) //tweeter

	public void  tweeter() throws InterruptedException  
	{

		driver.findElement(By.cssSelector("[alt='twitter']")).click();

		Thread.sleep(6000);
		Reporter.log("==== Visited tweeter Successfully ====",true);
	}
	
	@Test(priority=6) //instagram

	public void  instagram() throws InterruptedException  
	{

		driver.findElement(By.cssSelector("[alt='instagram']")).click(); 
		Thread.sleep(6000);
		Reporter.log("==== Visited instagram Successfully ====",true);
	}
	
	@Test(priority=7) //LinkedIn

	public void  LinkedIn() throws InterruptedException  
	{
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("[alt='linkedin']")).click();
		Thread.sleep(6000);
		Reporter.log("==== Visited LinkedIn Successfully ====",true);
	}
}