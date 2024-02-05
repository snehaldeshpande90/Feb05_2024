package Amezon_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginpage_TestNG 
{
	
	@BeforeMethod
	  public void beforemethode()
	     {

		System.out.println("beforemethode");
	     }
	
	@Parameters({"Chormebrowser"})
	@Test(priority =8, invocationCount=1)
	  public void show1(String Chormebrowser)
	     {
		WebDriver driver=new ChromeDriver();
		driver.get(Chormebrowser);
	
		System.out.println("test1");
	     
	     }
	@BeforeClass
	  public void beforeClass()
	     {
	    	 System.out.println("beforeClas");
	     }
	@Test(priority=1, timeOut=3000)//3s
	  public void dispaly() throws InterruptedException
	     {
		System.out.println("test2");
		Thread.sleep(4000);//4s
		System.out.println("After sleep");
	    // Assert.fail();
	     }
	@Test(enabled=false)
	public void Test12()
	{
		System.out.println("Test12");
	}
	@Test(groups= {"RegressionTesting"})
	public void Test13()
	{
		System.out.println("Test13");
	}
	
	@AfterMethod
	  public void Aftermethode()
	     {
		System.out.println("Aftermethode");
	     }
	@AfterClass
	  public void afterClass()
	     {
		System.out.println("afterClass");
	     
	     }
}
