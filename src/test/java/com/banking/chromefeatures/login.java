package com.banking.chromefeatures;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	
	ChromeDriver driver;

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
	
	//website: facebook, instagram
	
	public login() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@BeforeMethod
	public void sampleMethodOne() {
		
		driver = new ChromeDriver();
	}
	
	
	

	@Test
	public void sampleMethod() throws InterruptedException {

		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);
		
		Assert.assertTrue(title.contains("Facebook"), "Title does not contain Facebook");
	
		
		
		driver.navigate().to("https://www.instagram.com/");
		String newurl = driver.getCurrentUrl();
		
		
		Thread.sleep(5000);
		Assert.assertEquals(newurl, "https://www.facebook.com/", "URL does not match expected value");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);
	

	}
	
	
	@AfterMethod
	public void sampleMethodTwo() {
		driver.quit();
	}

}
