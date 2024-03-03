package com.oodo.ap.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------obj repo --------------
	
	@FindBy(xpath = "(//a[text()='Sign in'])[1]")
	private WebElement Singin_Link ;
	
	@FindBy(xpath = "(//*[text()='Shop'])[1]")
	private WebElement Shop_link ;
	//-----------Action Method --------

	public void ClickOnSingInLink()
	{
		Singin_Link.click();
	}
	public void ClickOnshopLink()
	{
		Shop_link.click();
	}
	
	
}
