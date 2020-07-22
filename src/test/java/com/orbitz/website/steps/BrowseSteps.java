package com.orbitz.website.steps;

import com.orbitz.website.pages.FlightCheckoutPage;
import com.orbitz.website.pages.FlightDetailsPage;
import com.orbitz.website.pages.HomePage;
import com.orbitz.website.pages.ResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BrowseSteps {
			
	HomePage homePage;
	ResultsPage resultsPage;
	FlightDetailsPage flightDetailsPage;
	FlightCheckoutPage flightCheckoutPage;

	@Given("I am on the Orbitz website")
	public void givenIAmOnTheOrbitzWebsite() {
		homePage.openHomePage();
	}

	@And("I select flight tab")
	public void andIselectFlightTab() {
		homePage.clickFlightTab();
	}

	@And("I select multicity option")
	public void andIselectMultiCityOption() {
		homePage.selectMultiCityOption();
	}
	@And("I select 2 adults")
	public void andIselectTwoAdults() {
		homePage.selectTwoAdults();
	}
	@And("I select 2 children")
	public void andIselectTwoChildren() {
		homePage.selectTwoChildren();
	}

	@And("I specify children ages")
	public void andIspecifyChildrenAges() {
		homePage.specifyChildrenAges();
	}

	@And("I select flight1 from JFK to MIA")
	public void andIselectFlight1() {
		homePage.selectFlight1();
	}

	@And("I select flight1 departure date")
	public void selectFlight1Departure() {
		homePage.selectFlight1Departure();
	}

	@And("I select flight2 from MIA to SJO")
	public void andIselectFlight2() {
		homePage.selectFlight2();
	}

	@And("I select flight2 departure date")
	public void selectFlight2Departure() {
		homePage.selectFlight2Departure();
	}

	@And("I select add another flight")
	public void cickAddAnotherFlight() {
		homePage.cickAddAnotherFlight();
	}

	@And("I select flight3 from SJO to JFK")
	public void andIselectFlight3() {
		homePage.selectFlight3();
	}

	@And("I select flight3 departure date")
	public void selectFlight3Departure() {
		homePage.selectFlight3Departure();
	}

	@And("I click search button")
	public void clickSearch() {
		homePage.clickSearch();
	}

	@Then("I calculate a number of results")
	public void displayNumberOfResutls() {
		resultsPage.findNumberOfFlights();
	}

	@Then("I calculate a lowest price")
	public void findLowestPriceWithLeastStops() {
		resultsPage.findLowestPriceWithLeastStops();
	}

	@Then("I select best flight 1")
	public void selectFlight1() {
		resultsPage.selectFlight();
	}

	@Then("I calculate a number of results for flight 2")
	public void displayNumberOfResutls2() {
		resultsPage.findNumberOfFlights();
	}

	@Then("I calculate a lowest price for flight 2")
	public void findLowestPriceWithLeastStops2() {
		resultsPage.findLowestPriceWithLeastStops();
	}

	@Then("I select best flight 2")
	public void selectFlight2() {
		resultsPage.selectFlight();
	}

	@Then("I calculate a number of results for flight 3")
	public void displayNumberOfResutls3() {
		resultsPage.findNumberOfFlights();
	}

	@Then("I calculate a lowest price for flight 3")
	public void findLowestPriceWithLeastStops3() {
		resultsPage.findLowestPriceWithLeastStops();
	}

	@Then("I select best flight 3")
	public void selectFlight3() {
		resultsPage.selectFlight();
	}

	@Then("I click continue booking button")
	public void clickContinueBooking() {
		flightDetailsPage.clickContinueBooking();
	}

	@Then("I should see correct results")
	public void checkResults() {
		flightCheckoutPage.validateResults();
	}

}
