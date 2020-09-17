package com.ta.mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) {
		//iframe ia an Html document that is embeded inside an Html document, how to detect iframe
		//to get text from iframe right click on iframe you can see This Frame option we can see and we will know that there is a frame
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		//driver.switchTo().parentFrame(); is used to switch frame inside frame
		//driver.switchTo().frame(0); //this is by using index 0
		//driver.switchTo().frame("frame1");//this is by using id , frame1 is the id
		
		/*WebElement myFrame = driver.findElement(By.tagName("iframe"));
		System.out.println("Frame size" +myFrame);*/
		
		WebElement myframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));// this is by using xpath
		driver.switchTo().frame(myframe); 
		//actions inside frame
		System.out.println("I am inside frame name iframe");
		
	}
}
