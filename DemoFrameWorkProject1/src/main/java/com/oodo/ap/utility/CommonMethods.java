package com.oodo.ap.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.oodo.ap.testBase.TestBase;

public class CommonMethods extends TestBase {
	
	
	public CommonMethods()
	{
    
	}
	
	
	public static void captureScreeenShot( String filename )
	{
		
		  
		try {
			String path = "C:\\Users\\hp\\eclipse-workspace\\APautomation\\screenshot\\"; 
			
			  TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path + filename + ".png");
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void selectDropdown(WebElement element, String values)
	{
		Select s = new Select(element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		s.selectByVisibleText(values);
		
		
	}

}
