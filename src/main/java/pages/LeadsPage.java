package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LeadsPage extends BasePage {

	public LeadsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//body[1]/table[3]/tbody[1]/tr[2]/td[1]/a[1]")
	public WebElement confirmLeadsPage;

	@FindBy(xpath = "//body[1]/table[3]/tbody[1]/tr[2]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
	public WebElement createLeadsButton;

	@FindBy(xpath = "//tbody/tr[3]/td[2]/select[1]")
	WebElement firstNameType;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='company']")
	WebElement company;
	
	@FindBy(xpath = "//input[@name='designation']")
	WebElement designation;

	@FindBy(name = "leadsource")
	WebElement leadsource;

	@FindBy(xpath = "//select[@name='industry']")
	WebElement industry;

	@FindBy(name = "annualrevenue")
	WebElement annualrevenue;

	@FindBy(id = "noofemployees")
	WebElement noofemployees;

	@FindBy(xpath = "//*[@id='secondaryemail']")
	WebElement secondaryemail;

	@FindBy(xpath = "//textarea[@name='lane']")
	WebElement street;

	@FindBy(xpath = "//input[@name='code']")
	WebElement postalCode;

	@FindBy(xpath = "//input[@name='country']")
	WebElement country;

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement description;

	@FindBy(id = "phone")
	WebElement phone;

	@FindBy(id = "mobile")
	WebElement mobile;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(name = "leadstatus")
	WebElement leadstatus;

	@FindBy(xpath = "//*[@id='assign_user']/select")
	WebElement assignTo;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	WebElement save;

	@FindBy(xpath = "//*[@id='designation']")
	WebElement title;

	@FindBy(xpath = "//*[@id='fax']")
	WebElement fax;

	@FindBy(xpath = "//input[@name='website']")
	WebElement website;

	Select select;

	public WebElement getConfirmLeadsPage() {
		log.info("The Text is being verified..." + confirmLeadsPage.getText());
		System.out.println("The Text is being verified..." + confirmLeadsPage.getText());
		return confirmLeadsPage;
	}

	public void clickCreateLeadsButton() throws InterruptedException {
		try {
			waitAndClickElement(createLeadsButton);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement selectFirstNameType(String arg1) throws InterruptedException {
		log.info("selecting first Name type as: " + firstNameType);
		select = new Select(firstNameType);
		select.selectByVisibleText(arg1);
		return firstNameType;
	}

	public WebElement enterFirstName(String arg1) throws Exception {
		sendKeysToWebElement(firstName, arg1);
		return firstName;
	}

	public WebElement enterLastName(String arg1) throws InterruptedException {
		try {
			sendKeysToWebElement(lastName, arg1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lastName;
	}

	public WebElement enterCompanyName(String arg1) throws Exception {
		sendKeysToWebElement(company, arg1);
		return company;
	}
	
	public WebElement enterTitle(String arg1) throws Exception{
		log.info("entering title as: " + title);
		sendKeysToWebElement(title, arg1);
		Thread.sleep(13000);
		return title;
	}

	public WebElement enterDesignation() {
		
		return designation;
	}

	public WebElement getLeadsource() {
		return leadsource;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getAnnualrevenue() {
		return annualrevenue;
	}

	public WebElement getNoofemployees() {
		return noofemployees;
	}

	public WebElement getSecondaryemail() {
		return secondaryemail;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement enterDescription() {
		return description;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getLeadstatus() {
		return leadstatus;
	}

	public WebElement getAssignTo() {
		return assignTo;
	}

	public WebElement getSave() {
		return save;
	}


	public WebElement getFax() {
		return fax;
	}

	public WebElement getWebsite() {
		return website;
	}

	public Select getSelect() {
		return select;
	}

}
