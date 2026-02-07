package com.banking.chromefeatures;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//implicit wait
//explicit wait
//fluent wait

public class waits {

	WebDriver driver;
	// WebDriverWait wait;
	FluentWait<WebDriver> wait;

	

	@Test
	public void implicitWaitExample() throws InterruptedException {

		By userNmae = By.xpath("//input[@name='username']");
		By password = By.xpath("//input[@name='password']");

		wait.until(ExpectedConditions.visibilityOfElementLocated(userNmae));

		driver.findElement(userNmae).sendKeys("Admin");

		wait.until(ExpectedConditions.visibilityOfElementLocated(password));

		driver.findElement(password).sendKeys("admin123");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space(text()='Login')]")))
				.click();

		// driver.findElement(By.xpath("//button[normalize-space(text()='Login')]")).click();

		Thread.sleep(5000);

	}

	@AfterMethod
	public void afterMethod() {

		if (driver != null) {
			driver.quit();

		}

	}

}
