package com.orbitz.website.pages;

import com.orbitz.common.BasePageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static com.orbitz.common.Config.WEBSITE;

@DefaultUrl(WEBSITE)

public class FlightDetailsPage extends BasePageObject {

    @FindBy(id = "bookButton")
    public WebElementFacade bookButton;

    public void clickContinueBooking() {
        if (waitTillElementClickable(bookButton, 5)) {
            click(bookButton);
        }
    }
}
