package com.brusselsairport.pages;

import com.brusselsairport.utilities.BrowserUtils;
import com.brusselsairport.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class  BasePage {


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement okCookiePolicyButton;

    @FindBy(xpath = "(//a[@id='dropdownId'])[1]")
    public WebElement flightsButtonNavigationBar;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }




}
