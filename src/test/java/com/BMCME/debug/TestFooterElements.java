package com.BMCME.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestFooterElements {
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
	
	// Click on contact us
	@Test(priority= 2)
	public void contactUs()  {
					ActivityUtil.activity(driver, "//*[@href=\"/contact-us\"]", false);
					ActivityUtil.wait(3000);

	}

	// Click on terms of use
	@Test()
	public void termsOfUse() {
		ActivityUtil.activity(driver, "//*[@href=\"/terms-of-use\"]", true);
		ActivityUtil.wait(3000);
	}
	
	// Click on privacy policy
	@Test(priority= 1)
	public void privacyPolicy() {
					ActivityUtil.activity(driver, "//*[@href=\"/privacy\"]", true);
					ActivityUtil.wait(3000);
	}

	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
	

		

			

}
