package com.oodo.ap.utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerSetup implements ITestListener {

	

	@Override
	public void onTestFailure(ITestResult result)
	{
		CommonMethods.captureScreeenShot(result.getName());
		System.out.println(" execution is failled and captured Screenshot  : - " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println(" execution is skip" + result.getName());
	}

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("execution stated :- "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("execution finished succefully :- "+ result.getName());
	}
	

}
