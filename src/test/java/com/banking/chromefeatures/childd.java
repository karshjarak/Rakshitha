package com.banking.chromefeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class childd extends parentd {

	@Test
	public void myTestCase() throws InterruptedException {

		By userNmae = By.xpath("//input[@name='username']");
		By password = By.xpath("//input[@name='password']");

		getWait().until(ExpectedConditions.visibilityOfElementLocated(userNmae));

		getDriver().findElement(userNmae).sendKeys("Admin");
		
		

		FluentWait<WebDriver> fluentWait = getFluentWait(10, 3);
		
		
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(password));

		getDriver().findElement(password).sendKeys("admin123");
		
		FluentWait<WebDriver> fluentWaits = getFluentWait(20, 5);

		fluentWaits.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space(text()='yeurywuie')]")))
				.click();

		// driver.findElement(By.xpath("//button[normalize-space(text()='Login')]")).click();

		Thread.sleep(5000);

	}

}