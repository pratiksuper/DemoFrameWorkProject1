package com.oodo.ap.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oodo.ap.PageLayer.HomePage;
import com.oodo.ap.PageLayer.LoginPage1;
import com.oodo.ap.testBase.TestBase;

public class UserLoginTest extends TestBase {

	
	@Test
	public void login_suceesfully_using_valid_credentials()
	{
		String Expected_results = "https://ap-automation.odoo.com/my";
		
		
		LoginPage1 LoginPage_obj = new LoginPage1(driver);
		HomePage HomePage_obj = new HomePage(driver);
		
		HomePage_obj.ClickOnSingInLink();
		LoginPage_obj.Enter_email("pawan5@gmail.com");
		LoginPage_obj.Enter_pass("12345");
		LoginPage_obj.click_on_login_button();
		
		String actual_result = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_result, Expected_results);
	}
	@Test
	public void login_suceesfully_using_invalid_credentials()
	{
		
		String epected_results = "Wrong login/password";
		
		LoginPage1 LoginPage_obj = new LoginPage1(driver);
		HomePage HomePage_obj = new HomePage(driver);
		
		HomePage_obj.ClickOnSingInLink();
		LoginPage_obj.Enter_email("pawan5@gmail.com");
		LoginPage_obj.Enter_pass("1234558");
		LoginPage_obj.click_on_login_button();
		
		String Actual_result = LoginPage_obj.get_error_msg();
		
		Assert.assertEquals(Actual_result, epected_results);
	}
	
	
	
	
}
