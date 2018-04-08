Feature: Test simple login to gmail
Scenario: User login with valid login credentials
Given Open browser and application loaded
When User enters user id and clicks Next
And User enters password and clicks Next
Then Should take user to landing page
