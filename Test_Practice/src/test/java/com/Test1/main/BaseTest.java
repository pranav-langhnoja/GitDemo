package com.Test1.main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

	public static void main(String[] args) {
	 WebDriver driver=null;
	 BaseTest bTest=new BaseTest();
	 bTest.initWeddriver(driver);
	 driver.get("https://www.google.com");
	 
	

	}
	public void initWeddriver(WebDriver driver1) {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\120 V\\chromedriver.exe");
		driver1=new ChromeDriver();	
		driver1.get("https://www.google.com");
		
	}

}
