package com.oodo.ap.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {

	public cartPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------- obj ---------------
	
	@FindBy(xpath = "//a[@class='js_add_cart_json d-inline-block float_left btn btn-link border-start-0']")
	private WebElement pluse_btn ;
	
	@FindBy(xpath = "//button[@class='btn btn-primary mt-2 w-100']")
	private WebElement pay_with_demo_btn ;
	
	@FindBy(xpath = "//button[@class='btn btn-primary w-100 w-md-auto ms-auto px-5']")
	private WebElement pay_btn ;
	
	@FindBy(xpath = "//a[@class=' btn btn-primary  w-100']")
	private WebElement check_out_btn ;
	
	
	
	//--------- Action Method ------------
	
	public void  clickOn_pluse_btn()
	{
		pluse_btn.click();
	}
	
	public void  clickOn_pay_with_demo_btn()
	{
		pay_with_demo_btn.click();
	}
	
	public void  clickOn_pay_btn()
	{
		pay_btn.click();
	}
	
	public void  clickOn_check_out_btn()
	{
		check_out_btn.click();	}
	
	
	
	
	
}
