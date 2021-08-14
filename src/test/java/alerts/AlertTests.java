package alerts;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTests;

public class AlertTests extends BaseTests{
	
	@Test
	public void testAcceptAlert()
	{
	var alertPage = homePage.clickJavaScriptAlerts();
	alertPage.triggerAlert();
	alertPage.alert_ClickToAccept();
	assertEquals(alertPage.getResult(),"You successfuly clicked an alert","Results text is incorrect!");
	}
	
	@Test
	public void testGetTextFromAlert()
	{
	var alertPage = homePage.clickJavaScriptAlerts();
	alertPage.triggerConfirm();
	String text = alertPage.alert_GetText();
	alertPage.alert_ClickToDismiss();
	assertEquals(text,"I am a JS Confirm","Text is incorrect!");
	}

	@Test
	public void testSetInputInAlert()
	{
	var alertPage = homePage.clickJavaScriptAlerts();
	alertPage.triggerPrompt();
	String text = "TAU rocks!";
	alertPage.alert_SetInput(text);;
	alertPage.alert_ClickToAccept();
	assertEquals(alertPage.getResult(),"You entered: " + text,"Result is incorrect!");
	}

}
