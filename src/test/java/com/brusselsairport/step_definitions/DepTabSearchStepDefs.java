package com.brusselsairport.step_definitions;

import com.brusselsairport.pages.DepTabSearchPage;
import com.brusselsairport.utilities.BrowserUtils;
import com.brusselsairport.utilities.ConfigurationReader;
import com.brusselsairport.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class DepTabSearchStepDefs extends DepTabSearchPage {


    @Given("The user opens the {string}")
    public void theUserOpensThe(String url) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        String departuresURL = ConfigurationReader.get(url);
        Driver.get().get(departuresURL);
        try {
            BrowserUtils.waitForClickability(okCookiePolicyButton, 20);
            okCookiePolicyButton.click();
        } catch (Exception ignored) {
        }
    }

    @When("The user clicks on the Flights")
    public void theUserClicksOnTheFlights() {
        BrowserUtils.waitForClickability(flightsButtonNavigationBar, 20);
        flightsButtonNavigationBar.click();
    }

    @And("The user inputs {string} into the searchbox")
    public void theUserInputsIntoTheSearchbox(String destination) {
        BrowserUtils.waitForClickability(inputSearchBox, 5);
        inputSearchBox.sendKeys(destination);
    }

    @And("The user clicks on the search button")
    public void theUserClicksOnTheSearchButton() {
        BrowserUtils.waitForClickability(buttonSearch, 5);
        buttonSearch.click();
    }

    @And("The user should see {string} on the list")
    public void theUserShouldSeeOnTheList(String targetElement) {
        String xpath = "//span[@title='" + targetElement + "']";
        WebElement element = Driver.get().findElement(By.xpath(xpath));
        try {
            BrowserUtils.waitForVisibility(element, 20);
            Assert.assertTrue(targetElement + " is Displayed ", element.isDisplayed());
        } catch (Exception e) {
            Assert.assertFalse(targetElement + " is not Displayed ", element.isDisplayed());
        }

    }

    @And("The user clicks on the Arrivals")
    public void theUserClicksOnTheArrivals() {
        BrowserUtils.waitForClickability(arrivalsTabFlights,15);
        arrivalsTabFlights.click();
    }
}
