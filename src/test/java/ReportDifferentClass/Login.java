package ReportDifferentClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	HomePage hp;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "https://learn.letskodeit.com/";
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");
		driver = new ChromeDriver();
		hp = new HomePage(driver, test);
		test.log(LogStatus.INFO, "Browse Started...");

		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
		
		hp.login("test@email.com", "abcabc");
		
		Thread.sleep(3000);
		
		boolean result = hp.isWelcomTextPresent();

		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Усе добра епти!!!");
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}