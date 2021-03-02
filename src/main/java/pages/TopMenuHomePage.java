package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TopMenuHomePage extends BasePage {

	public TopMenuHomePage() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/img[1]")
	public WebElement link_Home;
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]")
	public WebElement link_Leads;

	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	public WebElement link_Calendar;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]")
	public WebElement link_Organizations;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement link_Contacts;

	@FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]")
	public WebElement link_Opportunities;

	@FindBy(xpath = "//a[contains(text(),'Products')]")
	public WebElement link_Products;

	@FindBy(xpath = "//a[contains(text(),'Documents')]")
	public WebElement link_Documents;

	@FindBy(xpath = "//a[contains(text(),'Email')]")
	public WebElement link_Email;

	@FindBy(xpath = "//tbody/tr[1]/td[18]/a[1]")
	public WebElement link_TroubleTickets;

	@FindBy(xpath = "//tbody/tr[1]/td[20]/a[1]")
	public WebElement link_Dashboard;

	@FindBy(xpath = "//tbody/tr[1]/td[22]/a[1]")
	public WebElement link_More;

	@FindBy(xpath = "//select[@id='qccombo']")
	public WebElement DropDownButton_QuickCreate;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[5]")
	public WebElement textField_Search;

	@FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")
	public WebElement buttonTextField_Search;

	@FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[3]/a[1]/img[1]")
	public WebElement Image_Help;

	@FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[4]/img[1]")
	public WebElement IconImage_CRMSettings;
	
	@FindBy(xpath = "//span[contains(text(),' Administrator')]")
	public WebElement administrator;

	@FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[2]/img[1]")
	public WebElement img_profile;

	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	public WebElement button_Logout;

	public void ClickLeadsLinkOnHomePage() throws Throwable {
		WaitUntilWebElementIsVisible(link_Leads);
		waitAndClickElement(link_Leads);
		Thread.sleep(15000);

	}

	public WebElement confirmAdministratorText() throws Throwable {
		WaitUntilWebElementIsVisible(administrator);
		System.out.println("Current Page Tittle: " + getTitle());
		System.out.println("This is the current URL: " + getCurrentURL());
		System.out.println("The text is Displayed: " + administrator.isDisplayed());
		System.out.println("The is the CONFIRMATION OF BEING HOMEPAGE: " + administrator.getText());
		administrator.isDisplayed();
		Assert.assertTrue(administrator.getText().contains("Admin"));
		return administrator;

	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void logoutHomePage() throws Throwable {
		/*
		 * WaitUntilWebElementIsVisible(img_profile);
		 * actionMoveAndClick(img_profile); waitAndClickElement(button_Logout);
		 */

		/*
		 * // Instantiate Action Class Actions actions = new Actions(driver); //
		 * Retrieve WebElement 'Music' to perform mouse hover WebElement
		 * ProfileImage = img_profile; // Mouse hover ProfileImage
		 * actions.moveToElement(ProfileImage).perform();
		 * waitAndClickElement(button_Logout);
		 */

	}

	public WebElement getLink_Calendar() {
		return link_Calendar;
	}

	public WebElement getLink_Organizations() {
		return link_Organizations;
	}

	public WebElement getLink_Contacts() {
		return link_Contacts;
	}

	public WebElement getLink_Opportunities() {
		return link_Opportunities;
	}

	public WebElement getLink_Products() {
		return link_Products;
	}

	public WebElement getLink_Documents() {
		return link_Documents;
	}

	public WebElement getLink_Email() {
		return link_Email;
	}

	public WebElement getLink_TroubleTickets() {
		return link_TroubleTickets;
	}

	public WebElement getLink_Dashboard() {
		return link_Dashboard;
	}

	public WebElement getLink_More() {
		return link_More;
	}

	public WebElement getDropDownButton_QuickCreate() {
		return DropDownButton_QuickCreate;
	}

	public WebElement getTextField_Search() {
		return textField_Search;
	}

	public WebElement getButtonTextField_Search() {
		return buttonTextField_Search;
	}

	public WebElement getImage_Help() {
		return Image_Help;
	}

	public WebElement getIconImage_CRMSettings() {
		return IconImage_CRMSettings;
	}

}