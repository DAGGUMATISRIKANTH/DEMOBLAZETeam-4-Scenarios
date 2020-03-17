package Com.stepdefinition;

import java.io.IOException;

import Com.pages.NextPage_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NextPage_stepdefinition {
	NextPage_page np = new NextPage_page();
	@Given("^the user Launces the ChromeBrowser$")
	public void the_user_Launces_the_ChromeBrowser() 
	{
	    np.url();
	}

	@When("^the user have open the demoBlazeApplication$")
	public void the_user_have_open_the_demoBlazeApplication() 
	{
		np.demoblaze_homePage();
	
	}

	@Then("^user will click the nextpage$")
	public void user_will_click_the_nextpage() throws InterruptedException 
	{
		np.Scrollby();
	}
    @And("^ the user selects the product$")
    public void user_selects_the_product() throws InterruptedException, IOException
    {
    	np.click();
    }
    
}
