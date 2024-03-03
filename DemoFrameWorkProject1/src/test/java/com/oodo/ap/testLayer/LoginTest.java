package com.oodo.ap.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oodo.ap.PageLayer.HomePage;
import com.oodo.ap.testBase.TestBase;

public class LoginTest extends TestBase {


	@Test
	public void valid_inpute()
	{
		String expected_results = "https://ap-automation.odoo.com/web/login";
		
		HomePage HomePage_obj = new HomePage(driver);
		HomePage_obj.ClickOnSingInLink();
		
		String Actual_results = driver.getCurrentUrl();
		Assert.assertEquals(Actual_results, expected_results);
	}
}
