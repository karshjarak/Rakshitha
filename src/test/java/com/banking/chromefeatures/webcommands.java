package com.banking.chromefeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class webcommands {

	ChromeDriver driver;
	
	//css selector
	//xpath
	
	//tagname[attribute='value']
	

	// web elements commands

	// classname
	// id
	// name
	// linktext
	// partiallinktext
	// tagname
	
	//isDisplayed()
	//isEnabled()
	//isSelected()
	//getText()
	//getAttribute()
	//findElement()
	//findElements()
	//clear()
	//sendKeys()
	//click()
	//submit()
	

	@BeforeMethod
	public void sampleMethod() {

		driver = new ChromeDriver();

	}

	@Test
	public void sampleMethodTwo() throws InterruptedException {

		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	   String value =	driver.findElement(By.tagName("h1")).getText();
	
	   
	    System.out.println("Heading is: " + value);
		WebElement username = driver.findElement(By.id("login_field"));
		username.sendKeys("testusername");
		
		System.out.println(username.getAttribute("class"));
	  
		Thread.sleep(2000);
		driver.findElement(By.className("js-sign-in-button")).sendKeys("testpassword");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Sign in']")).click();

		List<WebElement> values = driver.findElements(By.tagName("a"));
		System.out.println("Total links: " + values.size());
		
		for (WebElement link : values) {
			
			if(link.getText().isEmpty()) {
				continue;
			}
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

	}

	// cssselector
	// xpath

}
