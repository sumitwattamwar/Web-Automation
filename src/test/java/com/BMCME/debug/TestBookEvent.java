package com.BMCME.debug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBookEvent {
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

	// Event 
	@Test
	public void browseByVenue() throws AWTException {
		ActivityUtil.clickMe(driver, "//a[contains(.,'Events')]");
		ActivityUtil.wait(2000);
	}

	//Booking Event ticket
	@Test
	public void ticketBookDetails() throws AWTException {
		ActivityUtil.clickMe(driver, "//*[@id=\"eventCards0\"]/a/div/div[2]/div[2]/div[1]");
		ActivityUtil.clickMe(driver, "//*[@id=\"gtmCMEBookNow_Event\"]");
				//driver.findElement(By.xpath("//*[@id=\"eventCards0\"]/a/div/div[2]/div[2]/div[1]")).click();
				//driver.findElement(By.xpath("//*[@id=\"gtmCMEBookNow_Event\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sweety");
				driver.findElement(By.xpath("//*[@id=\"middleName\"]")).sendKeys("S");
				driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Saraf");
				driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9665255468");
				ActivityUtil.clickMe(driver, "//*[@id=\\\"step-3\\\"]/div[5]/div/div[3]");

				//driver.findElement(By.xpath("//*[@id=\"step-3\"]/div[5]/div/div[3]")).click();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sarafekta93@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Pune");
				driver.findElement(By.xpath("//*[@id=\"speciality\"]")).sendKeys("Event Attend");
				driver.findElement(By.xpath("//*[@id=\"institute\"]")).sendKeys("Institute Of Tech");
				ActivityUtil.clickMe(driver, "//*[@id=\"step-2\"]/div[2]/div");
				//driver.findElement(By.xpath("//*[@id=\"step-2\"]/div[2]/div")).click();
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				driver.findElement(By.xpath("//*[@id=\"councilNumber\"]")).sendKeys("100100");
				ActivityUtil.clickMe(driver, "//*[@id=\"payNow\"]");
				//driver.findElement(By.xpath("//*[@id=\"payNow\"]")).click();
				ActivityUtil.wait(2000);

	}

	//continue as guest
	@Test(priority = 1)
	public void guestView()  {
		driver.findElement(By.xpath("//*[@id=\"step-5\"]/div[4]/div/div/div/div/div/a")).click();
		ActivityUtil.wait(2000);

	}

	//paynow
	@Test(priority = 2)
	public void paynow() {
		driver.findElement(By.xpath("//*[@id=\"payNow1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nb-card-3044\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"successBtn\"]")).click();
		ActivityUtil.wait(2000);
	}

	//resend booking details
		@Test(priority = 3)
		public void resend() {
			driver.findElement(By.xpath("//*[@id=\"sendInstructional\"]")).click();
			ActivityUtil.wait(2000);
		}

		//back arrow to homepage 
	@Test(priority = 4)
	public void homepage() {
		driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/div/div/div[1]")).click();
		ActivityUtil.wait(2000);
	}

	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
	

}
