package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeWindow 
{
	@FindBy(xpath="//ul[@class=\"oxd-main-menu\"]//li[1]//a")   
	private  WebElement adminButton;
	@FindBy(xpath="//input[@id='pass']")   
	private  WebElement pimButton;
	

	//Constructor declaration
	public HomeWindow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnAdminButton()
	{
		adminButton.click();
	}
	public void clickOnPimButton()
	{
		pimButton.click();
		
	}
}
