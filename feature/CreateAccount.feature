Feature: Test Salesforce login functionality
I want to use this feature file to test the login functionality of our salesforce application.

Scenario: login using valid credentials
	Given I open chrome browser
	And I go to salesforce home page
	And I enter username as "test.user@gmail.com.test"
	And I enter password as "Welcome1"
	When I click the login button
	Then I see the dashboard
	And I create Account
		|Account Name  | Phone        |  Parent Account 		      |	Fax					|Type		   | Account Number |
		|BOA					 | 703-626-6053 |  Aethna Home Products     |703-626-6053 |Prosepect | 123456
		|Wachovia			 | 703-626-6054 |  Burlington Textiles Corp |703-626-6054 |Others		 | 987654					|

