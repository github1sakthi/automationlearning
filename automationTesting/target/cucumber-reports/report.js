$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrbitzFlightSearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Devisakthi Krishnakumar@cognizant.com"
    }
  ],
  "line": 2,
  "name": "Test complex search input",
  "description": "",
  "id": "test-complex-search-input",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User searches for ticket in orbitz",
  "description": "",
  "id": "test-complex-search-input;user-searches-for-ticket-in-orbitz",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@OrbitzFlightSearchTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open browser and loaded orbitz portal",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on flight tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enters flying from and flying to airport codes",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enters departing and returning dates",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Clicks advanced option link and choses nonStop checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Selects Emirates as the prefered airline",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "clicks on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Should load results page with available flights",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.open_browser_and_loaded_orbitz_portal()"
});
formatter.result({
  "duration": 11946463128,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_clicks_on_flight_tab()"
});
formatter.result({
  "duration": 1213434627,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.enters_flying_from_and_flying_to_airport_codes()"
});
formatter.result({
  "duration": 3426396190,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.enters_departing_and_returning_dates()"
});
formatter.result({
  "duration": 1883400141,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.clicks_advanced_option_link_and_choses_nonStop_checkbox()"
});
formatter.result({
  "duration": 1047477089,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.selects_Emirates_as_the_prefered_airline()"
});
formatter.result({
  "duration": 1258096661,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.clicks_on_Search_button()"
});
formatter.result({
  "duration": 13806701825,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.should_load_results_page_with_available_flights()"
});
formatter.result({
  "duration": 68823724,
  "status": "passed"
});
});