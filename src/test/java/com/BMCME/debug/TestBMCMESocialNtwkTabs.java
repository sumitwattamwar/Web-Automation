package com.BMCME.debug;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBMCMESocialNtwkTabs extends CMEBASE
{
	WebDriver driver = null;

	
	// Click on Facebook
	@Test()
	public void facebook() {
		ActivityUtil.activity(driver, "/html/body/footer/footer/div/div/div/div/div[2]/a[1]/img", true);
		ActivityUtil.wait(3000);
	}
	
	// Click on Twitter
	@Test(priority= 1)
	public void twitter() {
		ActivityUtil.activity(driver, "/html/body/footer/footer/div/div/div/div/div[2]/a[2]/img", true);
		ActivityUtil.wait(3000);
	}
	
	// Click on Instagram
		@Test(priority= 2)
		public void instagram()  {
			ActivityUtil.activity(driver, "/html/body/footer/footer/div/div/div/div/div[2]/a[3]/img", true);
			ActivityUtil.wait(3000);

		}

		// Click on LinkedIn
		@Test(priority= 3)
		public void linkedIn()  {
			ActivityUtil.activity(driver, "/html/body/footer/footer/div/div/div/div/div[2]/a[4]/img", true);
			ActivityUtil.wait(3000);

		}


	
	
	}
	


