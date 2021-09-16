package com.healthpole.debug;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HPtestng extends TestBase {
	WebDriver  driver = null;

	




	@Test(priority=1) //Verify title

	public void  pagetitle()  
	{


		String Actual = driver.getTitle();
		String Expected = "Healthpole";

		assertEquals(Expected,Actual);

	}




	@Test(priority=2) //Verify hplogo

	public void hplogo() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/header/div/div/a/img[2]")).isDisplayed();


	}

	@Test(priority=3) //Verify DropDown WhoWeare

	public void WhoWeare() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='redirectClick dropdown-toggle']")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ;
		Thread.sleep(3000);
		JavascriptExecutor js21 = (JavascriptExecutor) driver;
		js21.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		JavascriptExecutor js211 = (JavascriptExecutor) driver;
		js211.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
         }

	@Test(priority=4) //Verify  we are healthpole

	public void wearehealthpole() throws InterruptedException {

		        Actions actions = new Actions(driver);
				Thread.sleep(3000);
				WebElement DropDown1 = driver.findElement(By.cssSelector("[class='redirectClick dropdown-toggle']"));
				actions.moveToElement( DropDown1).perform();
				driver.findElement(By.cssSelector("#nav > li:nth-child(1) > ul > li:nth-child(1) > a")).click();
				Thread.sleep(3000);
				JavascriptExecutor js211 = (JavascriptExecutor) driver;
				js211.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("[class='btn btn-main']")).click();
				Thread.sleep(3000);
				JavascriptExecutor js2111 = (JavascriptExecutor) driver;
				js2111.executeScript("window.scrollBy(0,350)", "");
				js2111.executeScript("window.scrollBy(0,600)", "");
				Thread.sleep(3000);
			 }

	@Test(priority=5) //Verify // DropDown//OurBoardAdvisor

	public void OurBoardAdvisor() throws InterruptedException {


				Thread.sleep(3000);
				 Actions actions = new Actions(driver);
				WebElement DropDown11 = driver.findElement(By.cssSelector("[class='redirectClick dropdown-toggle']"));
				actions.moveToElement( DropDown11).perform();
				driver.findElement(By.cssSelector("#nav > li:nth-child(1) > ul > li:nth-child(2) > a")).click();
				Thread.sleep(3000);
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				js1.executeScript("window.scrollBy(0,600)", "");
				Thread.sleep(3000);
	}
@Test(priority=6) //Verify // DropDown//ourOffices

	public void ourOffices() throws InterruptedException {


			Thread.sleep(3000);
			 Actions actions = new Actions(driver);
			WebElement DropDown111 = driver.findElement(By.cssSelector("[class='redirectClick dropdown-toggle']"));
			actions.moveToElement( DropDown111).perform();
			driver.findElement(By.cssSelector("#nav > li:nth-child(1) > ul > li:nth-child(3) > a")).click();
			Thread.sleep(3000);
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(3000);
			js11.executeScript("window.scrollBy(0,600)", "");  
			Thread.sleep(4000);
}

@Test(priority=7) //Verify // DropDown//SecurityPrivacy

public void SecurityPrivacy() throws InterruptedException {



			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			WebElement DropDown1111 = driver.findElement(By.cssSelector("[class='redirectClick dropdown-toggle']"));
			actions.moveToElement( DropDown1111).perform();
			driver.findElement(By.cssSelector("#nav > li:nth-child(1) > ul > li:nth-child(4) > a")).click();
			JavascriptExecutor js2111 = (JavascriptExecutor) driver;
			js2111.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[class='btn btn-main']")).click();
			js2111.executeScript("window.scrollBy(0,450)", "");
			Thread.sleep(3000);
			js2111.executeScript("window.scrollBy(0,650)", "");
			Thread.sleep(4000);
}	

@Test(priority=8) //Verify //Who We Serve

