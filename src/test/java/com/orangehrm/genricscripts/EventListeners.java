package com.orangehrm.genricscripts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.utilities.CaptureDefects;

public class EventListeners implements ITestListener
{
	ExtentSparkReporter reporter;
	ExtentReports reports;
	
	public void onStart(ITestContext context)
	{
		reporter = new ExtentSparkReporter("./src/test/resources/ExtentReports/Report1.html");
		reporter.config().setDocumentTitle("OrangeHrMSuite1");
		reporter.config().setReportName("RegressionSuite");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		System.out.println("The suite named "+context.getName()+" execution is started");
	}
	public void onFinish(ITestContext context)
	{
		reports.flush();
		System.out.println("The suite named "+context.getName()+" execution is completed");
	}
	public void onTestStart(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.INFO,result.getName()+" execution is started");
		System.out.println("The test named "+result.getName()+" execution is started");
	}
	public void onTestSuccess(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.PASS,result.getName()+" execution is success");
		System.out.println("The test named "+result.getName()+" execution is success");
	}
	public void onTestFailure(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.FAIL,result.getName()+" execution is failed");
		System.out.println("The test named "+result.getName()+" execution is failed");
		
	try
	{
		CaptureDefects.getDefect(result.getName());
	}
	catch (Exception e)
	{
		//TODO: handle exception
	}
	}
	public void onTestSkipped(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.SKIP,result.getName()+" execution is skipped");
		System.out.println("The test named "+result.getName()+" execution is skipped");
	}

}
