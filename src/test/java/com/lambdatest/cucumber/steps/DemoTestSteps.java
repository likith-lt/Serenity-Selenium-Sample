package com.lambdatest.cucumber.steps;

import com.lambdatest.cucumber.pages.DemoSite;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DemoTestSteps extends PageObject{
    DemoSite site;
    
    @When("^I open the demo site$")
    public void search_google_for() throws Throwable {
        site.open();
    }
    
    @FindBy(id = "headlessui-listbox-button-1")
    WebElementFacade location;
    @FindBy(id = "Bali")
    WebElementFacade Bali;

    @Then("^Select the desired location$")
    public void select_location() throws Throwable {
        site.clickOn(location);
        site.clickOn(Bali);
        System.out.println("Location is selected as Bali.");
    }

    @FindBy(id = "headlessui-listbox-button-5")
    WebElementFacade Guests;
    @FindBy(id = "2")
    WebElementFacade number;

    @And("^Select the number of guests$")
    public void selectGuests() throws Throwable {
        site.clickOn(Guests);
        site.clickOn(number);
        System.out.println("Number of guests are selected.");
    }

    @FindBy(xpath = "//*[@id='search']")
    WebElementFacade search;

    @Then("^Search for the results$")
    public void search() throws Throwable {
        site.clickOn(search);
        Thread.sleep(3000);
    }

    @FindBy(id = "reserve-now")
    WebElementFacade select;

    @Then("^Select one of the hotels$")
    public void selectHotel() throws Throwable {
        site.clickOn(select);
        Thread.sleep(2000);
    }

    @FindBy(id = "proceed")
    WebElementFacade proceed;

    @And("^Proceed with booking$")
    public void confirmHotel() throws Throwable {
        site.clickOn(proceed);
        System.out.println("Booking is confirmed.");
        Thread.sleep(2000);
    }

    @FindBy(id = "invoice")
    WebElementFacade download;

    @Then("^Download the invoice$")
    public void downloadInvoice() throws Throwable {
        site.clickOn(download);
        System.out.println("Tests are run successfully!");
    }
}