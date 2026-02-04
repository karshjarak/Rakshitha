package com.banking.chromefeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ohrm {

	
	
	
	//input[placeholder='Username'][name='username']
	
			

	@Test
	public void test() throws InterruptedException {	
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username'][name='username']"));
		username.sendKeys("Admin");
		
		System.out.println(username.getAttribute("class"));
	  
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-input[name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".orangehrm-login-button")).isDisplayed();
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		
		Thread.sleep(3000);

		List<WebElement> values = driver.findElements(By.tagName("a"));
		System.out.println("Total links: " + values.size());
		
		driver.quit();
		
	}
			
}
