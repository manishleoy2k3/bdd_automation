#Author: manishleoy2k3@gmail.com

@SmokeTest
Feature: Search J P Morgan on google search page and verify Logo

#Background:
#Given validate the browser
#When browser is triggered
#Then check if browser is displayed
 
@SmokeTest
Scenario Outline: Google Search Page launch
Given User is on google search <googlePageTitle> page
When User searched for <name> Text
Then Search results <searchResult> are displayed
And User clicks on first result link
And J P Morgan Home page "J.P. Morgan | Official Website" is shown

Examples: 
| name       |googlePageTitle| searchResult               |
| J P Morgan |Google         | J P Morgan - Google Search | 

@SmokeTest
Scenario Outline: Verify the Logo of J P Morgan on Home Page
Given User is on <j_p_morgan> Home page
When User clicks on J P Morgan logo
Then Verify the J P Morgan logo is present

Examples: 
| j_p_morgan |
| J P Morgan |