package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By userNameField = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.cssSelector("#login button");
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setUserName(String userName)
	{
		driver.findElement(userNameField).clear();
		driver.findElement(userNameField).sendKeys(userName);
	}
	
	public void setUserPassword(String passwordTxt)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(passwordTxt);
	}
	
	public SecureAreaPage clickLogin()
	{
		driver.findElement(loginButton).click();
		return new SecureAreaPage(driver);
		
	}
	
}
