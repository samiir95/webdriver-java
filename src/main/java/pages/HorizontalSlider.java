package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {

	private WebDriver driver;
	private By slider = By.cssSelector(".sliderContainer input");
	private By sliderValue = By.id("range");
	
	public HorizontalSlider(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setSliderValue(String value) {
		driver.findElement(slider).click();
		while(!getSliderValue().equals(value))
		{
			driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
		}
		
	}
	
	public String getSliderValue()
	{
		return driver.findElement(sliderValue).getText();
	}
}
