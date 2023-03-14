package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.Google_search_page_model;

public class Google_search_test_model {
	
	static WebDriver driver = null;
	
	
	public static void googleSearchTest() {

		System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 Google_search_page_model searchPageObj = new Google_search_page_model(driver); 
		 
		 driver.get("https://www.google.com/");
		 
		 searchPageObj.set_text_in_search_box("A B C D");
		 searchPageObj.click_search_button();
		 driver.close();
		 
		 
	}

	public static void main(String[] args) {
		
		googleSearchTest();
	}
	
	
}
	
