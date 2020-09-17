package com.ta.mavenDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindows {

	public static void main(String[] args) {
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement wb = driver.findElement(By.id("windowButton"));
		wb.click();
		
		String oldWindow = driver.getWindowHandle(); //deals with single window
		
		Set<String> getAllwindows = driver.getWindowHandles(); //deals with multiple windows
		String[] getWindow = getAllwindows.toArray(new String[getAllwindows.size()]);
		
		 driver.switchTo().window(getWindow[1]);
	
	     driver.get("https://www.google.com/");
		
		/*	for(String window1: getWindow) {
				driver.switchTo().window(window1);
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
			}*/
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(oldWindow);
		
	    System.out.println(driver.getCurrentUrl());
	}
}
