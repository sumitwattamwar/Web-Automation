package com.BMCME.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


		public class TestFilterBy 
	{	WebDriver driver = null;
	
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
	//Filter by
	public void titleTest()  {
		driver.findElement(By.id("dateFilter")).click();
		ActivityUtil.wait(2000);
		driver.findElement(By.id("dateFilter")).click();
	}

	@Test(priority= 1)
	//select radio for Today
	public void today() {
		driver.findElement(By.id("today")).click();
		ActivityUtil.wait(2000);

	}

	@Test(priority= 2)
		//select radio for tomorrow
	public void tomorrow()  {
		driver.findElement(By.xpath("//*[@id=\"tomorrow\"]")).click();
 		//driver.findElement(By.xpath("//input[@id=\"tomorrow\" and @name=\"date_options\" and @value=\"tomorrow\" and @type=\"radio\"]")).click();
		ActivityUtil.wait(2000);
 		driver.findElement(By.xpath("//a[contains(text(),'Clear')]")).click();
		ActivityUtil.wait(2000);
	}

	@Test(priority= 3)
	//select radio for week
	public void week()  {
		driver.findElement(By.xpath("//input[@id=\"weekend\" and @name=\"date_options\" and @value=\"weekend\" and @type=\"radio\"]")).click();
		ActivityUtil.wait(2000);
 		driver.findElement(By.xpath("//a[contains(text(),'Clear')]")).click();
		ActivityUtil.wait(2000);

	}
	
	@Test(priority= 6)
	//select radio for Month
	public void month()  {
 		driver.findElement(By.xpath("//input[@id=\"this_month\" and @name=\"date_options\"]")).click();
		ActivityUtil.wait(2000);
 		driver.findElement(By.xpath("//a[contains(text(),'Clear')]")).click();
		ActivityUtil.wait(2000);
	}

	@Test(priority= 4)
	//select radio for date range from
	public void fromDate() 
	{
 		driver.findElement(By.xpath("//input[@id=\"date\" and @name=\"date_options\"]")).click();  //radio button of date
		ActivityUtil.wait(1000);
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
 		driver.findElement(By.xpath("//input[@id=\"datetimepicker1\" and @class=\"form-control hasDatepicker\"]")).click();
 		WebElement month=driver.findElement(By.className("ui-datepicker-month"));
		ActivityUtil.wait(1000);
 		Select dropdown= new Select(month);
 		dropdown.selectByVisibleText("April");
		ActivityUtil.wait(1000);
 		WebElement date=driver.findElement(By.className("ui-datepicker-year"));
		ActivityUtil.wait(1000);
 		Select dropdown1= new Select(date);
 		dropdown1.selectByVisibleText("2021");
		ActivityUtil.wait(1000);
 		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a")).click();
		ActivityUtil.wait(1000);

	}

	@Test(priority= 5)
		//select radio for date range to
	public void toDate() 
	{
 		driver.findElement(By.xpath("//input[@class=\"form-control hasDatepicker\" and @id=\"datetimepicker2\"]")).click();
 		driver.findElement(By.xpath("//input[@class=\"form-control hasDatepicker\" and @id=\"datetimepicker2\"]")).click();
 		WebElement month1=driver.findElement(By.className("ui-datepicker-month"));
		ActivityUtil.wait(1000);
 		Select dropdown2= new Select(month1);
 		dropdown2.selectByVisibleText("May");
		ActivityUtil.wait(1000);
 		WebElement date1=driver.findElement(By.className("ui-datepicker-year"));
		ActivityUtil.wait(1000);
 		Select dropdown12= new Select(date1);
 		dropdown12.selectByVisibleText("2021");
 		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
		ActivityUtil.wait(1000);
 		driver.findElement(By.id("applyDateFilter")).click();
		ActivityUtil.wait(1000);
 		driver.findElement(By.xpath("//a[contains(text(),'Clear')]")).click();	
		ActivityUtil.wait(1000);
	}

	

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

	 		
	 		
	 		
	 		
	 		

}
