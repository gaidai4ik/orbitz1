Feature: Search
  Category page loads and displays related items

  @flightSearch
  Scenario Outline: Verify orbitz multicity transaction
    Given I am on the Orbitz website
    And I select flight tab
    And I select multicity option
    And I select 2 adults
    And I select 2 children
    And I specify children ages
    And I select flight1 from JFK to MIA
    And I select flight1 departure date
    And I select flight2 from MIA to SJO
    And I select flight2 departure date
    And I select add another flight
    And I select flight3 from SJO to JFK
    And I select flight3 departure date
    And I click search button
    Then I calculate a number of results
    Then I calculate a lowest price
    Then I select best flight 1
    Then I calculate a number of results for flight 2
    Then I calculate a lowest price for flight 2
    Then I select best flight 2
    Then I calculate a number of results for flight 3
    Then I calculate a lowest price for flight 3
    Then I select best flight 3
    Then I click continue booking button
	Then I should see correct results

    Examples: 
      | flight1  | city1Start | city1End |
      | 1 		 | 			  |          |
