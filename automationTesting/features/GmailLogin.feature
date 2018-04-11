Feature: Simple test scenario User login

@GmailLoginTest
Scenario: User login with valid login credentials
Given Open browser and Gmail application is loaded
When User enters user id and clicks Next
And User enters password and clicks Next
Then Should take user to landing page
