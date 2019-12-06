Feature: Test Slesforce login functionality
  I want to use this feature file to test the login functionality of our salesforce application.

  Scenario: login using valid credentials
  Scenario: login using valid credentials
	Given I open chrome browser
	And I go to salesforce home page
	And I enter username as "test.user@gmail.com.test"
	And I enter password as "Welcome1"
	When I click the login button
	Then I see the dashboard
    
 Scenario: login using invalid credentials
	Given I open chrome browser
	And I go to salesforce home page
	And I enter username as "test.user@gmail.com.test"
	And I enter password as "Welcome1"
	When I click the login button
	Then I see the dashboard
  Then I should see an error message
