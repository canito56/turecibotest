package com.turecibo.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	private static WebDriver driver;
	private static WebDriverWait wait;

	private DriverFactory() {
	}
	
	public static WebDriver getChromeDriver() {		
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();				
		}
		return driver;
	}

	public static WebDriverWait getWebDriverWait() {
		if (wait == null) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}
		return wait;
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
}
