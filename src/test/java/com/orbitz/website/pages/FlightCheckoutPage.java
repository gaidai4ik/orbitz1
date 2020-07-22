package com.orbitz.website.pages;

import com.orbitz.common.BasePageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import java.util.List;
import static com.orbitz.common.Config.WEBSITE;


@DefaultUrl(WEBSITE)

public class FlightCheckoutPage extends BasePageObject {

    @FindBy(id = "summary-container")
    public WebElementFacade summaryContainer;

    public void validateResults() {
        if (waitTillElementClickable(summaryContainer, 5)) {
            List<WebElementFacade> elements = summaryContainer.thenFindAll("//article/div[1]/div[2]");
            int count = 0;
            for(WebElementFacade w : elements){
                if (w.containsText("San Jose (SJO) to New York (JFK)") || w.containsText("Miami (MIA) to San Jose (SJO)") || w.containsText("New York (JFK) to Miami (MIA)"))
                    count++;
            }
            assert (count==3);
        }
    }
}
