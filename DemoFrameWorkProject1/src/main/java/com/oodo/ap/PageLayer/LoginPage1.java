package com.oodo.ap.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	
	public LoginPage1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//----------obj repo ------------
	
	
	
	@FindBy(xpath = "//input[@id = 'login']")
	private WebElement email_text_box ;
	
	@FindBy(xpath = "//input[@id = 'password']")
	private WebElement pass_text_box ;
	
	@FindBy(xpath = "//button[@class= 'btn btn-primary']")
	private WebElement login_button ;
	
	// login using wrong pass test case
	
	@FindBy(xpath = "//p[@class='alert alert-danger']")
	private WebElement error_msg ;
	
	
	// new acc resitration 

	@FindBy(xpath = "/html/body/div/main/div/form/div[3]/div[1]/a[1]")
	private WebElement dont_have_acc_Link ;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement your_email_texbox ;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement your_name_text_box;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_text_box ;
	
	@FindBy(xpath = "//input[@id='confirm_password']")
	private WebElement conferm_password_text_box ;
	
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	private WebElement Singup_Link ;
	// --------------action Methods -------
	

	public void Enter_email(String email)
	{
		email_text_box.sendKeys(email);;
	}
	
	public void Enter_pass(String pass)
	{
		pass_text_box.sendKeys(pass);
	}
	
	public void click_on_login_button()
	{
		login_button.click();
	}
	
	// login using wrong pass
	
	public String get_error_msg()
	{
		 return error_msg.getText();
	}
	
	// new acc resitration 
	
	public void ClickOn_dont_have_acc_Link()
	{
		
		dont_have_acc_Link.click();
	}
	public void ClickOn_your_email_texbox(String email)
	{
		
		your_email_texbox.sendKeys(email);
	}
	public void ClickOn_your_name_text_box(String name)
	{
		
		your_name_text_box.sendKeys(name);;
	}
	public void ClickOn_password_text_box(String password)
	{
		
		password_text_box.sendKeys(password);
	}
	public void ClickOn_conferm_password_text_box(String confirm_pass)
	{
		
		conferm_password_text_box.sendKeys(confirm_pass);
	}
	public void ClickOn_Singup_Link()
	{
		
		Singup_Link.click();
	}
	
	
	
	
	
	
}
