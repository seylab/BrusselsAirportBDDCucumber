Feature: Departures & Arrivals Tab search Functionality


    @search
    Scenario:TC: 20 Search for departing flights
      Given The user opens the "url"
      When The user clicks on the Flights
      And  The user inputs "Istanbul" into the searchbox
      And The user clicks on the search button
      And The user should see "Istanbul" on the list

    @search
    Scenario:TC: 30 Search for arriving flights
      Given The user opens the "url"
      When The user clicks on the Flights
      And The user clicks on the Arrivals
      And  The user inputs "Istanbul" into the searchbox
      And The user clicks on the search button
      And The user should see "Istanbul" on the list