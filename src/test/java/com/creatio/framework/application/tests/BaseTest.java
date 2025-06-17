package com.creatio.framework.application.tests;


import com.creatio.framework.application.pages.CookiesSteps;
import com.creatio.framework.base.BasePage;
import com.creatio.framework.utilities.ExcelUtils;
import com.creatio.framework.utilities.PropUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.Properties;


public class BaseTest extends BasePage {
	
	public Properties prop = PropUtil.readData("Config.properties");

	public CookiesSteps cookiesteps;


	@BeforeMethod(alwaysRun = true,dependsOnMethods = "setupBrowser")
	public void initializePages() {
		WebDriver driver = BasePage.getDriver();
		cookiesteps = new CookiesSteps(driver);
	}	
		
	@DataProvider(name = "data")
	public String[][] testData(Method method) {
		String[][] data = ExcelUtils.readExcelData("TestData.xlsx", method.getName());
		return data;
	}

}
