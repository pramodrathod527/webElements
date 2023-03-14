package com.test;
	
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	
		public class Search {
		
		private static WebDriver driver = null;
		
		public static void googleSearch() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 
			driver.get("https://www.facebook.com/login/");
			
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
			
			username.sendKeys("pramod");
			Thread.sleep(2000);
			
			password.sendKeys("12345");
			Thread.sleep(2000);
			
			button.click();
			
			driver.close();
			
			
		}
		

		public static void main(String[] args) throws InterruptedException {
			
			googleSearch();
		}

	}



