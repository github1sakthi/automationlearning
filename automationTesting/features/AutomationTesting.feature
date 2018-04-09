Feature: Test simple login to gmail
#Scenario: User login with valid login credentials
#Given Open browser and load gmail
#When User enters user id and clicks Next
#And User enters password and clicks Next
#Then Should take user to landing page
#
#Feature: Test simple login to gmail
#Scenario: User login with valid login credentials
#Given Open browser and load gmail for parameterized
#When User enters useridP "testcucumberSelinium" and clicks Next
#And User enters passwordP "2018test" and clicks Next
#Then Should take user to landing page
#
#Feature: Test complex search input
#Scenario: User books an appointment for Diagnosis test
#Given Open browser and loaded quest diagnostics
#When User enters location
#And  User enters reason for testing
#And User enters date and time and clicks Continue
#Then Should reload the page with appointment details

Scenario: User searches for ticket in orbitz
Given Open browser and loaded orbitz portal
When User clicks on flight tab
And  Enters flying from and flying to airport codes
And Enters departing and returning dates
And Clicks advanced option link and choses nonStop checkbox
And Selects Emirates as the prefered airline
And clicks on Search button
Then Should load results page with available flights

