package com.Test1.main;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	@BeforeTest
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\120 V\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test(description = "Open browser")
	public void openURL() {
		System.out.println("Open browser");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void clickexample() {
		Actions actions=new Actions(driver);
		actions.build().perform();
		
		
		
		
	}

}
