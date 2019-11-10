package TestNGFinalTutorial.ParallelTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import TestNGFinalTutorial.SearchPage;
import TestNGFinalTutorial.DependCase.TestNG_DependentTests;

public class TestNG_MultiBrowserAndParallelTests {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_DependentTests.class);

	@Parameters("browserType")
	@BeforeClass
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			// http://chromedriver.storage.googleapis.com/index.html

			driver = new ChromeDriver();
		}
		
		baseUrl = "https://www.expedia.com/";
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("D:\\QA\\Selenium learning\\src\\test\\java\\TestNGFinalTutorial\\log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void searchFlights() throws Exception {
		//SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "New York");
		log.info("Enter the city of departure");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		log.info("Enter the city of destination");
		SearchPage.fillDepartureDateTextBox(driver, "10/28/2019");
		SearchPage.fillReturnDateTextBox(driver, "10/31/2019");
		//SearchPage.selectFlightAdults(driver, "2");
	}

	@AfterClass
	public void afterClass() throws Exception {
		Thread.sleep(10000);
		//driver.quit();
	}

}
