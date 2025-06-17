package com.creatio.framework.application.elements;

import com.creatio.framework.webcommons.WebCommons;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebCommons {
    // Home page elements

  @FindBy( xpath = "//div[@id='CybotCookiebotDialog']//div[text()='This website uses cookies']")
    protected WebElement cookieBanner;

  @FindBy(xpath = "//div[@id='CybotCookiebotDialog']//div[@id='CybotCookiebotDialogBodyContentText']//span")
    protected WebElement cookiebodyText;

  @FindBy(xpath = "//label[@class='CybotCookiebotDialogBodyLevelButtonLabel']//strong[text()='Necessary ']")
    protected WebElement NeccessaryCookiesTextElement;

  @FindBy(xpath = "//div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//strong[text()='Necessary ']/ancestor::div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//input[@type='checkbox']")
  protected WebElement NeccessaryCookiesButtonElement;

    @FindBy(xpath = "//label[@class='CybotCookiebotDialogBodyLevelButtonLabel']//strong[text()='Preferences ']")
    protected WebElement PrefrenceCookiesTextElement;

    @FindBy(xpath = "//div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//strong[text()='Preferences ']/ancestor::div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//input[@type='checkbox']")
    protected WebElement PrefrenceCookiesButtonElement;

    @FindBy(xpath = "//label[@class='CybotCookiebotDialogBodyLevelButtonLabel']//strong[text()='Marketing ']")
    protected WebElement MarketCookiesTextElement;

    @FindBy(xpath = "//div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//strong[text()='Marketing ']/ancestor::div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//input[@type='checkbox']")
    protected WebElement MarketingCookiesButtonElement;

    @FindBy(xpath = "//label[@class='CybotCookiebotDialogBodyLevelButtonLabel']//strong[text()='Statistics ']")
    protected WebElement StaticsCookiesTextElement;

    @FindBy(xpath = "//div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//strong[text()='Statistics ']/ancestor::div[@class='CybotCookiebotDialogBodyLevelButtonWrapper']//input[@type='checkbox']")
    protected WebElement StaticsCookiesButtonElement;

    @FindBy(xpath = "//button[text()='Deny']")
    protected WebElement denyButton;

    @FindBy(xpath = "//button[text()='Allow all']")
    protected WebElement allowAllButton;

    @FindBy(xpath = "//button[text()='Allow selection']")
    protected WebElement allowSelectionButton;
}
