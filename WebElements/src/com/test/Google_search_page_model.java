package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_search_page_model {
	
	WebDriver driver = null;
	
	By textbox_search = By.xpath("//input[@name='q']");
	By button_search = By.xpath(("//input[@name='btnK']"));
	
	
	public Google_search_page_model(WebDriver driver) {
		this.driver = driver;
	}
	
	public void set_text_in_search_box(String text){
		
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	public void click_search_button() {
		
		List<WebElement> elements = driver.findElements(button_search);
		
		
		for(int i=0;i<elements.size();i++) {
			if(elements.get(i).isDisplayed()) {
				try {
					elements.get(i).click();
				}
				catch(ElementClickInterceptedException ex){
					
				}
				return;
			}
		}
		
		
	}
}
