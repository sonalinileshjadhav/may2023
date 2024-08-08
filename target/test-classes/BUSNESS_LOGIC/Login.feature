Feature: Login functionality

Background: User successfully opened main page
Given user open "chrome" brouser 
Given user enter url 


@SmokeTest
Scenario: Login functionality with valid username and password
When user enter "Admin" as Username 
When user enter "Admin" as Password 
When user click on Login button 
Then Application shows Admin page to user


