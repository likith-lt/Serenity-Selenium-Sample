package com.lambdatest.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://stage-demo.lambdatest.com")
public class DemoSite extends PageObject {
    public void clickOn(WebElementFacade element) {
        element.click();
    }
}