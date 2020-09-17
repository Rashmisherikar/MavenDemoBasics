package com.ta.mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement selectMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select dropdown = new Select(selectMenu);
		//dropdown.selectByVisibleText("Baby");
		//dropdown.selectByValue("search-alias=stripbooks");
		dropdown.selectByIndex(1);
	}

}
