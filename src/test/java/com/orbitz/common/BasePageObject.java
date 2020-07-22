package com.orbitz.common;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePageObject extends PageObject {

    public void click(final WebElement webElement) {
        webElement.click();
    }

    public void selectByVisibleText(WebElementFacade webElement, String visibleText) {
        waitTillElementClickable(webElement, 2);
        webElement.selectByVisibleText(visibleText);
    }

    public boolean waitTillElementClickable(WebElement webElement, int timeoutInSeconds) {

        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSeconds);
            wait.until(ExpectedConditions.elementToBeClickable(webElement));

            return true;
        }
        catch (Exception e) {
            //ignore
        }

        return false;
    }

}
