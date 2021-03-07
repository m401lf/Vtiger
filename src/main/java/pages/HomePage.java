package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

	public HomePage() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[contains(text(),' Administrator')]")
	public WebElement administrator;

	@FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[2]/img[1]")
	public WebElement img_profile;

	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	public WebElement button_Logout;

	@FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]")
	public WebElement link_Leads;

	public WebElement confirmAdministratorTextAndIsDisplayed() throws Throwable {
		WaitUntilWebElementIsVisible(administrator);
		System.out.println("The text is Displayed: " + administrator.isDisplayed());
		Assert.assertTrue(administrator.getText().contains("Admin"));
		return administrator;

	}

}