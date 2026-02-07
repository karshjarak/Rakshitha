package com.banking.chromefeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class js extends parentd {

	// dropdown
	// mouse actions - click, double click, right click, mouse hover
	// js executor - scroll, click, sendkeys

	//// div[text()='Select Option']
	//// div[contains(text(), 'Group 1, option 2')]
	///
	///// span[text()='Companies']
	///// div[text()='Fintech companies']
	///
	// userName
	// userEmail

	@Test
	public void sample() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		js.executeScript("window.location='https://www.naukri.com/'");
		
		Thread.sleep(5000);
		
		//scroll down
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,0)");
		
		

//		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
//
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0, 0)");
		
		Thread.sleep(5000);
		
		
		js.executeScript("arguments[0].scrollIntoView();", getDriver().findElement(By.xpath("(//a[@class='view-all-comp'])[1]")));
		
	//	By element = By.id("submit");
		
		//getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
		
		//getDriver().findElement((By) getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Elements']")))).click();
		
	//	js.executeScript("arguments[0].click();", getDriver().findElement(By.cssSelector("#login_Layer")));
		
	//	js.executeScript("arguments[0].style.border='3px solid red'", getDriver().findElement(By.xpath("//input[contains(@placeholder, 'Enter your active Email ID')]")));
		
//		 js.executeScript("arguments[0].value='adarshini'", getDriver().findElement(By.xpath("//input[contains(@placeholder, 'Enter your active Email ID')]")));


		// Actions actions = new Actions(getDriver());

		// By selectValue = By.xpath("//span[text()='Companies']");

//		getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//*[text()='Elements']"))));

		// actions.doubleClick(getDriver().findElement(By.xpath("//*[text()='Elements']"))).perform();

		// actions.contextClick(getDriver().findElement(By.xpath("//h1[text()='Text
		// Box']"))).perform();

		// copy and paste using keyboard actions
//		
//		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		
//		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		// actions.keyUp(Keys.CONTROL).perform();

		// actions.sendKeys(Keys.TAB).perform();

		// getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id("userEmail")))).click();

//		.click();

		// actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		Thread.sleep(9000);

//		actions.moveToElement(getDriver().findElement(By.xpath("//span[text()='Companies']"))).perform();
//
//		actions.moveToElement(getDriver().findElement(By.xpath("//div[text()='Fintech companies']"))).click().perform();

		// getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Fintech
		// companies']"))).click();

		Thread.sleep(9000);

		// getDriver().get("https://demoqa.com/select-menu");

//		
//		By selectValue = By.xpath("//div[text()='Select Option']");
//		
//		getWait().until(ExpectedConditions.elementToBeClickable(selectValue)).click();	
//		
//		getDriver().findElement(By.xpath("//div[contains(text(), 'Group 1, option 2')]")).click();
//		Thread.sleep(9000);

	}

}
