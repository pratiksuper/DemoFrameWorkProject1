package com.oodo.ap.testLayer;

import org.testng.annotations.Test;

import com.oodo.ap.PageLayer.HomePage;
import com.oodo.ap.testBase.TestBase;

public class NewClass1  extends TestBase{

	
	@Test
	public void singup ()
	{
	HomePage HomePage_obj = new HomePage(driver);
	HomePage_obj.ClickOnSingInLink();

	
	}
}
