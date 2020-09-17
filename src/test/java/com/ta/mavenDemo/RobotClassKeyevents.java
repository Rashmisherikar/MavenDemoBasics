package com.ta.mavenDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassKeyevents { 

	public static void main(String[] args) throws InterruptedException, AWTException{
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		Robot r = new Robot();
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("abc");
		r.keyPress(KeyEvent.VK_ENTER); // press the key
		r.keyRelease(KeyEvent.VK_ENTER); //release the key
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_CONTROL); //press control button
		r.keyPress(KeyEvent.VK_T);	 //press t button so when you press contol + t new tab will open
		
	}
}
