package Com.stepdefinition;

import java.io.IOException;

import Com.pages.Contact_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contact_stepDefinition 
{
	Contact_page cp=new Contact_page();
	
	@Given("^user launches chromebrowser$")
	public void user_launches_chromebrowser()
	{
	  cp.url();
	}
	@When("^the DemoBlaze application is opened$")
	public void the_DemoBlaze_application_is_opened() 
	{
	    cp.demoblaze_homePage();
	}

	@Then("^the user clicks on Contact$")
	public void the_user_clicks_on_Contact() 
	{
	   cp.clickcontact();
	}

	@And("^the user enters the details$")
	public void the_user_enters_the_details()
	{
	   cp.details();
	}

	@And("^the user clicks the send button\\.$")
	public void the_user_clicks_the_send_button() 
	{
	   cp.send();
	}


}
