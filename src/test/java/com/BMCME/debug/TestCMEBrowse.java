package com.BMCME.debug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCMEBrowse {
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
	public void titleBMCMETest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "CME | BookMyCME | Continuing Medical Education | Book CME | Conference");

	}

	// ScreenSlide CME
	@Test
	public void screenSlide() {
		System.out.println("Executing testcase for ScreenSlide");
		ActivityUtil.clickMe(driver, "//*[@id=\"Layer_1\"]");
		ActivityUtil.wait(2000);
	}

	// Search field
	@Test(priority = 1)
	public void searchField() throws AWTException {
		System.out.println("Executing test case for SearchField");
		driver.findElement(By.id("input-search-box")).sendKeys("Ekta's CME 2021");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		ActivityUtil.wait(2000);

	}

	// Top Elements
	// CMEEvents
	@Test(priority = 2)
	public void cme() {
		System.out.println("CME");
		driver.findElement(By.xpath("//a[contains(.,'CME')]")).click();
		ActivityUtil.wait(2000);
	}

	// How it works
	@Test(priority = 4)
	public void howItWorks() {
		System.out.println("howItWorks");
		driver.findElement(By.xpath("//a[contains(.,'How It Works')]")).click();
		ActivityUtil.wait(2000);
	}

	// Events
	@Test(priority = 3)
	public void events() {
		System.out.println("Events");
		driver.findElement(By.xpath("//a[contains(.,'Events')]")).click();
		ActivityUtil.wait(2000);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}

	
}
