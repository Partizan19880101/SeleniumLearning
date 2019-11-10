package TestNGFinalTutorial;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;



public class TestNGTestCase {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNGTestCase.class);

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PropertyConfigurator.configure("D:\\QA\\Selenium learning\\src\\test\\java\\TestNGFinalTutorial\\log4j.properties");
	}

	@Test
	public void fillBasicInfo() throws InterruptedException {
		driver.get(baseUrl);
		//SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "New York");
		log.info("Fill the city of departure");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		log.info("Fill the city of destination");
		SearchPage.fillDepartureDateTextBox(driver, "12/25/2019");
		log.info("Fill the date of departure");
        WebElement element = driver.findElement(By.id("package-returning-hp-package"));

        element.clear();
        element.sendKeys("12/31/2019");
		//SearchPage.fillReturnDateTextBox(driver,  "12/31/2019");
		log.info("Fill the date og return");
		Thread.sleep(3000);
	}

    @Test
    public void fillAdvancedInfo() {
        driver.get(baseUrl);
        SearchPage.clickOnAdvancedLink(driver);
        //SearchPage.clickNonStopCheckBox(driver);
        SearchPage.selectFlightClass(driver, "First class");
    }



	@AfterMethod
	public void afterMethod() {
	}

}
