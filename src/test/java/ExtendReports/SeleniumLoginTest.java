package ExtendReports;

import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLoginTest {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = new ExtentReports("D:\\Новая папка\\Selenium learning\\Report");
		test = report.startTest("Verify Welcom Test");


		baseUrl = "https://learn.letskodeit.com/";
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started Maximized");

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "WebApplication open");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
		//WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		//signupLink.click();
		
		WebElement loginLink = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
		loginLink.click();
		test.log(LogStatus.INFO, "Click on login Link");
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id='user_email']"));
		emailField.sendKeys("test@email.com");
		test.log(LogStatus.INFO, "Entering Email");
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='user_password']"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Enter password");
		
		WebElement goButton = driver.findElement(By.xpath("//input[@name='commit']"));
		goButton.click();
		test.log(LogStatus.INFO, "clicking go button");
		
		Thread.sleep(3000);
		
		WebElement welcomeText = null;
		
		try {
			welcomeText = driver.findElement(By.xpath("//input[@id='search-courses']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
		test.log(LogStatus.PASS, "Verify Welcom Text");
	}
	
	@AfterClass
	public void afterClass() {
		//driver.quit();
		report.endTest(test);
		report.flush();
	}
}