public void WhoWeServe() throws InterruptedException {

	    Thread.sleep(5000);
		driver.findElement(By.cssSelector("#nav > li:nth-child(2) > a")).click();
		JavascriptExecutor js21111 = (JavascriptExecutor) driver;
		js21111.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='btn btn-main']")).click();
		Thread.sleep(3000);
		js21111.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js21111.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		}

	@Test(priority=9) //Verify//Our Products DropDown//BMCME

	public void BMCME() throws InterruptedException {

		        Actions actions = new Actions(driver);
				WebElement DropDown2 = driver.findElement(By.cssSelector("[class='dropdown-toggle redirectClick']"));
				actions.moveToElement( DropDown2).perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[3]/ul/li[1]/a")).click();
				Thread.sleep(3000);               
				JavascriptExecutor js111 = (JavascriptExecutor) driver;
				js111.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				js111.executeScript("window.scrollBy(0,650)", "");
				Thread.sleep(3000);
	}	

	@Test(priority=10)//Verify //Our Products DropDown//BMCDE

	public void BMCDE() throws InterruptedException {



				Thread.sleep(3000);
				Actions actions = new Actions(driver);
				WebElement DropDown21 = driver.findElement(By.cssSelector("[class='dropdown-toggle redirectClick']"));
				actions.moveToElement( DropDown21).perform();
				driver.findElement(By.cssSelector("#nav > li:nth-child(3) > ul > li:nth-child(2) > a")).click();
				Thread.sleep(3000);
				JavascriptExecutor js1111 = (JavascriptExecutor) driver;
				js1111.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				js1111.executeScript("window.scrollBy(0,650)", "");
				Thread.sleep(3000);
	}



	@Test(priority=11)//Verify //Our Products DropDown//indian doctor network

	public void indiandoctornetwork() throws InterruptedException {

	            Thread.sleep(3000);
				Actions actions = new Actions(driver);
				WebElement DropDown211 = driver.findElement(By.cssSelector("[class='dropdown-toggle redirectClick']"));
				actions.moveToElement( DropDown211).perform();
				driver.findElement(By.cssSelector("#nav > li:nth-child(3) > ul > li:nth-child(3) > a")).click();
				Thread.sleep(3000);
				JavascriptExecutor js11111 = (JavascriptExecutor) driver;
				js11111.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				js11111.executeScript("window.scrollBy(0,600)", "");
				Thread.sleep(3000);
	}

	@Test(priority=12)//Verify //Our Products DropDown//indian dental network

	public void indiandentalnetwork() throws InterruptedException {


		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement DropDown2111 = driver.findElement(By.cssSelector("[class='dropdown-toggle redirectClick']"));
		actions.moveToElement( DropDown2111).perform();
		driver.findElement(By.cssSelector("#nav > li:nth-child(3) > ul > li:nth-child(4) > a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js1111111 = (JavascriptExecutor) driver;
		js1111111.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js1111111.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
	}




	@Test(priority=13)//Verify //Our Products DropDown//indian ayush network

	public void indianayushnetwork() throws InterruptedException {




				Thread.sleep(3000);
				Actions actions = new Actions(driver);
				WebElement DropDown21111 = driver.findElement(By.cssSelector("[class='dropdown-toggle redirectClick']"));
				actions.moveToElement( DropDown21111).perform();
				driver.findElement(By.cssSelector("#nav > li:nth-child(3) > ul > li:nth-child(5) > a")).click();
				Thread.sleep(3000);
				JavascriptExecutor js11111111 = (JavascriptExecutor) driver;
				js11111111.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				js11111111.executeScript("window.scrollBy(0,600)", "");
				Thread.sleep(3000);
	}


	@Test(priority=14)//Verify //Marketplace

	public void Marketplace() throws InterruptedException {


			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#nav > li:nth-child(4) > a")).click();
			Thread.sleep(3000);
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(3000);
			js3.executeScript("window.scrollBy(0,600)", ""); 
			Thread.sleep(3000);
	}




	@Test(priority=15)//Verify  //careers page

	public void careers() throws InterruptedException {

		Thread.sleep(3000);
		driver.get("http://careers.healthpole.com/");
		Thread.sleep(3000);
		//About                                  
				driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(1) > a")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.actions > a:nth-child(2) > img")).click(); //more team
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("#team-block > div > div.block-cta.text-center > a")).click(); //want to join us?
				Thread.sleep(3000);

				//View Available jobs
				driver.findElement(By.cssSelector("body > section > div.container.heading-content > div.actions > a:nth-child(2) > img")).click();

				 //Current Job Vacancies

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


				//Company Culture
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("#page-nav > li:nth-child(1) > a")).click(); 

				//Our Values
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("#page-nav > li:nth-child(2) > a")).click(); 

				//Current Jobs
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("#page-nav > li:nth-child(3) > a")).click();
	}


	@Test(priority=16)//Verify //Explore Us

	public void ExploreUs() throws InterruptedException 

	{

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='tp-caption btn btn-main']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
		js5.executeScript("window.scrollBy(0,600)", ""); 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='btn btn-main']")).click(); //Contact us
		Thread.sleep(4000);
		js5.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
		js5.executeScript("window.scrollBy(0,600)", ""); 
		Thread.sleep(3000);
	}

	@Test(priority=17) //Verify//chat widget

	public void ChatWidget() throws InterruptedException 

	{

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("fc_widget"));
		WebElement chatBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("chat-content")));
		chatBox.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#app-conversation-editor > p")).sendKeys("Test");
		driver.findElement(By.cssSelector("#app-conversation-editor > p")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/i")).click();
		Thread.sleep(3000);               
		driver.findElement(By.cssSelector("#emojis-people > div > button:nth-child(1) > span")).click(); //smiley
		Thread.sleep(3000);
		WebElement closechatBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/i"));
		closechatBox.click();
		Thread.sleep(3000);
	}


	@Test(priority=18) //Verify	//OUR SOL

	public void 	OURSOL() throws InterruptedException 

	{


	Thread.sleep(6000);
	driver.findElement(By.cssSelector("#body > header > div > div > a > img.logo-white")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("[class='btn btn-main mt-20']")).click(); //OUR SOL
	Thread.sleep(3000);
	JavascriptExecutor js6 = (JavascriptExecutor) driver;
	js6.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js6.executeScript("window.scrollBy(0,500)", ""); 
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("[class='btn btn-main']")).click(); //Contact us
	js6.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(3000);
	js6.executeScript("window.scrollBy(0,600)", ""); 
	Thread.sleep(3000);
	}


	@Test(priority=19) //Verify	//CONTACT US

	public void 	CONTACTUS() throws InterruptedException 

	{



				Thread.sleep(3000);
			    driver.findElement(By.cssSelector("[class='btn btn-main']")).click();
			    Thread.sleep(3000);
				JavascriptExecutor js7 = (JavascriptExecutor) driver;
				js7.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				js7.executeScript("window.scrollBy(0,600)", ""); 
				Thread.sleep(3000);
	}


	@Test(priority=19) 	//Verify//LEARN

	public void 	LEARN() throws InterruptedException 

	{


		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section[4]/div/div/div/a")).click();
		JavascriptExecutor js71 = (JavascriptExecutor) driver;
		js71.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js71.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(3000);
	}

	@Test(priority=20) 	//Verify// Slide Arrows

	public void 	SlideArrows() throws InterruptedException 

	{


		//Previous Slide Arrow
		Thread.sleep(3000);
		JavascriptExecutor js71 = (JavascriptExecutor) driver;
		js71.executeScript("window.scrollBy(0,2200)", "");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/section[5]/div/div/div/div/button[1]")).click();

		//Next Slide arrow
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/section[5]/div/div/div/div/button[2]")).click();


	}

	@Test(priority=21) 	//Verify//Join us

	public void 	Joinus() throws InterruptedException 

	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section[6]/div/div/div/a")).click();	
		Thread.sleep(3000);
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js7.executeScript("window.scrollBy(0,900)", ""); 
		Thread.sleep(3000);
	}



	//FooterElements


	@Test(priority=22) 	//Verify//FooterElement//Our Products

	public void 	FooterElements() throws InterruptedException 

	{

		//bmcme
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js68 = (JavascriptExecutor) driver;
		js68.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js68.executeScript("window.scrollBy(0,600)", ""); 

		//BMCDE
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#footer > div.top-footer > div > div > div:nth-child(2) > ul > li:nth-child(3) > a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js681 = (JavascriptExecutor) driver;
		js681.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		js681.executeScript("window.scrollBy(0,600)", ""); 
		Thread.sleep(3000);
		//IDN
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[2]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js6811 = (JavascriptExecutor) driver;
		js6811.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		js6811.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		//idn
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[2]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js68111 = (JavascriptExecutor) driver;
		js68111.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		js68111.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		//IAN
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[2]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js681111 = (JavascriptExecutor) driver;
		js681111.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js681111.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
	}




		@Test(priority=23) //Verify	//FooterElement//Quick links

		public void QuickLinks() throws InterruptedException 

		{



		//who we are 
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[3]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js98 = (JavascriptExecutor) driver;
		js98.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js98.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		//who we serve
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[3]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js981 = (JavascriptExecutor) driver;
		js981.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js981.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		//our products
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[3]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js9811 = (JavascriptExecutor) driver;
		js9811.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js9811.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);

		//Career
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[3]/ul/li[5]/a")).click();
		Thread.sleep(6000);
		}




			@Test(priority=24)//Verify 	//FooterElement//CONNECT WITH US SOCIALLY//fb

		public void CONNECT_WITHUS_SOCIALLY() throws InterruptedException 

		{

		Thread.sleep(3000); 
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[4]/ul/li[2]/a")).click();
		Thread.sleep(6000);

		}

			@Test(priority=25)//Verify 	//FooterElement//CONNECT WITH US SOCIALLY//twitter

			public void 	CONNECT_WITHUS_SOCIALLYtwitter() throws InterruptedException 

			{	
			driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS );
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[4]/ul/li[3]/a")).click();
		Thread.sleep(6000);
			}


			@Test(priority=26) //Verify	//FooterElement//CONNECT WITH US SOCIALLY//instagram

			public void CONNECT_WITHUS_SOCIALLYinstagram() throws InterruptedException 

			{	

		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS );
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[4]/ul/li[4]/a")).click();
		Thread.sleep(6000);
			}

			@Test(priority=27) 	//Verify//FooterElement//CONNECT WITH US SOCIALLY//linkedin

			public void CONNECT_WITHUS_SOCIALLYlinkedin() throws InterruptedException 

			{	

		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS );
		driver.findElement(By.xpath("/html/body/footer/footer/div[1]/div/div/div[4]/ul/li[5]/a")).click();
		Thread.sleep(3000);


		}




		@Test(priority=28) 	//Verify//FooterElement	//Logos//fb

		public void Logosfb() throws InterruptedException 

		{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/footer/footer/div[2]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.get("https://www.healthpole.com/");
		}

		@Test(priority=29) 	//Verify//FooterElement	//Logos//twitter

		public void Logostwitter() throws InterruptedException 

		{	

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/footer/footer/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);

       }

		@Test(priority=30) 	//FooterElement	//Logos//insta

		public void Logosinsta() throws InterruptedException 

		{

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/footer/footer/div[2]/div/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		}

		@Test(priority=31) 	//FooterElement	//Logos//linkedin

		public void Logoslinkedin() throws InterruptedException 

		{

				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/footer/footer/div[2]/div/div/div[2]/div/ul/li[4]/a")).click();
				Thread.sleep(3000);
		}

	
}



