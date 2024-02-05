package Amezon_LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableFetchdata {

	
		
		public void tabledta(WebDriver driver)
		{
	

		//driver.findElement(By.xpath("(//div[@class='oxd-table']//div[@role='row'])[2]"));

	
		String data=driver.findElement(By.xpath("(//div[@class='oxd-table']//div[@role='row'])[2]//div[2]//div")).getText();
	System.out.println("this is new data " +data);

	String data1=driver.findElement(By.xpath("(//div[@class='oxd-table']//div[@role='row'])[2]//div[3]//div")).getText();
System.out.println("this is new data " +data1);

String data2=driver.findElement(By.xpath("(//div[@class='oxd-table']//div[@role='row'])[2]//div[4]//div")).getText();
System.out.println("this is new data " +data2);

String data3=driver.findElement(By.xpath("(//div[@class='oxd-table']//div[@role='row'])[2]//div[5]//div")).getText();
System.out.println("this is new data " +data3);

/*
 * String data4=driver.findElement(By.xpath(
 * "(//div[@class='oxd-table']//div[@role='row'])[2]//div[i]//div")).getText();
 * System.out.println("this is new data " +data4);
 */
	}
	
	
		

		

	
		}

