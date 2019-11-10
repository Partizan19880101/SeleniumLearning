package TestNGFinalTutorial;

import TestNGFinalTutorial.DependCase.WaitTypes;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	public static WebElement element = null;
	static Logger log = Logger.getLogger(SearchPage.class);


	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	public static WebElement originTextBox(WebDriver driver){
		element = driver.findElement(By.id("package-origin-hp-package"));
		return element;
	}

	public static void fillOriginTextBox(WebDriver driver, String origin){
		element = originTextBox(driver);
		element.sendKeys(origin);

	}


	/**
	 * Returns the flight destination text box element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver){
		element = driver.findElement(By.id("package-destination-hp-package"));
		return element;
	}
	public static void fillDestinationTextBox(WebDriver driver, String origin){
		element = destinationTextBox(driver);
		element.sendKeys(origin);

	}

	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver){
		element = driver.findElement(By.id("package-departing-hp-package"));
		return element;
	}
	public static void fillDepartureDateTextBox(WebDriver driver, String origin){
		element = departureDateTextBox(driver);
		element.sendKeys(origin);

	}

	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver){

		element = driver.findElement(By.id("package-returning-hp-package"));
		return element;
	}


	public static void fillReturnDateTextBox(WebDriver driver, String origin){
		element = returnDateTextBox(driver);
		element.click();
		element.clear();
		element.sendKeys(origin);
	}

	/**
	 * Returns the search button box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver){
		element = driver.findElement(By.id("search-button-hp-package"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver){
		element = searchButton(driver);
		element.click();
	}

	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsTab(WebDriver driver){
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}


	public static void clickOnAdvancedLink(WebDriver driver) {
		element = driver.findElement(By.id("package-advanced-options-hp-package"));
		element.click();
		log.info("Clicked on Advanced Options link");
	}
	/**
	 * Click non-stop check box
	 * @param driver
	 */
	public static void clickNonStopCheckBox(WebDriver driver) {
		element = driver.findElement(By.id("advanced-flight-nonstop-flp"));
		element.click();
		log.info("Clicked non-stop check box");
	}
	/**
	 * Select flight class
	 * @param driver
	 */
	public static void selectFlightClass(WebDriver driver, String flightClass) {
		Select options = new Select(driver.findElement(By.id("package-advanced-preferred-class-hp-package")));
		options.selectByValue(flightClass);
		log.info("Select flight class as " + flightClass);
	}
	public static void clickMorningFlight(WebDriver driver) {
		WebElement element = WaitTypes.getWhenVisible(driver,
				By.xpath("//ul[@id='departureTimeList']//span[contains(text(), 'Morning')]//preceding-sibling::input"), 30);
		element.click();
		log.info("Clicked on Morning Time to filter the results");
	}
	public static void clearAllFields(WebDriver driver) {
		driver.findElement(By.id("package-destination-hp-package")).clear();
		driver.findElement(By.id("package-origin-hp-package")).clear();
		driver.findElement(By.id("package-departing-hp-package")).clear();
		driver.findElement(By.id("package-returning-hp-package")).clear();
	}
	public static void clearReturning(WebDriver driver) {

		driver.findElement(By.id("package-returning-hp-package")).clear();
	}
}
