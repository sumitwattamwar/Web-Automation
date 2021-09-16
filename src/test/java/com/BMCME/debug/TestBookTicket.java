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

public class TestBookTicket extends CMEBASE
{

	@Test
	public void browseByVenue() throws AWTException {
		//browse by venue
				Robot r= new Robot();
		 		driver.findElement(By.id("data_city")).sendKeys("Pune, Maharashtra, India");
				ActivityUtil.wait(2000);
				r.keyPress(KeyEvent.VK_ENTER);	
	}

	//Booking CME ticket
	@Test
	public void ticketBookDetails() throws AWTException {
				driver.findElement(By.xpath("//*[@id=\"eventCards0\"]/a/div/div[2]/div[2]/div[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"gtmCMEBookNow\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sweety");
				driver.findElement(By.xpath("//*[@id=\"middleName\"]")).sendKeys("S");
				driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Saraf");
				driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9665255468");
				driver.findElement(By.xpath("//*[@id=\"step-3\"]/div[5]/div/div[3]")).click();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sarafekta93@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Pune");
				driver.findElement(By.xpath("//*[@id=\"speciality\"]")).sendKeys("Event Attend");
				driver.findElement(By.xpath("//*[@id=\"institute\"]")).sendKeys("Institute Of Tech");
				driver.findElement(By.xpath("//*[@id=\"step-2\"]/div[2]/div")).click();
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				driver.findElement(By.xpath("//*[@id=\"councilNumber\"]")).sendKeys("100100");
				driver.findElement(By.xpath("//*[@id=\"payNow\"]")).click();
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

	
	
	}
			


