Feature: Login functionality

Background: User successfully opened main page
Given user open "chrome" brouser with exe as "C:\\Automation\\chromedriver.exe"
Given user enter url as "http://primusbank.qedgetech.com/"

@SmokeTest
Scenario Outline: Login functionality with valid username and password
When user enter <username> as Username 
When user enter <password> as Password 
When user click on Login button 
Then Application shows Admin page to user


Examples:
   |username|password|
   |Admin|Admin|
   |123Admin|Admin345|
   |admin|admin|
   
   