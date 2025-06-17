package com.creatio.framework.application.pages;

import com.creatio.framework.application.elements.HomePage;
import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class CookiesSteps extends HomePage {

    public CookiesSteps(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    /**
     * Verify the cookies banner.
     */
        public void verifyCookiesBanner() {
        waitForElement(cookieBanner);
        log("pass", "Cookies banner is displayed");
    }

    public void verifycookiebodyText() {
        String expectedText = "We may use cookies and similar technologies to collect information about the ways you interact with and use the website, to support and enhance features and functionality, to monitor performance, to personalize content and experiences, for marketing and analytics, and for other lawful purposes. We also may share information about your use of our site with our social media, advertising and analytics partners who may combine it with other information that you’ve provided to them or that they’ve collected from your use of their services. Please, see more details on the \"About\" tab ";
        waitForElement(cookiebodyText);
        String cookieBodyText = cookiebodyText.getText();
        log("pass", "Verify cookie body text");
        Assert.assertEquals(cookieBodyText,expectedText);

        }
    public void verifyNeccessaryCookiesText() {
        waitForElement(NeccessaryCookiesTextElement);

        log("pass", "Necessary Cookies text is displayed");
    }
    public void verifyNeccessaryOptionbutton() {
        //waitForElement(NeccessaryCookiesButtonElement);
        String neccesaryButtonstatus = NeccessaryCookiesButtonElement.getAttribute("disbaled");
        log("info","Neccessary button status"+ neccesaryButtonstatus);
    }
    public void verifyPrefrenceCookiesText() {
        waitForElement(PrefrenceCookiesTextElement);
        log("pass", "Prefrence Cookies text is displayed");
    }
    public void verifyPrefrencOptionbutton() {
        waitForElement(NeccessaryCookiesButtonElement);
        if(NeccessaryCookiesButtonElement.isEnabled())
         log("pass","Prefrence button status is enabled" );
        else
            log("fail","Prefrence button status is disabled" );
        }

}
