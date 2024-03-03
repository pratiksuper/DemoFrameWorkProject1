package com.oodo.ap.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {

	
	public ShopPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------obj repo ---------------
	
	@FindBy(xpath = "//a[contains(text(),'boAt Airdopes Atom 81 TWS Earbuds')]")
	private WebElement boat_headphone_link ;
	

	@FindBy(xpath = "//a[@id='add_to_cart']")
	private WebElement addto_cart_btn ;
	
	@FindBy(xpath = "//span[contains(text(),'My Cart')]")
	private WebElement my_cart_link ;
	
	//---------- action Method ------------
	
	public void click_on_boat_headphone_link()
	{
		boat_headphone_link.click();
	}
	
	public void click_on_addto_cart_btn()
	{
		addto_cart_btn.click();
	}
	
	public void click_on_my_cart_link()
	{
		my_cart_link.click();
	}
	
	
	
	
}
