package com.oodo.ap.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.oodo.ap.utility.CommonMethods;

public class AccountDetailedPage {

	
	public AccountDetailedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//----------obj repo ------------
	
//	@FindBy(xpath = "(/div[@class='o_portal_index_card col-md-6 order-2'])[4]")
//	private WebElement adress_link ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[1]")
	private WebElement name_txt_box ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[2]")
	private WebElement email_txt_box ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[3]")
	private WebElement company_name_txt_box ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[4]")
	private WebElement GST_no_txt_box ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[5]")
	private WebElement phone_txt_box ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[6]")
	private WebElement street_txt_box ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[7]")
	private WebElement city_txt_box ;
	
	@FindBy(xpath = "(//input[@class='form-control '])[8]")
	private WebElement zip_code_txt_box ;
	
	@FindBy(xpath = "//select[@name= 'country_id']")
	private WebElement country_dropdown ;
	
	@FindBy(xpath = "(//button[@type= 'submit'])[3]")
	private WebElement save_btn ;
	
	//-------------Action method -------------
	
	public void FIllAllAdressDetails(String name,String email,String company_name,String gst_num,String phone_num,String street,String city,String zip_code,String country)
	{
		name_txt_box.clear();
		name_txt_box.sendKeys(name);
		
		email_txt_box.clear();
		email_txt_box.sendKeys(email);
		
		company_name_txt_box.clear();
		company_name_txt_box.sendKeys(company_name);
		
		GST_no_txt_box.clear();
		GST_no_txt_box.sendKeys(gst_num);
		
		phone_txt_box.clear();
		phone_txt_box.sendKeys(phone_num);
		
		street_txt_box.clear();
		street_txt_box.sendKeys(street);
		
		city_txt_box.clear();
		city_txt_box.sendKeys(city);
		
		zip_code_txt_box.clear();
		zip_code_txt_box.sendKeys(zip_code);
		
		CommonMethods.selectDropdown(country_dropdown,country);
		
	}
	
	public void click_on_save_btn()
	{
		save_btn.click();
	}
	
	
	
}
