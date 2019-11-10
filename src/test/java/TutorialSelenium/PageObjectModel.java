package TutorialSelenium;

import java.util.concurrent.TimeUnit;

import PageClasses.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageClasses.SearchPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;
	// Эта страница запрашивает инфу со странице SearchPage
	// в пакете PageClasses
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.departureDateTextBox(driver).sendKeys("12/25/2019");
		SearchPage.returnDateTextBox(driver).sendKeys("12.31.2019");
		SearchPage.clickOnSearchButton(driver);


	}
	
	@After
	public void tearDown() throws Exception {
	}

}
