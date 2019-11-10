package TestNGFinalTutorial.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNG_Screenshots {
	private WebDriver driver;
	private String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
		baseUrl = "https://learn.letskodeit.com/";
		driver = new FirefoxDriver();

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test1_invalidCredentials() throws Exception {

		WebElement loginLink = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
		loginLink.click();

		WebElement emailField = driver.findElement(By.id("user_email"));
		emailField.sendKeys("test@email.com");

		WebElement passwordField = driver.findElement(By.xpath("//input[@id='user_password']"));
		passwordField.sendKeys("abcabc");

		WebElement goButton = driver.findElement(By.xpath("//input[@name='commit']"));
		goButton.click();

// With recent webdriver and FF update, there might be issues in clicking the goButton.
// If you also encouter the issues, please comment the above code for goButton and un-comment the below code

//		WebElement goButton =driver.findElement(By.xpath("//button[@id='memberLoginDialogsubmitButton']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(goButton).click().perform();

		Thread.sleep(3000);
		
		WebElement welcomeText = null;
		
		try {
			welcomeText = driver.findElement(By.xpath("//div[text()='Hello test@email.com']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
	}

		@AfterMethod
		public void tearDown (ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE){
			Screenshots.takeScreenshot(driver, testResult.getName());
		}
			driver.quit();
		}
	}
