package com.oodo.ap.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static WebDriver driver ;
	
	@BeforeMethod    
	public void setup()
	{
		String browser_name = "chrome";
		
		if (browser_name.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser_name.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browser_name.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("please choose correct browser");
		}
		
	    driver.manage().window().maximize();
	    driver.get("https://ap-automation.odoo.com/");
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		
	}
	@AfterMethod
	public void tearDown() {
		

		driver.quit();
	}
	
	
}
