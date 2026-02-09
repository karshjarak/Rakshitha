package com.banking.chromefeatures;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class windows extends parentd {

	// alert
	// windows
	// frames

	@Test
	public void sampleMethod() throws InterruptedException {
		
		getDriver().switchTo().frame("singleframe");
		
		
	//	By frameElement = By.cssSelector("a[href='#Multiple']");
		By element = By.xpath("//input[@type='text']");
		
		getDriver().findElement(element).sendKeys("This is a frame");
		
	
		getDriver().switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		
		
		getDriver().findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		

//		By element = By.cssSelector("a[href^='#Multiple']");
//		
//		getWait().until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(element));
//
//		//String parentWindow = getDriver().getWindowHandle();
//
//		getDriver().findElement(element).click();
//		
//		Thread.sleep(3000);
//		
//		getDriver().findElement(By.cssSelector("#Multiple .btn")).click();
//
//		getWait().until(ExpectedConditions.numberOfWindowsToBe(3));
//		
//		
//		switchToWindow("Index");
//		
//		getDriver().findElement(By.cssSelector("#btn1")).click();
//		
//		switchToWindow("Frames & windows");
//		
//		getDriver().findElement(By.xpath("//a[text()='Home']")).click();
//		
//		Thread.sleep(5000);
		
		
		

//		Set<String> windows = getDriver().getWindowHandles();
//		
//		for (String window : windows) {
//			if (!window.equals(parentWindow)) {
//				getDriver().switchTo().window(window);
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		
//		getDriver().findElement(By.xpath("//a[@href='/downloads']")).click();
//		
//		getDriver().close();
//		
//		Thread.sleep(3000);
//		
//		getDriver().switchTo().window(parentWindow);
//		
//		getDriver().findElement(By.xpath("//a[text()='Home']")).click();
//		
//		
		
		
		

//		Thread.sleep(6000);
//		
//		JavascriptExecutor js = (JavascriptExecutor) getDriver();
//		//open in same window
//		js.executeScript("window.location = 'https://www.google.com/'");
//		
//	//	js.executeScript("window.open('https://www.google.com/')");
//		
//		//create an alert
//		js.executeScript("alert('This is an alert')");
//		
//		Thread.sleep(5000);
//		
//		Alert alert = getDriver().switchTo().alert();
//		
//		
//	//	alert.dismiss();
//		System.out.println(alert.getText());
//		alert.accept();
//	//	alert.getText();
//		//alert.sendKeys("Some text");
//		
//		Thread.sleep(6000);
//		
//		
//		
//		
//		
//		//create alert 
//		

	}

}
