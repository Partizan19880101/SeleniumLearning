package Actions;

import java.util.concurrent.TimeUnit;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://jqueryui.com/slider/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSliderActions() throws Exception {
		driver.get(baseUrl);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		// Using the actions class
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 300, 0).perform();
	}

	@After
	public void tearDown() throws Exception {
	}
}
