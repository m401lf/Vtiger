package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

	public LandingPage() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "XXXXXXXXXXXXXXXXXXXXX")
	public WebElement popUp;
	

	public int getPopUpSize() {
		
		return getDriver().findElements((By) popUp).size();
		
	}
	public WebElement getPopUp() {
		
		return getDriver().findElement((By) popUp);
	}

}