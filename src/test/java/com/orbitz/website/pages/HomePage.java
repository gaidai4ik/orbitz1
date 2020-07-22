/**
 * @author Andrei
 *
 */
package com.orbitz.website.pages;

import com.orbitz.common.BasePageObject;
import com.orbitz.common.Config;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static com.orbitz.common.Config.WEBSITE;


@DefaultUrl(WEBSITE)

public class HomePage extends BasePageObject {

	
	@FindBy(id = "tab-flight-tab-hp")
	public WebElementFacade flightTab;

	@FindBy(id = "flight-type-multi-dest-label-hp-flight")
	public WebElementFacade flightTypeMultiCity;

	@FindBy(id = "flight-adults-hp-flight")
	public WebElementFacade flightAdults;

	@FindBy(id = "flight-children-hp-flight")
	public WebElementFacade flightChildren;

	@FindBy(id = "flight-age-select-1-hp-flight")
	public WebElementFacade child1Age;

	@FindBy(id = "flight-age-select-2-hp-flight")
	public WebElementFacade child2Age;

	@FindBy(id = "flight-origin-hp-flight")
	public WebElementFacade flight1Origin;

	@FindBy(id = "flight-destination-hp-flight")
	public WebElementFacade flight1Dest;

	@FindBy(id = "flight-departing-single-hp-flight")
	public WebElementFacade flight1Departure;

	@FindBy(id = "flight-2-origin-hp-flight")
	public WebElementFacade flight2Origin;

	@FindBy(id = "flight-2-destination-hp-flight")
	public WebElementFacade flight2Dest;

	@FindBy(id = "flight-2-departing-hp-flight")
	public WebElementFacade flight2Departure;

	@FindBy(id = "flight-3-origin-hp-flight")
	public WebElementFacade flight3Origin;

	@FindBy(id = "flight-3-destination-hp-flight")
	public WebElementFacade flight3Dest;

	@FindBy(id = "flight-3-departing-hp-flight")
	public WebElementFacade flight3Departure;

	@FindBy(id = "add-flight-leg-hp-flight")
	public WebElementFacade addAnotherFlight;

	@FindBy(xpath = "/html/body/meso-native-marquee/section/div/div/div[1]/div[2]/div/div[1]/div/section[1]/form/div[8]/label/button")
	public WebElementFacade searchButton;

	public void openHomePage() {
		getDriver().get(Config.WEBSITE);
	}

	public void clickFlightTab() {
		System.out.println("click flight tab");
		if (waitTillElementClickable(flightTab, 3)) {
			click(flightTab);
		}
	}

	public void selectMultiCityOption() {
		System.out.println("select Multi-City Option");
		if (waitTillElementClickable(flightTypeMultiCity, 3)) {
			click(flightTypeMultiCity);
		}
	}

	public void selectTwoAdults() {
		System.out.println("select 2 adults");
		selectByVisibleText(flightAdults, "2");
	}

	public void selectTwoChildren() {
		System.out.println("select 2 children");
		selectByVisibleText(flightChildren, "2");
	}

	public void specifyChildrenAges() {
		System.out.println("specify children ages");
		selectByVisibleText(child1Age, "7");
		selectByVisibleText(child2Age, "3");
	}

	public void selectFlight1() {
		System.out.println("select flight 1");
		flight1Origin.type("JFK");
		flight1Dest.type("MIA");
	}

	public void selectFlight1Departure() {
		System.out.println("select flight 1 departure");
		flight1Departure.type("08/04/2020");
	}

	public void selectFlight2() {
		System.out.println("select flight 2");
		flight2Origin.type("MIA");
		flight2Dest.typeAndEnter("SJO");
	}

	public void selectFlight2Departure() {
		System.out.println("select flight 2 departure");
		flight2Departure.type("08/09/2020");
	}

	public void cickAddAnotherFlight() {
		System.out.println("click flight tab");
		click(addAnotherFlight);
	}

	public void selectFlight3() {
		System.out.println("select flight 3");
		flight3Origin.type("SJO");
		flight3Dest.typeAndEnter("JFK");
	}

	public void selectFlight3Departure() {
		System.out.println("select flight 3 departure");
		flight3Departure.type("08/19/2020");
	}

	public void clickSearch() {
		System.out.println("click Search button");
		searchButton.click();
	}

}
