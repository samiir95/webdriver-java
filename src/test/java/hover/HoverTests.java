package hover;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTests;

public class HoverTests extends BaseTests{

	@Test
	public void testHoverUser1()
	{
		var hoversPage =homePage.clickHovers();
		var figureCaption = hoversPage.hoverOverFigure(1);
		assertTrue(figureCaption.isCaptionDisplayed(), "caption isn't displayed");
		assertEquals(figureCaption.getTitle(), "name: user1" , "incorrect title!");
		assertTrue(figureCaption.getLink().endsWith("/users/1"), "incorrect link!");
		assertEquals(figureCaption.getLinkText(), "View profile" , "incorrect link text!");
	}
}
