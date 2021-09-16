package com.BMCME.debug;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTrial {

	WebDriver driver = null;

	@BeforeTest	
	public void setup() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		 * driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		 * driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		 */

	}

	@Test
	// FirstTest
	public void titleTest() throws Exception {
		driver.get("https://staging.bookmycme.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

	

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
