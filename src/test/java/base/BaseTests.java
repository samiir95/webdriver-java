package base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import pages.HomePage;
import utils.CookieManager;
import utils.EventReporter;
import utils.WindowManager;

public class BaseTests {

	private EventFiringWebDriver driver;
	protected HomePage homePage;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));	
		driver.register(new EventReporter());
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait
//		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS); //Wait page to load
//		driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS); // Wait for any a synchronous script (JS) execution to finish

		goHome();
//		setCookie();
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
				
	}
	
	@BeforeMethod
	public void goHome()
	{
		driver.get("https://the-internet.herokuapp.com/");

	}
	
	@AfterMethod
	public void recordFailures(ITestResult result)
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			var camera = (TakesScreenshot)driver;
			File screenShot = camera.getScreenshotAs(OutputType.FILE);
//			System.out.println("Screenshot taken: "+ screenShot.getAbsolutePath());
			try {
				Files.move(screenShot, new File("resources/screenshots/" + result.getName() + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public WindowManager getWindowManager()
	{
		return new WindowManager(driver);
	}
	
	private ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
//		options.setHeadless(true);
		return options;
	}
	
	 public CookieManager getCookieManager(){
	        return new CookieManager(driver);
	    }
	
//	private void setCookie() {
//		Cookie cookie = new Cookie.Builder("tau", "123")
//				.domain("the-internet.herokuapp.com")
//				.build();
//		driver.manage().addCookie(cookie);
//	}
	
//	public static void main(String args[])
//	{
//		BaseTests obj = new BaseTests();
//		obj.setUp();
//	}
}
