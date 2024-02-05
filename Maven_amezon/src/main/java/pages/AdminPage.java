package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 
{
WebDriver driver;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")   
	private  WebElement userName;
	

	@FindBy(xpath="//input[@placeholder='Type for hints...']")   
	private  WebElement employeeName;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")   
	private  WebElement role;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")   
	private  WebElement status;
	
	
	@FindBy(xpath="(//div[@class='oxd-table']//div[@role='row'])[2]//div[2]")   
	private  WebElement resultUserName;
	
	@FindBy(xpath="(//div[@class='oxd-table']//div[@role='row'])[2]//div[3]")   
	private  WebElement resultUserRole;
	
	@FindBy(xpath="//button[@type='submit']")   
	private  WebElement searchButton;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]") 
	private WebElement statusDropDown;
	
	//Constructor declaration
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void eneterUserNameForSearch(String UserNameForSearch)
	{
		
	
		userName.sendKeys(UserNameForSearch);
		
	}
	public void eneterEmployeeNameForSearch(String EmployeeNameForSearch)
	{
		employeeName.sendKeys(EmployeeNameForSearch);
		
	}
	
	public void selectRole() throws InterruptedException
	{
		role.sendKeys("Admin");//open drop down
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/span")).click();
		
	}
	public void status() throws InterruptedException
	{
		status.click();
		Thread.sleep(2000);
		statusDropDown.click();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]")).click();
		
	}
	public void getresultUserName()
	{
		resultUserName.getText();		
	}
	
	public void getresultUserRole()
	{
		resultUserRole.getText();		
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
}
