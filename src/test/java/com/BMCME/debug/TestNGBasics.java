package com.BMCME.debug;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics 
{
	//Preconditions
	@BeforeSuite
	public void setup()
	{
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("BeforeTest");

	}
	
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("@BeforeClass");

	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("@BeforeMethod");

	}
	
	
	//Actual test
	@Test
	public void titleBMCMETest()
	{
		System.out.println("test the title");

	}
	
	@Test
	public void titleBMCMETest2()
	{
		System.out.println("test the title2");

	}
	
	/*
	 * //Postconditions
	 * 
	 * @AfterTest public void deleteAllCookies() {
	 * System.out.println("delete all cookies");
	 * 
	 * }
	 * 
	 * @AfterMethod public void logout() { System.out.println("logout");
	 * 
	 * }
	 * 
	 * @AfterClass public void closeBrowser() {
	 * System.out.println("close the browser");
	 * 
	 * }
	 * 
	 * @AfterSuite public void generateTestReport() {
	 * System.out.println("generate test reports");
	 * 
	 * }
	 */
}
