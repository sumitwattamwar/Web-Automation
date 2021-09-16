package com.BMCDE.debug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilterBy extends BaseClass{



	@Test(priority = 1)
	public void view() throws InterruptedException {
		WebElement sea = driver.findElement(By.id("data_city"));
		sea.click();
		sea.sendKeys("pune");
		Thread.sleep(2000);
		for (int i = 0; i <= 0; i++) {
			sea.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
		}
		sea.sendKeys(Keys.ENTER);
	}

	@Test(priority = 2)
	public void filter() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"dateFilter\"]/h3")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dateFilter\"]/h3")).click();

		// select radio for Today
		driver.findElement(By.xpath("//input[@id=\"today\" and @name=\"date_options\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"javascript:;\" and @class=\"clear-filters text-decoration-none\"]")).click();
		Thread.sleep(5000);
		
		// select radio for tomarrow
		driver.findElement(By.xpath("//input[@id=\"tomorrow\" and @name=\"date_options\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"javascript:;\" and @class=\"clear-filters text-decoration-none\"]")).click();
		Thread.sleep(5000);
		
		// select radio for weekend
		driver.findElement(By.xpath("//input[@id=\"weekend\" and @name=\"date_options\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"javascript:;\" and @class=\"clear-filters text-decoration-none\"]")).click();
		Thread.sleep(5000);
		
		// select radio for Month
		driver.findElement(By.xpath("//input[@id=\"this_month\" and @name=\"date_options\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"javascript:;\" and @class=\"clear-filters text-decoration-none\"]")).click();
		Thread.sleep(5000);
		
		// select radio for date range from
		driver.findElement(By.xpath("//input[@id=\"date\" and @name=\"date_options\"]")).click(); // radio button of
		// date
		driver.findElement(By.xpath("//input[@id=\"datetimepicker1\" and @class=\"form-control hasDatepicker\"]"))
		.click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Thread.sleep(1000);
		Select dropdown = new Select(month);
		dropdown.selectByVisibleText("May");
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.className("ui-datepicker-year"));
		Thread.sleep(1000);
		Select dropdown1 = new Select(date);
		dropdown1.selectByVisibleText("2025");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a")).click();
		Thread.sleep(1000);

		// select radio for date range to
		driver.findElement(By.xpath("//input[@class=\"form-control hasDatepicker\" and @id=\"datetimepicker2\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"form-control hasDatepicker\" and @id=\"datetimepicker2\"]")).click();
		WebElement month1 = driver.findElement(By.className("ui-datepicker-month"));
		Thread.sleep(1000);
		Select dropdown2 = new Select(month1);
		dropdown2.selectByVisibleText("May");
		Thread.sleep(1000);
		WebElement date1 = driver.findElement(By.className("ui-datepicker-year"));
		Thread.sleep(1000);
		Select dropdown12 = new Select(date1);
		dropdown12.selectByVisibleText("2025");
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("applyDateFilter")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"javascript:;\" and @class=\"clear-filters text-decoration-none\"]")).click();

		Thread.sleep(5000);
		Reporter.log("====  All filters Used Successfully ====",true);
	}



}

