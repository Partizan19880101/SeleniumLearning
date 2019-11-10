package TestNGFinalTutorial.DependCase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import TestNGFinalTutorial.SearchPage;

public class TestNG_DependentTests {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_DependentTests.class);
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("D:\\QA\\Selenium learning\\src\\test\\java\\TestNGFinalTutorial\\log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void searchFlights() throws Exception {

		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "10/28/2019");
		SearchPage.fillReturnDateTextBox(driver, "10/31/2019");
		SearchPage.clickOnSearchButton(driver);
	}

	@Test(dependsOnMethods={ "searchFlights" })
	public void selectMorningFlight() {
		SearchPage.clickMorningFlight(driver);
	}

	@AfterClass
	public void afterClass() {
	}
}
