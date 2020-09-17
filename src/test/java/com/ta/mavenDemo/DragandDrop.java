package com.ta.mavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//div[contains(@class,'dhx_tree-folder--focused dhx_tree-folder--selected')]//span[contains(@class,'dhx_tree-list-item__text')][contains(text(),'2008')]")).click();
		WebElement from = driver.findElement(By.xpath("//span[contains(text(),'Flexible Rails')]"));
		WebElement to = driver.findElement(By.xpath("//ul[contains(@class,'dhx_widget dhx_list')]"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();

	}

}
