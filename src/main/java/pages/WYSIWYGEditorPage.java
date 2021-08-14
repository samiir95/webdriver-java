package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

	private WebDriver driver;
	private String editorIframeID = "mce_0_ifr";
	private By textArea = By.id("tinymce");
	private By increaseIndentButton = By.cssSelector("#mceu_12 button");

	public WYSIWYGEditorPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private void switchToEditorArea() {
		driver.switchTo().frame(editorIframeID);
	}
	
	private void switchToMainArea() {
		driver.switchTo().parentFrame();
	}
	
	public void clearTextArea() {
		switchToEditorArea();
		driver.findElement(textArea).clear();
		switchToMainArea();
	}
	
	public void setTextArea(String text) {
		switchToEditorArea();
		driver.findElement(textArea).sendKeys(text);;
		switchToMainArea();

	}
	
	public String getTextFromEditor() {
		switchToEditorArea();
		String text = driver.findElement(textArea).getText();
		switchToMainArea();
		return text;

	}
	
	public void increaseIndention() {
		driver.findElement(increaseIndentButton).click();
	}
}
