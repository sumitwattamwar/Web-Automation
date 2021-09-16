package com.BMCME.debug;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActivityUtil {

	/**
	 * Get chrome driver
	 * 
	 * @param url
	 * @param implicitlyWait
	 * @return driver
	 */
	public static WebDriver getDriver(String url, int implicitlyWait) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);

		driver.get(url);

		return driver;

	}

	
	/* * Click the element located at the given xPath
	 * 
	 * @param driver
	 * @param xPath
	 */
	public static void clickMe(WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();
	}
	
	/**
	 * Enter data for the element located at the given xPath
	 * 
	 * @param driver
	 * @param xPath
	 * @param data
	 */
	public static void sendKeys(WebDriver driver, String xPath, String data) {
		driver.findElement(By.xpath(xPath)).sendKeys(data);
	}
	

	/* Performs activity
	 * 
	 * @param driver
	 * @param xPath
*/
	 
	public static void activity(WebDriver driver, String xPath, boolean switchRequired) {

		// Click on link
		clickMe(driver, xPath);
		wait(5000);

		if (switchRequired) {
			// Switch to the newly opened tab
			tabSwitch(driver, 1);

			// closes opened tab
			closeTab(driver);

			// Switch to the main tab
			tabSwitch(driver, 0);
		}
	}
	
	/*
	 * Switch to the desired tab
	 * 
	 * @param driver
	 * @param tabSequence
	 */
	public static void tabSwitch(WebDriver driver, int tabSequence) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabSequence));
	}

	/*
	 * Closes the current active tab
	 * 
	 * @param driver
	 */
	public static void closeTab(WebDriver driver) {
		driver.close();
	}

	/*
	 * Allows to wait for some time in between activities
	 * 
	 * @param wait Time in millis*/
	 
	public static void wait(int wait) {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
		}
	}

}
