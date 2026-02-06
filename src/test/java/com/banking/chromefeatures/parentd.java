package com.banking.chromefeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class parentd {

	private WebDriver driver;
	private WebDriverWait wait;
	private FluentWait<WebDriver> fluentWait;

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		// driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(20));

		//

		// fluent wait
		// wait = new
		// FluentWait<WebDriver>(driver).withTimeout(java.time.Duration.ofSeconds(30))
		// .pollingEvery(java.time.Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

	}

	public FluentWait<WebDriver> getFluentWait(int timeoutInSeconds, int pollingInSeconds) {

		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(java.time.Duration.ofSeconds(30))
				.pollingEvery(java.time.Duration.ofSeconds(5)).ignoring(java.util.NoSuchElementException.class);
		return fluentWait;

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	@AfterMethod
	public void afterMethod() {

		if (driver != null) {
			driver.quit();

		}

	}

}
