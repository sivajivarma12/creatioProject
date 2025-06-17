package com.creatio.framework.listeners;

import com.creatio.framework.reports.Reports;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.creatio.framework.reports.Reports.startReporting;


public class TestListeners extends Reports implements ITestListener {

	public void onTestStart(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		startReporting(testName);	
		Reports.logger.info("Test Case Execution Started: " + testName);
	}

	
	public void onTestSuccess(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		Reports.logger.pass("Test Case Execution Passed: " + testName);
		stopReporting();
	}

	
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		Reports.logger.fail("Test Case Execution Failed: " + testName);
		Reports.logger.fail("Test Case Execution Failed due to Error: " + result.getThrowable().getLocalizedMessage());
		stopReporting();
	}

}
