package TutorialSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoFrameworkTest {
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;

	@Before
	public void beforeClass() {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";


		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void test() {
		driver.findElement(By.id("primary-header-flight")).click();
		driver.findElement(By.id("tab-flight-tab-flp")).click();
		driver.findElement(By.id("flight-origin-flp")).sendKeys("New York");
		driver.findElement(By.id("flight-destination-flp")).sendKeys("Chicago");
		driver.findElement(By.id("flight-departing-flp")).sendKeys("10/28/2019");
		driver.findElement(By.id("flight-returning-flp")).clear();
		driver.findElement(By.id("flight-returning-flp")).sendKeys("10/31/2019");
		driver.findElement(By.xpath("//div[@class='cols-nested ab25184-submit']//button[@class='btn-primary btn-action gcw-submit']")).click();
	}

	@After
	public void afterClass() {
	}

}
