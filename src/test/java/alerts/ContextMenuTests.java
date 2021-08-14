package alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;

public class ContextMenuTests extends BaseTests{
	
	@Test
	public void testContextMenu() throws InterruptedException
	{
		var contextManuePage = homePage.clickContextMenu();
		contextManuePage.rightClickBox();
		String message = contextManuePage.getPopUpText();
		//Thread.sleep(3000);
		contextManuePage.acceptPopUp();
		assertEquals(message,"You selected a context menu", "Incorrect alert text!");
	}

}
