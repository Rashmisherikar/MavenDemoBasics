package com.ta.mavenDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableFetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/8532/scorecard/966761/india-vs-united-arab-emirates-9th-match-asia-cup-2015-16");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//body//div[@class='match-scorecard-page']//div//div[1]//div[1]//div[1]//div[1]//div[1]//table[1]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int rnum = 0; rnum < rows.size(); rnum++) {
			List<WebElement> header = rows.get(rnum).findElements(By.tagName("th"));
			for(int head = 0; head < header.size(); head++) {
				System.out.print(header.get(head).getText());
			}
			header = rows.get(rnum).findElements(By.tagName("td"));
			for(int head = 0; head < header.size(); head++) {
				System.out.print(header.get(head).getText());
			}
			System.out.println("");
			}

	}

}
