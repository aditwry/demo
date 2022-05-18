Feature: Test Order Hooks
@first
Scenario: First scenario to test Order Hooks functionality
	Given this is the first step
	When I enter Username as <username> and Password as <password>	
  Then this is the third step
  Examples:
  	| username    | password   |
  	|standard_user|secret_sauce|
@second
Scenario: Second scenario to test Order Hooks functionality
	Given this is the first step
	When I enter Username as <username> and Password as <password>	
	Then this is the third step
  Examples:
  	| username | password |
  	| admin    | admin123 |
 

 