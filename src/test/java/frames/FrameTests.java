package frames;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTests;

public class FrameTests extends BaseTests{
	
//	@Test
//	public void testWyswiyg()
//	{
//	var wYSIWYGEditorPage = homePage.clickWYSIWYGEditor();
//	wYSIWYGEditorPage.clearTextArea();
//	wYSIWYGEditorPage.setTextArea("Hello");
//	wYSIWYGEditorPage.increaseIndention();
//	wYSIWYGEditorPage.setTextArea(" World");
//	assertEquals(wYSIWYGEditorPage.getTextFromEditor(), "Hello World", "Incorrect text!");
//	}
	
	@Test
	public void testNestedFrames()
	{
	var FramesPage = homePage.clickFrames();
	var nestedFramesPage = FramesPage.clickNestedFrames();
	assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text is incorrect!");
	assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","Bottom frame text is incorrect!");
	}

}
