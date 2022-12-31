Feature: Sign In Feature

@Testy
Scenario: Verify user can sign in into Retail Application
Given User is on retail website
When User click on Sign in option
And User enter email 'Assad@gmail.com' and password 'Qwerty@1'
And User click on login button
Then User should be logged in into Account

@Test1
Scenario: Verify user can create an account into Retail Website
Given User is on retail website
When User click on Sign in option
And User click on Create New Account button
And User fill the signUp information with below data
| name | email | password | confirmPassword |
| Nabi | nabi@tek.us | Qwerty@12345 | Qwerty@12345 |
And User click on SignUp button
Then User should be logged into account page
