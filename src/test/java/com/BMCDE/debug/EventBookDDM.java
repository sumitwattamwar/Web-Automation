package com.BMCDE.debug;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Utility_Functions.Xls_utility;



public class EventBookDDM extends BaseClass { 

	@Test(priority=1) //EventBook

	public void  EventBook() throws InterruptedException, AWTException  
	{
		
		 Xls_utility reader = new Xls_utility("C:\\Users\\Hp\\eclipse-workspace\\WEB_Auto\\src\\test\\java\\com\\testdata\\DataDriven.xlsx");
		 
		 
			
			String FirstName =  reader.getCellData("Reg_form_booking", "firstName", 2);
			System.out.println(FirstName); 
		
			
		
			String MiddleName =  reader.getCellData("Reg_form_booking", "middleName", 2);
			System.out.println(MiddleName); 
		
			String LastName =  reader.getCellData("Reg_form_booking", "lastName", 2);
			System.out.println(LastName); 
		
			String mobileNumber =  reader.getCellData("Reg_form_booking", "mobileNumber", 2);
			System.out.println(mobileNumber); 
		
			String email =  reader.getCellData("Reg_form_booking", "email", 2);
			System.out.println(email); 
			
			
			
			String city =  reader.getCellData("Reg_form_booking", "city", 2);
			System.out.println(city); 
		

			String speciality =  reader.getCellData("Reg_form_booking", "speciality", 2);
			System.out.println(speciality); 
			
			String institute =  reader.getCellData("Reg_form_booking", "institute", 2);
			System.out.println(institute); 
		
			String DCI =  reader.getCellData("Reg_form_booking", "DCI", 2);
			System.out.println(DCI); 
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[2]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/aside/a/div/div[1]/img[1]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div/a/button")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/input")).sendKeys(FirstName);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/div/input")).sendKeys(MiddleName);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[4]/div/div/input")).sendKeys(LastName);
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div[1]/input")).sendKeys(mobileNumber);
		Thread.sleep(2000L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div[3]")).click();

		Thread.sleep(2000L);
		driver.findElement(By.xpath("//html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[7]/div/div/input")).sendKeys(email);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[9]/div/div/input")).sendKeys(city);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[12]/div/div/input")).sendKeys(speciality);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[13]/div/div/input")).sendKeys(institute);

		
		Thread.sleep(2000L);	
	     

	By MCI = By.xpath("//span[@title='Select Your Dental Council Name']");
	By state =By.xpath("//li[@id='select2-select2-result-cva4-Maharashtra State Dental Council']");	 
	
    Select select1 = new Select (driver.findElement(MCI));
    select1.selectByVisibleText("Andhra Pradesh State Dental Council");
    
		   
   
	    Thread.sleep(2000L);        
		driver.findElement(By.xpath("//input[@id=\"councilNumber\"]")).sendKeys(DCI);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[7]/div/div/div/div/div/button")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[5]/div[4]/div/div/div/div/div/a")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/form/div/div[3]/div/div/div/div/div/button")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[2]/div[3]/div/div/div/span")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id=\"successBtn\"]")).click();

		Thread.sleep(2000L);
		String Expected = "Thank you for booking via BookMyCDE. Ticket has been sent to your email ID.";
		String Actual = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/div[2]/p[2]")).getText();
		
		Assert.assertEquals(Expected, Actual);		

		Reporter.log("==== Event Booked Successfully ====",true);
		//share ticket
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/a/button")).click();
		Thread.sleep(2000L);
		
		//copy link
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div[2]/div/div/div[2]/div[2]/span")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div[2]/div/div/button")).click();
		
		//resend booking details
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[2]/span")).click();
	}
}
	

