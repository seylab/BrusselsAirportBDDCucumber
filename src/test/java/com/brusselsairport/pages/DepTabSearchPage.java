package com.brusselsairport.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepTabSearchPage extends BasePage {
    @FindBy(xpath = "//div[@id='vue-flight-overview-table']//input[@name='search-query']")
    public WebElement inputSearchBox;

    @FindBy(css = ".c-search__button")
    public WebElement buttonSearch;

    @FindBy(xpath = "//span[@title='Istanbul']")
    public List<WebElement> listOfSearchResult;

    @FindBy(xpath = "(//ul[@class='o-ul-list c-tab-bar__list c-tab-bar__list--flight-overview']/li)[2]/a/img")
    public WebElement arrivalsTabFlights;




}
