package Com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com.pages.Login_page;
import Excelutility.Excel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepDefinition 
{
	WebDriver driver;
	Login_page lg=new Login_page();
	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser() throws Throwable 
	{
		lg.url();
	}

	@When("^the user open the Demoblaze website$")
	public void the_user_open_the_Demoblaze_website() 
	{
	  lg.demoblaze_homePage();
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws IOException 
	{
	   lg.userclick();
	}


	@Then("^the user enters the username and password clicks on login button$")
	public void the_user_enters_the_username_and_password() throws IOException
	{
		for(int i=1;i<3;i++)
		{
			lg.usernamepassword(i);
			lg.url();
			lg.demoblaze_homePage();
			lg.userclick();
		}
	}
	
}
