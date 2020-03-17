@DemoBlaze_Feature
Feature: DemoBlaze Website
@tc01_demoblazelogin
Scenario:
Login in to demo blaze steps

Given the user launched the chromebrowser
When the user open the Demoblaze website
Then user clicks on login button
Then the user enters the username and password clicks on login button



@tc02_demoblazeAddtoCart
Scenario:
AddtoCart 

Given the user launched chromebrowser
When the user open Demoblaze 
Then the user selects the product
And the product is added to cart


@tc03_ContactDetails
Scenario:
Contact Details

Given user launches chromebrowser
When the DemoBlaze application is opened
Then the user clicks on Contact
And the user enters the details
And the user clicks the send button.


@tc04_nextpage
Scenario:
Go to nextpage and select the product

Given the user Launces the ChromeBrowser
When the user have open the demoBlazeApplication
Then user will click the nextpage
And the user selects the product






