package javascript;

import static org.testng.Assert.*;

import java.util.List;

import org.testng.annotations.Test;

import base.BaseTests;

public class JavaScriptTests extends BaseTests{
	
//	@Test
//	public void testScrollToTable()
//	{
//		homePage.clickLargeAndDeepDom().scrollToTable();
//	}
//	
//	@Test
//	public void scrollToFifthParagraph()
//	{
//		homePage.clickInfinteScroll().scrollToParagraph(5);
//	}
	
	@Test
	public void testAddMultipleAttributeToDropdown()
	{
	var dropDownPage = homePage.clickDropDown();
	dropDownPage.addMultipeAttribute();
	
	var optionsToSelect = List.of("Option 1", "Option 2");
	optionsToSelect.forEach(dropDownPage::selectFromDropDown);
	
	var selectedOptions = dropDownPage.getSelectedOptions();
	assertTrue(selectedOptions.containsAll(optionsToSelect), "All options aren't selected");
	assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
	}

}
