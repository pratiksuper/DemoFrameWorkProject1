package com.oodo.ap.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oodo.ap.PageLayer.HomePage;
import com.oodo.ap.PageLayer.LoginPage1;
import com.oodo.ap.PageLayer.ShopPage;
import com.oodo.ap.PageLayer.cartPage;
import com.oodo.ap.testBase.TestBase;

public class ProductTestCase extends TestBase {

	@Test
	public void buyProduct() throws InterruptedException
	{
		
		String Expected_results = "https://ap-automation.odoo.com/shop/address?partner_id=141&mode=shipping";
		
		LoginPage1 LoginPage_obj = new LoginPage1(driver);
		HomePage HomePage_obj = new HomePage(driver);
		ShopPage ShopPage_obj = new ShopPage(driver); 
		cartPage cartPage_obj = new cartPage(driver);
		
		
		HomePage_obj.ClickOnSingInLink();
		LoginPage_obj.Enter_email("pawan5@gmail.com");
		LoginPage_obj.Enter_pass("12345");
		LoginPage_obj.click_on_login_button();
		
		//-----------------------------------
		
		
		HomePage_obj.ClickOnshopLink();
		ShopPage_obj.click_on_boat_headphone_link();
		Thread.sleep(200);
		ShopPage_obj.click_on_addto_cart_btn();
		ShopPage_obj.click_on_my_cart_link();
		cartPage_obj.clickOn_check_out_btn();
		
		String Actual_results = driver.getCurrentUrl();
		
		Assert.assertEquals(Actual_results, Expected_results);
	}
}
