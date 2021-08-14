package login;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

	@Test
	public void testSuccessfullogin() {
		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.setUserName("tomsmith");
		loginPage.setUserPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLogin();
		assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
				"Alert text is incorrect!");
	}
	
}
