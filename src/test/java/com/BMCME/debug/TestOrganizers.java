package com.BMCME.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestOrganizers {
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
	
	@Test
	//Organizers
	public void organizersTest()  {
		driver.findElement(By.xpath("//a[contains(.,'Organizers')]")).click();
		driver.findElement(By.xpath("//input[(@id='organization') and (@class = 'input-field margin-top-15')]")).sendKeys("My Organization");
		driver.findElement(By.xpath("//input[(@id='name') and (@class = 'input-field margin-top-15')]")).sendKeys("Ekta Mahore");
		driver.findElement(By.xpath("//input[(@id='email') and (@class = 'input-field margin-top-15')]")).sendKeys("ekta.mahore@healthpole.com");
		driver.findElement(By.xpath("//input[(@id='phone') and (@class = 'input-field margin-top-15')]")).sendKeys("9665255468");
		driver.findElement(By.xpath("//*[@id=\"payNow\"]")).click();
		ActivityUtil.wait(2000);

	}

	@Test(priority= 1)
	//back to homepage
	public void homepage() {
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/form/div[2]/p[2]/a")).click();

	}

	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");

	}
	
}
