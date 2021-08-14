package navigation;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTests;

public class NavigationTests extends BaseTests{

//	@Test
//	public void testNavigator()
//	{
//		homePage.clickDynamicLoading().clickExmple1();
//		getWindowManager().goBack();
//		getWindowManager().refreshPage();
//		getWindowManager().goForward();
//		getWindowManager().goTo("https://google.com");
//	}
	
//	@Test
//	public void testSwitchTab()
//	{
//		homePage.clickMultipleWindows().clickHere();
//		getWindowManager().switchToTab("New Window");
//	}
//	
	@Test
	public void testWindowTabs()
	{
		var buttonPage = homePage.clickDynamicLoading().openEample2InNewTab();
		getWindowManager().switchToNewTab();
		assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed!");
	}
}
