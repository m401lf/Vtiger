package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
	

	
	public SignInPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[contains(text(),'Powered by vtiger CRM - 5.4.0')]")
	public WebElement confirmLoginPage;

	@FindBy(xpath="//*[@id='form']/div/div[2]/input")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id='form']/div/div[4]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='submitButton']")
	WebElement loginButton;
	
	
	
	public WebElement getConfirmLoginPage() {
		getCurrentURL();
		return confirmLoginPage;
	}

	public WebElement enterUserName(String arg1) throws Throwable {
		sendKeysToWebElement(userName, arg1);
		return userName;
	}

	public WebElement enterPassword(String arg1) throws Throwable {
		sendKeysToWebElement(password, arg1);
		return password;
	}

	public WebElement clickOnLoginButton() {
		loginButton.click();
		return loginButton;
	}

	public void login2LgonPage(String userName, String password) throws Throwable {
		enterUserName(userName);
		enterPassword(password);
		clickOnLoginButton();
	}
}
