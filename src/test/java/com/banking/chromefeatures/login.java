package com.banking.chromefeatures;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

	// browser commands
	// get()
	// navigate().to()
	// navigate().back()
	// navigate().forward()
	// navigate().refresh()
	// close()
	// quit()
	// getTitle()
	// getCurrentUrl()
	// getPageSource()
	//new test

	@Test
	public void sampleMethod() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}
