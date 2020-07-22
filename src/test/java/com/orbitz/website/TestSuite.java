package com.orbitz.website;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
		monochrome = false
		,glue = {"com.orbitz"}
		,features="src/test/resources/features/Orbitz/regression/search/SearchFlightMultiple.feature"

		)

public class TestSuite {}