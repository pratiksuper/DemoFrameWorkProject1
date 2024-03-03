package com.oodo.ap.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oodo.ap.PageLayer.AccountDetailedPage;
import com.oodo.ap.PageLayer.AccountPage;
import com.oodo.ap.PageLayer.HomePage;
import com.oodo.ap.PageLayer.LoginPage1;
import com.oodo.ap.testBase.TestBase;

public class AdressTest extends TestBase  {
	@Test
	public void addAdress() throws InterruptedException
	{
		
		LoginPage1 LoginPage_obj = new LoginPage1(driver);
		HomePage HomePage_obj = new HomePage(driver);
		
		HomePage_obj.ClickOnSingInLink();
		LoginPage_obj.Enter_email("pawan5@gmail.com");
		LoginPage_obj.Enter_pass("12345");
		LoginPage_obj.click_on_login_button();
		
		
		
		//-------adress enter----------
		
		AccountPage AccountPage_obj = new AccountPage(driver);
		AccountDetailedPage	AccountDetailedPage_obj = new AccountDetailedPage(driver);
		
		AccountPage_obj.click_on_adress_link();
		
		AccountDetailedPage_obj.FIllAllAdressDetails("rahul", "rahul@gmail.com", "company6", "CC##;", "54654654", "sangli road", "sangli", "415311","India");
		AccountDetailedPage_obj.click_on_save_btn();
		
		Assert.assertEquals(AccountPage_obj.getTextFromPage(), "company6");
	}

}
