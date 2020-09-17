package com.ta.mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		//To write css selector tagnameOperatorAttribut--> there are two operators # and . --> # is used for id and . is used for name
		
		WebElement username = driver.findElement(By.cssSelector("input.username"));
		username.sendKeys("abc");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("input#Login"))));
		WebElement login = driver.findElement(By.cssSelector("input#Login"));
		login.click();

	}
}
