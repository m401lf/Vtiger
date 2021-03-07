package steps;

import java.io.IOException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class SignInSteps extends DriverFactory {

	public SignInSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);

		/*
		 * // CODE FOR HANDLING POPUPS//
		 * 
		 * if (landingPage.getPopUpSize()> 0) { landingPage.getPopUp().click();
		 * }
		 */

	}

	@Then("^I should see Log In Page$")
	public void i_should_see_Log_In_Page() throws Throwable {
		signInPage.getConfirmLoginPage();

	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		signInPage.enterUserName(arg1);

	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		signInPage.enterPassword(arg1);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		signInPage.clickOnLoginButton();

	}

	@Then("^I should see application homepage$")
	public void i_should_see_application_homepage() throws Throwable {
		homePage.confirmAdministratorTextAndIsDisplayed();
	}

	@Then("^I should see administrator text message on home Page$")
	public void i_should_see_administrator_text_message_on_home_Page() throws Throwable {
		homePage.confirmAdministratorTextAndIsDisplayed();
		// Assert.assertTrue(homePage.confirmAdministratorTextAndIsDisplayed().isDisplayed());
	}

	/*
	 * @Then("^I logout home page\\.$") public void i_logout_home_page() throws
	 * Throwable { homePage.logoutHomePage(); }
	 */
}