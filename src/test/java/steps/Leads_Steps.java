package steps;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Leads_Steps extends DriverFactory {
	
	@When("^User clicks on leads link$")
	public void user_clicks_on_leads_link() throws Throwable {
		topMenuLandingPage.ClickLeadsLinkOnHomePage();
	    
	}

	@When("^User clicks on leads plus button$")
	public void user_clicks_on_leads_plus_button() throws Throwable {
	     leadsPage.clickCreateLeadsButton();	    
	     
	}

	@When("^User selects First Name title as \"([^\"]*)\"$")
	public void user_selects_First_Name_title_as(String arg1) throws Throwable {
		leadsPage.selectFirstNameType(arg1);
	    
	}

	@When("^User enters First Name \"([^\"]*)\"$")
	public void user_enters_First_Name(String arg1) throws Throwable {
		leadsPage.enterFirstName(arg1);
	    
	}

	@When("^User enters last name \"([^\"]*)\"$")
	public void user_enters_last_name(String arg1) throws Throwable {
		leadsPage.enterFirstName(arg1);
	    
	}

	@When("^User enters Company name \"([^\"]*)\"$")
	public void user_enters_Company_name(String arg1) throws Throwable {
		leadsPage.enterCompanyName(arg1);
	    
	}

	@When("^User enters Title \"([^\"]*)\"$")
	public void user_enters_Title(String arg1) throws Throwable {
		leadsPage.enterTitle(arg1);
	    
	}

	@When("^User selects Lead Source \"([^\"]*)\"$")
	public void user_selects_Lead_Source(String arg1) throws Throwable {
	    
	    
	}

	@When("^User selects Industry \"([^\"]*)\"$")
	public void user_selects_Industry(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Annual Revenue \"([^\"]*)\"$")
	public void user_enters_Annual_Revenue(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters No Of Employees \"([^\"]*)\"$")
	public void user_enters_No_Of_Employees(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Secondary Email \"([^\"]*)\"$")
	public void user_enters_Secondary_Email(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Street \"([^\"]*)\"$")
	public void user_enters_Street(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Postal Code \"([^\"]*)\"$")
	public void user_enters_Postal_Code(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Country \"([^\"]*)\"$")
	public void user_enters_Country(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Description \"([^\"]*)\"$")
	public void user_enters_Description(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Phone \"([^\"]*)\"$")
	public void user_enters_Phone(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Mobile \"([^\"]*)\"$")
	public void user_enters_Mobile(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Fax \"([^\"]*)\"$")
	public void user_enters_Fax(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Email \"([^\"]*)\"$")
	public void user_enters_Email(String arg1) throws Throwable {
	    
	    
	}

	@When("^User enters Website \"([^\"]*)\"$")
	public void user_enters_Website(String arg1) throws Throwable {
	    
	    
	}

	@When("^User selects Lead Status \"([^\"]*)\"$")
	public void user_selects_Lead_Status(String arg1) throws Throwable {
	    
	    
	}

	@When("^User selects Assigned To \"([^\"]*)\"$")
	public void user_selects_Assigned_To(String arg1) throws Throwable {
	    
	    
	}

	@When("^User clicks on Save button$")
	public void user_clicks_on_Save_button() throws Throwable {
	    
	    
	}

	@Then("^User should see lead creation success message$")
	public void user_should_see_lead_creation_success_message() throws Throwable {
	    
	    
	}

	@Then("^User should verify leads information$")
	public void user_should_verify_leads_information() throws Throwable {
	    
	    
	}

	@Then("^User logouts home page\\.$")
	public void user_logouts_home_page() throws Throwable {
	    
	    
	}

}
