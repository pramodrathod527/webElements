package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test1.Google_Search_Pages;



public class Google_Search_test {
	
	 static WebDriver driver = null;
	
	public static void googleSearch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.com/");
		
		//enter text in search textbox
		Google_Search_Pages.textbox_search(driver).sendKeys(" Automation step by step ");
		
		Thread.sleep(2000);
		//click on search button
		
		Google_Search_Pages.button_search(driver).click();
		
		
		//close browser
		driver.close();
		
		System.out.println("test completed");
		
		
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		googleSearch();
	}

}
