package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pages.TopMenuHomePage;
import pages.LeadsPage;
import pages.BasePage;
import pages.HomePage;

import pages.SignInPage;




public class DriverFactory{
	public static WebDriver driver;
	
	public static SignInPage signInPage;
	public static HomePage homePage;
	public static LeadsPage leadsPage;
	public static TopMenuHomePage topMenuHomePage;
	public static Logger log = LogManager.getLogger(BasePage.class.getName());

	public static WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {


			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				// code
				if (browserName.equals(driver)) {
					System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			signInPage = PageFactory.initElements(driver, SignInPage.class);
			homePage = PageFactory.initElements(driver, HomePage.class);
			leadsPage = PageFactory.initElements(driver, LeadsPage.class);
			topMenuHomePage = PageFactory.initElements(driver, TopMenuHomePage.class);
			
		}
		return driver;
	}
}
