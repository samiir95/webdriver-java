package keys;

import static org.testng.Assert.*;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTests;

public class KeysTests extends BaseTests{

//	@Test
//	public void testBackSpace()
//	{
//		var keyPage = homePage.clickKeyPresses();
//		keyPage.enterText("A" + Keys.BACK_SPACE);
//		assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "incorrect text in results");
//	}
	
//	@Test
//	public void testPI() throws InterruptedException
//	{
//		var keyPage = homePage.clickKeyPresses();
//		keyPage.enterPI();
//		Thread.sleep(5000);
//		
//	}
	
	@Test
	public void testSlider()
	{
		String value = "4";
	var horizontalSlider = homePage.clickHorizontalSlider();
	horizontalSlider.setSliderValue(value);
	assertEquals(horizontalSlider.getSliderValue(), value, "incorrect text");
	}
}
