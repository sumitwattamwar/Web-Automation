package com.BMCDE.debug;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BOOK_CDE extends BaseClass{


	// Prerequisites




	@Test

	public void tickitbook() throws InterruptedException {

		System.out.println("Test Case tickitone with Thread Id:- "+ Thread.currentThread().getId());

		driver.get("https://staging.bookmycde.com/");
		driver.findElement(By.xpath("//*[@id=\"eventCards0\"]")).click();
		driver.findElement(By.cssSelector("a[id='gtmCDEBookNow']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Sumit");
		driver.findElement(By.id("middleName")).sendKeys("sudhirrao"); 
		driver.findElement(By.id("lastName")).sendKeys("wattamwar"); 
		driver.findElement(By.id("mobileNumber")).sendKeys("8421222768");
		driver.findElement(By.xpath("//div[contains(@class,'checkbox ')]")).click();
		driver.findElement(By.id("email")).sendKeys("sumit.wattamwar@healthpole.com");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("speciality")).sendKeys("Suergion"); 
		driver.findElement(By.id("institute")).sendKeys("JSPM RSCOE");
		WebElement drop=driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]"));
		drop.click();
		Thread.sleep(1000);
		for(int i=0;i<=16;i++)
		{
			drop.sendKeys(Keys.ARROW_DOWN);
			//Thread.sleep(1000);
		}
		drop.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name=\"council_number\" and @id=\"councilNumber\"]")).sendKeys("123");
		driver.findElement(By.xpath("//button[@name=\"button\" and @id=\"payNow\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"step-4\"]/div[10]/div/div/div/div/div/a")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);	//below code for clicking on paynow
		WebElement ele = wait1.until(ExpectedConditions.elementToBeClickable(By.id("payNow1")));
		ele.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);	// below code for clicking on Net Banking
		WebElement element = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(),'Net Banking')]")));
		element.click();
		driver.findElement(By.xpath("//span[contains(text(),'SBI')]")).click();	// for cliking on SBI button
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"col\"]//button[@id=\"successBtn\"  and @type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name=\"button\" and @class=\"isMobileBooked btn btn-member modal-toggle shareModal\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"modal-close modal-toggle\"]")).click();

		Reporter.log("==== CDE Booked Successfully ====",true);
	}


}

