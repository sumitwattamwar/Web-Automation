package com.BMCME.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestContactUs {
	WebDriver driver = null;
	
	// Preconditions
	@BeforeSuite
	public void setup() {
		System.out.println("Setting up webdriver...");
		driver = ActivityUtil.getDriver("https://staging.bookmycme.com/", 30);
	}
	
	@BeforeTest
	public void executeTestCases() {
		
		System.out.println("Executing test cases...");
	
	}
	
	// hover
	@Test
	public void organizersTest()  {
		 driver.findElement(By.linkText("Contact Us")).click();
		 ActivityUtil.wait(2000);

	}
	
	@Test(priority= 1)
	public void fillDetails()  {
		 WebElement selectType = driver.findElement(By.id("selectType"));
		 selectType.sendKeys("I have a booking related query"); selectType.click();
		  driver.findElement(By.id("firstName")).sendKeys("Ekta");
		  driver.findElement(By.id("lastName")).sendKeys("Mahore");
		  driver.findElement(By.id("cmeName")).sendKeys("Ekta's CME"); 
		  ActivityUtil.wait(2000);
		  driver.findElement(By.xpath("//input[(@id='email') and (@class = 'form-control')]")).sendKeys("ekta.mahore@healthpole.com");
		  driver.findElement(By.id("phone")).sendKeys("9665255468");
		  driver.findElement(By.id("message")).sendKeys("Just for Testing");

	}
	
	//Submit form
	@Test(priority= 2)
	public void submit()  {
		  driver.findElement(By.id("submitContactUS")).click();
		 ActivityUtil.wait(2000);

	}
/*
	// privacy policy under submit 
	@Test(priority= 1)
	public void privacyPolicy() {
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div[5]/p/a")).click();
	    driver.navigate().back();
	}
*/
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");

	}
			
			
}