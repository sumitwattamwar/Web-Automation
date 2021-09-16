package com.BMCME.debug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestSignup {
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

	// SignIn
	@Test
	public void credentials() {
		System.out.println("Signup credentials");

		driver.findElement(By.id("preSignIn")).click();
		driver.findElement(By.xpath("//*[@id=\"preSignup\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"doctor_password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_password\"]")).sendKeys("February");

		// driver.findElement(By.cssSelector("#doctor_retype_password")).click();
		// driver.findElement(By.cssSelector("#doctor_retype_password")).sendKeys("February");
		driver.findElement(By.xpath("//*[@id=\"doctor_first_name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_first_name\"]")).sendKeys("Anvayi");
		driver.findElement(By.xpath("//*[@id=\"doctor_middle_name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_middle_name\"]")).sendKeys("Shree");
		driver.findElement(By.xpath("//*[@id=\"doctor_last_name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_last_name\"]")).sendKeys("Jadhav");

	}

	// medical_council_number
	@Test(priority = 1)
	public void medical_council_number() {
		System.out.println("medical_council_number");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Find element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.xpath("//*[@id=\"doctor_medical_council_number\"]"));
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
		// driver.findElement(By.xpath("//*[@id=\"doctor_medical_council_number\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_medical_council_number\"]")).sendKeys("10001");
		ActivityUtil.wait(2000);
	}

	// medical_council_state 
	@Test(priority = 2)
	public void medical_council_state() {
		System.out.println("medical_council_state");
		driver.findElement(By.xpath("//*[@id=\"doctor_medical_council_state\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_medical_council_state\"]")).click();
		ActivityUtil.wait(2000);

	}

	// selectMedicalCouncil
	@Test(priority = 3)
	public void selectMedicalCouncil() {
		System.out.println("selectMedicalCouncil");
		WebElement selectMedicalCouncil = driver.findElement(By.xpath("//*[@id=\"doctor_medical_council_state\"]"));
		Select dropdown = new Select(selectMedicalCouncil);
		dropdown.selectByVisibleText("Bombay Medical Council");
		// driver.findElement(By.xpath("//*[@id=\"doctor_medical_council_state\"]")).sendKeys("Bombay
		// Medical Council");
		ActivityUtil.wait(2000);
	}

	//   City and specialization
	@Test(priority = 4)
	public void city_SpecSelect() {
		System.out.println("City and specialization");
		driver.findElement(By.xpath("//*[@id=\"doctor_location\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"doctor_location\"]")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"specializations_0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"specializations_0\"]")).sendKeys("Dentist");
		ActivityUtil.wait(2000);
	}

	// Element1
	@Test(priority = 5)
	public void element() {
		System.out.println("Element1");
		// This will scroll the page till the element is found
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		ActivityUtil.wait(2000);
		WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"btnSignup\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", Element1);
		// js.executeScript("window.scrollBy(0,1000)");
		ActivityUtil.wait(2000);
	}

	// Create
	@Test(priority = 6)
	public void create() {
		System.out.println("Create account new signup");
		// driver.findElement(By.xpath("//*[@id=\"signUp\"]")).click();
		driver.findElement(By.xpath("//*[@text=\"Create\"]")).click();
		ActivityUtil.wait(2000);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}

}
