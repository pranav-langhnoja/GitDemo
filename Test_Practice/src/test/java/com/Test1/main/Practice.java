package com.Test1.main;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	WebDriver driver;
	@BeforeTest
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\V114\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void search() {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Jenkins");
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.ENTER);
		
	}
		
		
		
	
}
