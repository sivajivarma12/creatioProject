package com.creatio.framework.base;

import com.creatio.framework.reports.Reports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BasePage extends Reports {
    /** Singleton instance of the WebDriver. */
    private static WebDriver driver = null;

    /**
     * Launches the specified browser before each test method.
     * This method is invoked automatically by TestNG via the {@code @BeforeMethod} annotation.
     *
     * @param browserName the name of the browser to launch (chrome, firefox, edge)
     * @throws AssertionError if the specified browser is not supported
     */
    @BeforeMethod(alwaysRun = true)
    @Parameters({ "BROWSER" })
    public void setupBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            Assert.fail("Browser is not supported: " + browserName);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    /**
     * Quits the browser session after each test method.
     * This method is invoked automatically by TestNG via the {@code @AfterMethod} annotation.
     */
    @AfterMethod(alwaysRun = true)
    public void teardownBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Returns the current instance of WebDriver.
     *
     * @return the active {@link WebDriver} instance
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Sets the WebDriver instance.
     * This method can be used to override the driver instance if needed.
     *
     * @param driver the {@link WebDriver} instance to set
     */
    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }
}
