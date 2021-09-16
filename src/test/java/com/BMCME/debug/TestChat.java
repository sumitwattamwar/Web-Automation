package com.BMCME.debug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import ec.selenium.util.ActivityUtil;

public class TestChat extends CMEBASE
{

	
	// Find frame or iframe and switch
	@Test(priority= 1)
	public void iframeSwitch()  {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("fc_widget"));

		WebElement chatBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("chat-content")));
		chatBox.click();
		
		chatBox.findElement(By.xpath("//*[@id=\"app-conversation-editor\"]")).sendKeys("Need help regarding an event");
		ActivityUtil.wait(2000);

	}

	//Chatbox send perform
	@Test(priority= 2)
	public void sendChat() throws AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		//driver.switchTo().defaultContent();
	}

}
	
