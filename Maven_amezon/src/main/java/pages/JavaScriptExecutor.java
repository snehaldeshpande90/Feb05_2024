package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutor {
	
	 public void javaScriptExecutor3(WebDriver driver) 
	 {
		 JavascriptExecutor js1 =(JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,2000)");
		 
   }
}
