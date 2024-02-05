package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	//WebElement Varible declaration
@FindBy(xpath="//input[@name='username']")   
private  WebElement userName;
@FindBy(xpath="//input[@name='password']")   
private  WebElement passWord;
@FindBy(xpath="//button[@type='submit']")   
private  WebElement signIn;


//Constructor declaration
public LoginOrSignUpPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void SendUserName()
{
	userName.sendKeys("Admin");
}
public void SendPassword()
{
	passWord.sendKeys("admin123");
	
}
public void ClickOnLogIn()
{
	signIn.click();
	
}
//group of calling
public void signIn()
{
	userName.sendKeys("mahesh@gamail.com");
	passWord.sendKeys("123");
	signIn.click();
}
}



