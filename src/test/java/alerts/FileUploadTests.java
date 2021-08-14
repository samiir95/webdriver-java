package alerts;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTests;

public class FileUploadTests extends BaseTests{

	@Test
	public void testFileUpload()
	{
	var fileUploadPage = homePage.clickFileUpload();
	fileUploadPage.uploadFile("E:\\Eclipse-Workplace\\webdriver_java\\uploads\\tenor.gif");
	assertEquals(fileUploadPage.getUploadedFiles(), "tenor.gif", "incorrect uploaded file!");
	}
}
