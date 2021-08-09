Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page Title should be "Swag Labs"


Scenario: Login with valid Credentials
Given user is on login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks on Login button
Then user gets the title of the page
And page Title should be "Swag Labs"