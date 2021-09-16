package com.BMCDE.debug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Utility_Functions.Xls_utility;

public class LoginDDF {
	public  void setup() throws InterruptedException 
	
	{
		
		 Xls_utility reader = new Xls_utility("C:\\Users\\Hp\\eclipse-workspace\\WEB_Auto\\src\\test\\java\\com\\testdata\\DataDriven.xlsx");
		 
		 
			String username =  reader.getCellData("Login_Cred", "username", 2);
			System.out.println(username); 
			
			/*String password =  reader.getCellData("Login_Cred", "password", 2);
			System.out.println(password); 
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hp\\\\Desktop\\\\chromedriver.exe");
		
        Reporter.log("====Browser Session Started====",true);
          WebDriver driver = new ChromeDriver();
		driver = new  ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.get("https://staging.bookmycde.com/");
		 Reporter.log("====Application  Started====",true);
		 
		 Reporter.log("====Login  Started====",true);
	        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div[2]/div[3]/div/ul/li/a")).click();
	        Thread.sleep(2000L);
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			Thread.sleep(2000L);
			Reporter.log("====Logged in Successfully====",true);
		*/
		 
	}
	
}
