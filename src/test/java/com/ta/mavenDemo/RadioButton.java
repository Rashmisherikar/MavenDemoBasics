package com.ta.mavenDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		driver.manage().window().maximize();
		
		List<WebElement> radio_button = driver.findElements(By.name("software"));
		
		boolean bvalue;
		bvalue = radio_button.get(1).isSelected();
		System.out.println(bvalue);
		if(bvalue == false) {
			radio_button.get(1).click();
			System.out.println(bvalue);
		}
		else {
			System.out.println("It is already selected, Select other option");
		}
		
	}

}
