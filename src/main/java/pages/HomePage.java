package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	//private By formAuthenticationLink = By.linkText("Form Authentication");
	
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
	}

	public LoginPage clickFormAuthentication()
	{
		//driver.findElement(formAuthenticationLink).click();
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}
	
	public DropDownPage clickDropDown()
	{
		clickLink("Dropdown");
		return new DropDownPage(driver);
	}
	
	public HoversPage clickHovers()
	{
		clickLink("Hovers");
		return new HoversPage(driver);
	}
	
	public KeyPressesPage clickKeyPresses()
	{
		clickLink("Key Presses");
		return new KeyPressesPage(driver);
	}
	
	private void clickLink(String linkText)
	{
		driver.findElement(By.linkText(linkText)).click();
	}
	
	public HorizontalSlider clickHorizontalSlider() {
		clickLink("Horizontal Slider");
		return new HorizontalSlider(driver);
	}
	
	public AlertsPage clickJavaScriptAlerts()
	{
		clickLink("JavaScript Alerts");
		return new AlertsPage(driver);
	}
	
	public FileUploadPage clickFileUpload()
	{
		clickLink("File Upload");
		return new FileUploadPage(driver);
	}
	
	public ContextMenu clickContextMenu()
	{
		clickLink("Context Menu");
		return new ContextMenu(driver);
	}
	
	public WYSIWYGEditorPage clickWYSIWYGEditor()
	{
		clickLink("WYSIWYG Editor");
		return new WYSIWYGEditorPage(driver);
	}
	
	public FramesPage clickFrames()
	{
		clickLink("Frames");
		return new FramesPage(driver);
	}
	
	public DynamicLoadingPage clickDynamicLoading()
	{
		clickLink("Dynamic Loading");
		return new DynamicLoadingPage(driver);
	}
	
	public LargeAndDeepDomPage clickLargeAndDeepDom()
	{
		clickLink("Large & Deep DOM");
		return new LargeAndDeepDomPage(driver);
	}
	
	public InfinteScrollPage clickInfinteScroll()
	{
		clickLink("Infinite Scroll");
		return new InfinteScrollPage(driver);
	}
	
	public MultipleWindowsPage clickMultipleWindows() {
		clickLink("Multiple Windows");
		return new MultipleWindowsPage(driver);
	}
}
