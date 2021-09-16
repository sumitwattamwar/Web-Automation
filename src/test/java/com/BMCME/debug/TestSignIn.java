package com.BMCME.debug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSignIn {

	WebDriver driver = null;

	// Preconditions
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();

		System.out.println("Driver setup");
	}

	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.bookmycme.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("launch the browser");

	}

	// Actual test

	@Test
	public void titleBMCMETest() {
		String title = driver.getTitle();
		System.out.println("titleBMCMETest: " + title);
		System.out.println("test the title");
		Assert.assertEquals(title, "CME | BookMyCME | Continuing Medical Education | Book CME | Conference");

	}

	// forgot password
	@Test
	public void forgotPwd() {
		System.out.println("forgotPwd");
		driver.findElement(By.id("preSignIn")).click();
		driver.findElement(By.xpath("//*[@id=\"signinPopup\"]/div/div[2]/div/aside/div[2]/form/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"email_reset\"]")).sendKeys("ekta.mahore@healthpole.com");
		driver.findElement(By.xpath("//*[@id=\"btnSendLink\"]")).click();
	}

	// gmail signing for forgot password
	@Test(priority = 1)
	public void gmail() {
		System.out.println("gmail signin");
		driver.navigate().to("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("ekta.mahore@healthpole.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("healthpole@8988");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
	}

	// RefreshInbox
	@Test(priority = 2)
	public void refreshInbox() {
		System.out.println("Refresh Inbox");
		driver.findElement(By.xpath("//*[@id=\":4\"]/div/div[1]/div[1]/div/div/div[5]/div")).click();

	}

	// mail click
	@Test(priority = 3)
	public void mail() throws InterruptedException {
		System.out.println("DoNotReply Mail Click");
		driver.findElement(By.cssSelector("#\\:1v")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[5]/div[2]/div/table/tbody/tr[1]"))
				.click();
		// driver.findElements(By.xpath("//*[@id=\":20\"]")).get(0).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[5]/div[2]/div/table/tbody/tr[1]/td[1]")).click();
		//driver.findElement(By.xpath("//*[@text()='Reset IDN Account Password']")).click();
	}

	// Reset
	@Test(priority = 4)
	public void reset() {
		System.out.println("reset password");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("healthpole");
		driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("healthpole");
		driver.findElement(By.xpath("//*[@id=\"btnResetPassword\"]")).click();
	}
	
	/*
	// driver.findElement(By.
	* // xpath("//*[@email=\"donotreply@bookmycme.com\"] and
		// [@data-hovercard-id=\"donotreply@bookmycme.com\"] and
		// [@name=\"donotreply\"])).click(); "
	* // Thread.sleep(5000);
	* // driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("healthpole");
	* // driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys(
	*/// "healthpole");
	//*// driver.findElement(By.xpath("//*[@id=\"btnResetPassword\"]")).click();
	//* // driver.findElement(By.id("password")).sendKeys("healthpole");
	//* // driver.findElement(By.id("password_confirmation")).sendKeys("healthpole");
	//* // driver.findElement(By.id("btnResetPassword")).click();*/

}
