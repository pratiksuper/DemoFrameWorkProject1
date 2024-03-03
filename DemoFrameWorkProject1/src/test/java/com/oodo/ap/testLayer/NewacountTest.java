package com.oodo.ap.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oodo.ap.PageLayer.HomePage;
import com.oodo.ap.PageLayer.LoginPage1;
import com.oodo.ap.testBase.TestBase;

public class NewacountTest extends  TestBase{

	@Test
	public void singup_succefully_using_valid_pass  ()
	{
	String expected_results = "https://ap-automation.odoo.com/my";
	
		HomePage HomePage_obj = new HomePage(driver);
		LoginPage1 LoginPage1_obj = new LoginPage1(driver);
		
		HomePage_obj.ClickOnSingInLink();
		LoginPage1_obj.ClickOn_dont_have_acc_Link();
		LoginPage1_obj.ClickOn_your_email_texbox("pawan6@gmail.com");
		LoginPage1_obj.ClickOn_your_name_text_box("pawan5");
		LoginPage1_obj.ClickOn_password_text_box("12345");
		LoginPage1_obj.ClickOn_conferm_password_text_box("12345");
		LoginPage1_obj.ClickOn_Singup_Link();
		
		String actial_results = driver.getCurrentUrl();
		Assert.assertEquals(actial_results, expected_results);
		
	}
	
	@Test
	public void singup_using_invalid_pass  ()
	{
	String expected_results = "Another user is already registered using this email address.";
	
		HomePage HomePage_obj = new HomePage(driver);
		LoginPage1 LoginPage1_obj = new LoginPage1(driver);
		
		HomePage_obj.ClickOnSingInLink();
		LoginPage1_obj.ClickOn_dont_have_acc_Link();
		LoginPage1_obj.ClickOn_your_email_texbox("pawan6@gmail.com");
		LoginPage1_obj.ClickOn_your_name_text_box("pawan5");
		LoginPage1_obj.ClickOn_password_text_box("12345");
		LoginPage1_obj.ClickOn_conferm_password_text_box("12345");
		LoginPage1_obj.ClickOn_Singup_Link();
		
		String actial_results = LoginPage1_obj.get_error_msg();
		Assert.assertEquals(actial_results, expected_results);
		
	}
	

	
}
