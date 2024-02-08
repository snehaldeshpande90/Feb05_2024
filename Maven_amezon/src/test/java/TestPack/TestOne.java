package TestPack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import Amezon_LoginPage.TableFetchdata;
import pages.AdminPage;
import pages.HomeWindow;
import pages.JavaScriptExecutor;
import pages.LoginOrSignUpPage;

public class TestOne {
	
WebDriver driver;
	
	/*
	 * @BeforeClass public void launchBrowser() { driver=new ChromeDriver();
	 * 
	 * }
	 */
@Test(priority=1)
public void openAdminPage() throws InterruptedException
{
	driver=new ChromeDriver();
	//WebDriver driver =new FirefoxDriver();
	//WebDriver driver1=new InternetExplorerDriver();
	Set<Cookie>cookie=driver.manage().getCookies();
	System.out.println("cookie size " +cookie.size());
	driver.manage().deleteCookie(null);//add cookie name
	for(Cookie cooke:cookie)
	{
		System.out.println(cooke.getName()+" "+cooke.getValue());
	}
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	LoginOrSignUpPage loginOrSignUpPage= new LoginOrSignUpPage(driver);
	loginOrSignUpPage.SendUserName();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	loginOrSignUpPage.SendPassword();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	loginOrSignUpPage.ClickOnLogIn();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.switchTo().alert().accept();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	  @Test(priority=2) public void toVerifySerchOnAdminPage() throws
	  InterruptedException 
	  {
		HomeWindow homeWindow=new HomeWindow(driver);
	  homeWindow.clickOnAdminButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  AdminPage adminPage=new AdminPage(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
     adminPage.eneterUserNameForSearch("Admin");
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
     //adminPage.eneterEmployeeNameForSearch("Admin");
     Thread.sleep(2000);
     adminPage.selectRole();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
     adminPage.status();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
     adminPage.clickOnSearchButton();
     //java scroptExecuter call methode
     JavaScriptExecutor js2=new JavaScriptExecutor ();
     js2.javaScriptExecutor3(driver);
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  }
	  
	  @Test(priority=3) 
	  public void fetchdata() 
	  { 
		 
		  
		  TableFetchdata tableFetchdata=new TableFetchdata();
		  tableFetchdata.tabledta(driver);
		  }
	 
}


