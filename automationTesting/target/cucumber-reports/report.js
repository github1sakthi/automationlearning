$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GmailLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Simple test scenario User login",
  "description": "",
  "id": "simple-test-scenario-user-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User login with valid login credentials",
  "description": "",
  "id": "simple-test-scenario-user-login;user-login-with-valid-login-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@GmailLoginTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open browser and Gmail application is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters user id and clicks Next",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters password and clicks Next",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Should take user to landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailLogin.open_browser_and_Gmail_application_is_loaded()"
});
formatter.result({
  "duration": 13332160472,
  "status": "passed"
});
formatter.match({
  "location": "GmailLogin.user_enters_user_id_and_clicks_Next()"
});
formatter.result({
  "duration": 483388664,
  "status": "passed"
});
formatter.match({
  "location": "GmailLogin.user_enters_password_and_clicks_Next()"
});
formatter.result({
  "duration": 2750918135,
  "status": "passed"
});
formatter.match({
  "location": "GmailLogin.should_take_user_to_landing_page()"
});
formatter.result({
  "duration": 1486138870,
  "status": "passed"
});
formatter.uri("OrbitzFlightSearch.feature");
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
  "location": "OrbitzFlightSearch.open_browser_and_loaded_orbitz_portal()"
});
formatter.result({
  "duration": 15711529311,
  "status": "passed"
});
formatter.match({
  "location": "OrbitzFlightSearch.user_clicks_on_flight_tab()"
});
formatter.result({
  "duration": 448073130,
  "status": "passed"
});
formatter.match({
  "location": "OrbitzFlightSearch.enters_flying_from_and_flying_to_airport_codes()"
});
formatter.result({
  "duration": 3591746770,
  "status": "passed"
});
formatter.match({
  "location": "OrbitzFlightSearch.enters_departing_and_returning_dates()"
});
formatter.result({
  "duration": 2483804811,
  "status": "passed"
});
formatter.match({
  "location": "OrbitzFlightSearch.clicks_advanced_option_link_and_choses_nonStop_checkbox()"
});
formatter.result({
  "duration": 1026900698,
  "status": "passed"
});
formatter.match({
  "location": "OrbitzFlightSearch.selects_Emirates_as_the_prefered_airline()"
});
formatter.result({
  "duration": 852566579,
  "status": "passed"
});
formatter.match({
  "location": "OrbitzFlightSearch.clicks_on_Search_button()"
});
formatter.result({
  "duration": 10281081757,
  "status": "passed"
});
formatter.match({
  "location": "OrbitzFlightSearch.should_load_results_page_with_available_flights()"
});
formatter.result({
  "duration": 38128255,
  "status": "passed"
});
formatter.uri("QuestDiagnosisAppointmentBooking.feature");
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
  "line": 6,
  "name": "User books an appointment for Diagnosis test",
  "description": "",
  "id": "test-complex-search-input;user-books-an-appointment-for-diagnosis-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@QuestDiagnosisAppointmentBookingTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open browser and load quest diagnostics page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters location",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters reason for testing",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters date and time and clicks Continue",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Should reload the page with appointment details",
  "keyword": "Then "
});
formatter.match({
  "location": "QuestDiagnosisAppointmentBooking.open_browser_and_load_quest_diagnostics_page()"
});
formatter.result({
  "duration": 17537129877,
  "status": "passed"
});
formatter.match({
  "location": "QuestDiagnosisAppointmentBooking.user_enters_location()"
});
formatter.result({
  "duration": 583765342,
  "status": "passed"
});
formatter.match({
  "location": "QuestDiagnosisAppointmentBooking.user_enters_reason_for_testing()"
});
formatter.result({
  "duration": 1024165887,
  "status": "passed"
});
formatter.match({
  "location": "QuestDiagnosisAppointmentBooking.user_enters_date_and_time_and_clicks_Continue()"
});
formatter.result({
  "duration": 6408853657,
  "status": "passed"
});
formatter.match({
  "location": "QuestDiagnosisAppointmentBooking.should_reload_the_page_with_appointment_details()"
});
formatter.result({
  "duration": 2319124637,
  "status": "passed"
});
});