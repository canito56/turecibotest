package com.turecibo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.turecibo.factory.DriverFactory;

public class TuReciboTestSetup {
	
	static WebDriver driver;
	static WebDriverWait wait;

	public static void startUpBrowser() {
		
		driver = DriverFactory.getChromeDriver();
		driver.get("https://aqui poner el link a TuRecibo");  // Homepage
		driver.manage().window().maximize();
		wait = DriverFactory.getWebDriverWait();
		
	}
	
	public static void sendBy(String by, String byValue, String value) {
		
		switch(by) {
			case "id":
				driver.findElement(By.id(byValue)).sendKeys(value);
				break;
			case "name":
				driver.findElement(By.name(byValue)).sendKeys(value);
				break;
			case "xpath":
				driver.findElement(By.xpath(byValue)).sendKeys(value);
				break;
		}
		
	}
	
	public static WebElement findBy(String by, String byValue) {
		
		WebElement element = null;
		
		switch(by) {
			case "id":
				element = driver.findElement(By.id(byValue));
				break;
			case "name":
				element = driver.findElement(By.name(byValue));
				break;
			case "xpath":
				element = driver.findElement(By.xpath(byValue));
				break;
		}
		return element;
		
	}
	
	public static void clickBy(String by, String byValue) {
		
		switch(by) {
			case "id":
				driver.findElement(By.id(byValue)).click();
				break;
			case "name":
				driver.findElement(By.name(byValue)).click();
				break;
			case "xpath":
				driver.findElement(By.xpath(byValue)).click();
				break;			
		}
		
	}
	
	public static void waitBy(String by, String byValue) {
		
		switch(by) {
			case "id":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(byValue)));
				break;
			case "name":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(byValue)));
				break;
			case "xpath":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(byValue)));
				break;
		}
		
	}
	
	public static void closeBrowser() {
		DriverFactory.closeBrowser();
	}
	
}
