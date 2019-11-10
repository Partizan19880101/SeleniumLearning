package letskodeit;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class TestNG_TestCase {
	private WebDriver driver;
        
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(TestNG_TestCase.class.getName());
	
	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(baseUrl);
	}

	@Test
	public void testMethod() throws Exception {
		log.info("This message is from test method");
	}
	
	@AfterClass
	public void afterClass() {
	}
}