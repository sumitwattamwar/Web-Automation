package com.BMCME.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestSignedInDropdown {
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
	
	// SignIn
		@Test()
		public void signIn() {
						driver.findElement(By.id("preSignIn")).click();
						driver.findElement(By.id("email")).sendKeys("ekta.mahore@healthpole.com");	
						driver.findElement(By.id("password")).sendKeys("healthpole");
						driver.findElement(By.id("btnLogin")).click();
						ActivityUtil.wait(3000);
		}
		
		// Click on Booking History 
		@Test(priority= 1)
		public void bookingHistory() {
			driver.findElement(By.id("profileBtn")).click();
			driver.findElement(By.linkText("Booking History")).click();
			ActivityUtil.wait(2000);						
		}
	
	// Click on Personal Information and update
	@Test(priority= 2)
	public void personalInfo()  {
		driver.findElement(By.linkText("Personal Information")).click();
		ActivityUtil.wait(2000);

	}
	
	/*@Test(priority=3)
	public void updateInfo() {
		driver.findElement(By.id("btn_edit_info")).click();
		driver.findElement(By.xpath("//*[@id=\"edit_userInfo\"]/div[4]/div[2]/div/div[8]/span")).click();
		ActivityUtil.wait(2000);
		driver.findElement(By.id("btn_update_info")).click();
	}*/
	
	// Click on Change Password 
	@Test(priority= 3)
	public void changePassword() {
		driver.findElement(By.linkText("Change Password")).click();
		ActivityUtil.wait(2000);
	}

/*	// Click on contact us
	@Test(priority= 4)
	public void contactUs()  {
		driver.findElement(By.linkText("Contact Us")).click();
		ActivityUtil.wait(2000);
		driver.findElement(By.id("deact_btn")).click();

}*/
	// Click on Signout
		@Test(priority= 4)
		public void signout()  {
			driver.findElement(By.id("deact_btn")).click();
			ActivityUtil.wait(2000);

	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
