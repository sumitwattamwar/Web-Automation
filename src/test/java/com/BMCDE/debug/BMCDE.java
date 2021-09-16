
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
import org.testng.annotations.Test;


public class BMCDE extends BaseClass {


	@Test(priority=1) //Verify title

	public void  pagetitle()  
	{
		/*String title = driver.getTitle();
	System.out.println("title is: " + title);
		 */
		String Actual = driver.getTitle();
		String Expected = "CDE | BookMyCDE | Continuing Dental Education | Book CDE | Conference";

		assertEquals(Expected,Actual);
		Reporter.log("====title Verified Successfully====",true);
	}
	@Test(priority=2) //Verify title

	public void  SearchCDE() throws InterruptedException  
	{

		Thread.sleep(3000);

		driver.findElement(By.id("input-search-box")).sendKeys("CDE");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='input-search-box']")).click();

	}

}
