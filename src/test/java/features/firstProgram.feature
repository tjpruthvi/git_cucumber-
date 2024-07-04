Feature: Application Login

Background:
Given setup the entries in the database
When launch the browser with config properties
And hit the homepage


@SmokeTest @RegressionTest 
Scenario: Admin default loginpage test

Given user is on the Netbanking landing page
When user login to the application with "admin"  and password "1243"
Then homepage is displayed
And cards are displayed

@RegressionTest
Scenario: User default Login page test

 Given user is on the Netbanking landing page
When user login to the application with user_name  and password password
Then homepage is displayed
And cards are displayed

Scenario Outline: User Login page test

 Given user is on the Netbanking landing page
When user login to the application with "<user_name>"  and password "<password>" combination
Then homepage is displayed
And cards are displayed

Examples:
|user_name| |password|
|crdit_card| |12456|
|debit_card| |4464646|


@SmokeTest @RegressionTest
Scenario: User signup page test
 Given user is on the Netbanking landing page
When user signup to the application 
|pruthvi|
|ra|
|pru972gmail.com|
|79846556|
Then homepage is displayed
And cards are displayed




 

    
