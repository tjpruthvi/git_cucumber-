Feature: Application Login

Background:
Given setup the entries in the database
When launch the browser with config properties
And hit the homepage


@SmokeTest @RegressionTest @Netbanking
Scenario: Netbanking user loginpage test

Given user is on the Netbanking landing page
When user login to the application with "admin"  and password "1243"
Then homepage is displayed
And cards are displayed





@SmokeTest @RegressionTest @Mortgage
Scenario: Mortgage User default Login page test
 Given user is on the Netbanking landing page
When user signup to the application 
|pruthvi|
|ra|
|pru972gmail.com|
|79846556|
Then homepage is displayed
And cards are displayed



