package ReportDifferentClass;

import java.util.concurrent.TimeUnit;

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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "https://learn.letskodeit.com/";
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser Started...");

		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {

		
		WebElement loginLink = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
		loginLink.click();
		test.log(LogStatus.INFO, "Clicked on login link");
		
		WebElement emailField = driver.findElement(By.id("user_email"));
		emailField.sendKeys("test@email.com");
		test.log(LogStatus.INFO, "Enter email");
		
		WebElement passwordField = driver.findElement(By.id("user_password"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Enter password");
		
		WebElement goButton = driver.findElement(By.xpath("//input[@name='commit']"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked Go button");
		
		Thread.sleep(3000);
		
		WebElement welcomeText = null;

		try {
			welcomeText = driver.findElement(By.xpath("//input[@id='search-courses']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
		test.log(LogStatus.PASS, "Welcome Text");
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}