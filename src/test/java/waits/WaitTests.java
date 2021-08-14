package waits;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTests;

public class WaitTests extends BaseTests{

	@Test
	public void testWaitUntilHidden()
	{
	var loadingPage	= homePage.clickDynamicLoading().clickExmple1();
	loadingPage.clickStartButton();
	assertEquals(loadingPage.getLoadedText(),"Hello World!","Incorrect loaded text!");
	}
	
	@Test
	public void testWaitUntilHidden2()
	{
	var loadingPage	= homePage.clickDynamicLoading().clickExmple2();
	loadingPage.clickStartButton();
	assertEquals(loadingPage.getLoadedText(),"Hello World!","Incorrect loaded text!");
	}
}
