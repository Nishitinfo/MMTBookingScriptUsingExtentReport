Feature: User checking the trip details on makeMyTrip

  Scenario: Verify user is redirected to makeMyTrip Home Page
    Given User is redirected to the makeMyTrip link
    And User is able access the search feature
    Then Verify User should be redirected to makeMyTrip Home page

  Scenario: Verify user selecting a trip with specific data
    When User is checking the round trip
    And User entering the trip data to search
    Then Verify User is able to book data with entered details


  Scenario: Verify user booking a trip with Traveller and Class
    When User is redirected to the makeMyTrip link
    And User entering the traveller and class data
    Then Verify User is able to book data with entered traveller and class details

  Scenario: Verify user booking a trip with updated Traveller and class
    When User is redirected to the makeMyTrip link
    And User entering the trip data to search
    Then Verify User is able to book data with entered details
    And User entering the traveller and class data
    Then Verify User is able to book data with entered traveller and class details
    And User updating the traveller and class data
    Then Verify User is able to book trip and redirected to review page
