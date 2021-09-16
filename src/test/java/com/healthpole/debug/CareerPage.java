package com.healthpole.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CareerPage extends TestBase {
	
	    @Test(priority=1) 
		void About_Tab() throws InterruptedException //About Tab
		{

	    	driver.get("http://careers.healthpole.com/");
	    	Thread.sleep(5000);
	    	//About                                  
	    			driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(1) > a")).click();
	    			Thread.sleep(3000);
	    			driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.actions > a:nth-child(2) > img")).click(); //more team
	    			Thread.sleep(5000);
	    			driver.findElement(By.cssSelector("#team-block > div > div.block-cta.text-center > a")).click(); //want to join us?
	    			Thread.sleep(3000);

		}
		
		
		
	    @Test(priority=2) //contact tab
		
		public void  contact_tab() throws InterruptedException  
		{
	    	driver.get("http://careers.healthpole.com/");
	    	Thread.sleep(5000);

		  driver.findElement(By.xpath("/html/body/header/div/nav/div/ul/li[2]/a")).click();
	  
		 
         //Map
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,350)", "");
          
		  Thread.sleep(10000);
		//Directions
		     driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div/div/div[2]/div[1]/a/div[2]")).click();
		  
		//large map
	      driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div/div/div[7]/div/a")).click();
	  
	   //map view
	          driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]")).click();
	  
		}
	       
@Test(priority=3) //Available jobs
		
		public void Available_jobs() throws InterruptedException  
		{

	driver.get("http://careers.healthpole.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.actions > a:nth-child(2) > img")).click(); 
		  Thread.sleep(3000);
		}


@Test(priority=4) //COMPANY CULTURE

public void COMPANY_CULTURE() throws InterruptedException  
{
//Thread.sleep(3000);
	 
	driver.get("http://careers.healthpole.com/");
	Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"page-nav\"]/li[1]/a")).click();
}
@Test(priority=5) //Our Values

public void Our_Values() throws InterruptedException  
{
	driver.get("http://careers.healthpole.com/");
	Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/a")).click();
}

@Test(priority=6) //Current Jobs

public void Current_Jobs() throws InterruptedException  
{
	driver.get("http://careers.healthpole.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[3]/a")).click(); //Current Jobs
	
	//motion graphic artist
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#jobs-block > div > div.job-list.text-center > div:nth-child(1) > h3 > a")).click(); 
	Thread.sleep(4000);
	JavascriptExecutor js28 = (JavascriptExecutor) driver;
	js28.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js28.executeScript("window.scrollBy(0,900)", "");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.back-to-main > a")).click();

	//Graphic designer
	driver.findElement(By.cssSelector("#jobs-block > div > div.job-list.text-center > div:nth-child(2) > h3 > a")).click();
	Thread.sleep(4000);
	JavascriptExecutor js281 = (JavascriptExecutor) driver;
	js281.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js281.executeScript("window.scrollBy(0,900)", "");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.back-to-main > a")).click(); 

	//CRM
	driver.findElement(By.cssSelector("#jobs-block > div > div.job-list.text-center > div:nth-child(3) > h3 > a")).click();
	Thread.sleep(4000);
	JavascriptExecutor js2811 = (JavascriptExecutor) driver;
	js2811.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js2811.executeScript("window.scrollBy(0,900)", "");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.back-to-main > a")).click(); 

	//CRE
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#jobs-block > div > div.job-list.text-center > div:nth-child(4) > h3 > a")).click();
	Thread.sleep(4000);
	JavascriptExecutor js28111 = (JavascriptExecutor) driver;
	js28111.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js28111.executeScript("window.scrollBy(0,900)", "");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.back-to-main > a")).click(); 

	//ROR dev
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#jobs-block > div > div.job-list.text-center > div:nth-child(5) > h3 > a")).click();
	Thread.sleep(4000);
	JavascriptExecutor js281111 = (JavascriptExecutor) driver;
	js281111.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js281111.executeScript("window.scrollBy(0,900)", "");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.back-to-main > a")).click(); 

	//Sr web ui dev
	driver.findElement(By.cssSelector("#jobs-block > div > div.job-list.text-center > div:nth-child(6) > h3 > a")).click();
	Thread.sleep(3000);
	JavascriptExecutor js88 = (JavascriptExecutor) driver;
	js88.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js88.executeScript("window.scrollBy(0,900)", "");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.back-to-main > a")).click(); 

	
}
	  
@Test(priority=5)  //Social Media Logos

public void  SocialMediaLogos() throws InterruptedException  
{  
	  
	driver.get("http://careers.healthpole.com/");
	Thread.sleep(5000);
	
	  //fb
	   driver.findElement(By.xpath("/html/body/footer/div/div/ul/li[1]/a/i")).click();
	   Thread.sleep(5000);
	   
	  //twitter
	   driver.findElement(By.xpath("/html/body/footer/div/div/ul/li[2]/a/i")).click();
	   Thread.sleep(5000);
	   
	  //insta
	   driver.findElement(By.xpath("/html/body/footer/div/div/ul/li[3]/a/i")).click();
	   Thread.sleep(5000);
	   
	  //linkedin
	   driver.findElement(By.xpath("/html/body/footer/div/div/ul/li[4]/a/i")).click();
	   Thread.sleep(5000);
	  
	}
			
}