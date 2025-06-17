package com.creatio.framework.application.tests;

import org.openqa.selenium.internal.Debug;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationTest extends BaseTest{

    @Test(priority = 1)
    public void verifyCookieBannerTest() {
        cookiesteps.launchApplication();
        cookiesteps.verifyCookiesBanner();
    }
    @Test
    public void verifyCookieBodyTextTest() {
        cookiesteps.launchApplication();
        cookiesteps.verifycookiebodyText();

    }

}
