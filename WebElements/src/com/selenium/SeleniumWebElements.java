package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		
	
	System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone14");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	
	
	
	

	}

}
