package cookie;


import static org.testng.Assert.*;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import base.BaseTests;

public class CookieTests extends BaseTests{

	@Test
	public void testDeletedCookie()
	{
        var cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets_1", "%7B%TD"); 
        cookieManager.addCookie(cookie);
//        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
        
        
        
	}
}
