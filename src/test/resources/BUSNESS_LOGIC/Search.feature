Feature: Search functionality

Background: User successfully opened main page
Given user open "chrome" brouser 
Given user enter url 

When user enter "Admin" as Username 
When user enter "Admin" as Password
When user click on Login button 

@SmokeTest
Scenario: search functionality for mumbai city
When user click on branches
When user select 'INDIA' as country
When user select 'MAHARASTRA' as state
When user select 'MUMBAI' as city
When user click on search button
Then application shows list of branches for mumbai city


