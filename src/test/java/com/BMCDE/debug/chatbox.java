package com.BMCDE.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class chatbox extends BaseClass {
	
	@Test(priority=1) //Verify//chat widget

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
		
		Reporter.log("==== Chat Box Verified Successfully ====",true);
	}


}
