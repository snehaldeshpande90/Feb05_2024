package Amezon_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	
	//dataProvider
	//mydata taking data from Dta_provider class its present in same pkg with name Data_provider java class
	 @Test(dataProvider="mydata" ,dataProviderClass=Data_provider.class)
	 public void Test1(String username, String password)
	 {
		 
	 	System.out.println(username);
	 	System.out.println(password);
	 	
	 }
	 
	 // 1st way //second way with another class
	/* @DataProvider(name="mydata")
	public Object[][] getData()
	{
		Object [][] data=new Object[3][2];
		data[0][0]="mahesh@123";
		data[0][1]="pass123";
		data[1][0]="mahesh@12";
		data[1][1]="pass12";
		data[2][0]="mahesh@1";
		data[2][1]="pass1";
		return data;*/
	}
	 
