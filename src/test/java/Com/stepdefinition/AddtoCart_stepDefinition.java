package Com.stepdefinition;

import java.io.IOException;

import Com.pages.AddtoCart_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddtoCart_stepDefinition {
	AddtoCart_page ac=new AddtoCart_page();
	
	@Given("^the user launched chromebrowser$")
	public void the_user_launched_chromebrowser() 
	{
		ac.url();
	    
	}

	@When("^the user open Demoblaze$")
	public void the_user_open_Demoblaze() 
	{
	    ac.demoblaze_homePage();
	    
	}

	@Then("^the user selects the product$")
	public void the_user_selects_the_product() throws InterruptedException 
	{
	    ac.Select_product();
	    Thread.sleep(5000);
	}

	@Then("^the product is added to cart$")
	public void the_product_is_added_to_cart() throws InterruptedException, IOException
	{
	   ac.Add_cart();
	   Thread.sleep(5000);
	}
	

}
