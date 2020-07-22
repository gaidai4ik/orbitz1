package com.orbitz.website.pages;

import com.orbitz.common.BasePageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import java.util.ArrayList;
import java.util.List;

import static com.orbitz.common.Config.WEBSITE;


@DefaultUrl(WEBSITE)

public class ResultsPage extends BasePageObject {

    @FindBy(id = "flightModuleList")
    public WebElementFacade listContainer;

    public List<WebElementFacade> flightSearchResults = new ArrayList<>();

    public void findNumberOfFlights() {
        System.out.println("looking for results flights");
        waitTillElementClickable(listContainer, 7);
        List<WebElementFacade> elements = listContainer.thenFindAll("ul li");
        for(WebElementFacade w : elements){
            if (w.containsText("No change fees"))
                flightSearchResults.add(w);
        }
        System.out.println("available flights number: " + flightSearchResults.size());
    }

    public void findLowestPriceWithLeastStops() {
        String lowestPrice = flightSearchResults.get(0).findBy("//div[1]/div[2]/div[2]/div/div[1]/div[1]/span").getText();
        String stops = flightSearchResults.get(0).findBy("//div[1]/div[2]/div[1]/div/div/div/div[2]/div[1]/span[2]").getText();
        System.out.println("lowest price = " + lowestPrice);
        System.out.println("number of stops: " + stops);
    }

    public void selectFlight() {
        System.out.println("select best flight");
        WebElementFacade select = flightSearchResults.get(0).findBy("//div[1]/div[2]/div[2]/div/div[2]/button");
        flightSearchResults.clear();
        select.click();
    }

}
