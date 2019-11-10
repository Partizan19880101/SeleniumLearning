package TutorialSelenium;

import java.util.concurrent.TimeUnit;

import PageClasses.SearchPageFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageClasses.SearchPageFactory;

			// Данные и методы берем из SearchPageFactory!!!

public class FrameworkTestCase {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;

	@Before
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new SearchPageFactory(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws Exception {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("Chicago");
		searchPage.setdepartureDate("10/28/2019");
		searchPage.setreturnDate("10/31/2019");
		//searchPage.clickfindValue();
	}

	@After
	public void afterClass() {
	}
}