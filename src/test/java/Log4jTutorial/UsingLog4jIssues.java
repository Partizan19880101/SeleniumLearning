package Log4jTutorial;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

public class UsingLog4jIssues {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(UsingLog4jIssues.class);

	@Before
	public void setUp() throws Exception {
		PropertyConfigurator.configure("D:\\QA\\Selenium learning\\src\\test\\java\\Log4jTutorial\\log4j.properties");
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		log.info("Navigate to flights tab");
		log.info("Enter origin city");
		log.info("Enter destination city");
		log.info("Enter departure date");
		log.info("Enter return date");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
