package com.banking.chromefeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownchild extends parentd {

	public By clickRadiobtn(String value) {

		By radiobtn = By.cssSelector("[value='" + value + "']");
		return radiobtn;

	}

	@Test
	public void childdropdown() throws InterruptedException {

		By male = clickRadiobtn("Male");

		getWait().until(ExpectedConditions.presenceOfElementLocated(male));

		getDriver().findElement(male).click();

		getDriver().findElement(By.xpath("//input[@value='Cricket']")).click();

		Select select = new Select(getDriver().findElement(By.id("Skills")));
		// iterate through options
		List<WebElement> dropvalue = select.getOptions();

		for (WebElement option : dropvalue) {

			System.out.println(option.getText());
		}

		select.selectByVisibleText("Ruby");
		Thread.sleep(7000);

	}

}
