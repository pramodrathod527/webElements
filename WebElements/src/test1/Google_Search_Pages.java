package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.test.Google_Search_test;

public class Google_Search_Pages {
	
	static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		
		List<WebElement> elements = driver.findElements(By.name("btnK"));
		
		WebElement ele1 = elements.get(0);
		WebElement ele2 = elements.get(1);
				
		
		if(ele1.isDisplayed()) {
			return ele1;
		}else {
			return ele2;
		}
		
		
	}

}
