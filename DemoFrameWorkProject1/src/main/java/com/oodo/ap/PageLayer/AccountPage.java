package com.oodo.ap.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repo -----------
	
	@FindBy(xpath = "//a[@title='Addresses']")
	private WebElement adress_link ;
	
	
	@FindBy(xpath = "(//p[@class='mb-0 text-muted'])[1]")
	private WebElement company_text ;
	
	//-----------Action Method ------------
	
	public void click_on_adress_link()
	{
		adress_link.click();
	}
	
	public String getTextFromPage()
	{
		return company_text.getText();
	}
	
	
	
	
}
