package FileUpload;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


public class FileUploadWindowsAutoIT {
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.gmail.com/";
		driver = new ChromeDriver();

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void fileUpload() throws AWTException, InterruptedException, IOException {
		driver.findElement(By.id("identifierId")).sendKeys("zuyonok88@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Partizan88"+ (Keys.ENTER)); // Enter your password

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();

		//WebElement mailTo = null;
		WebElement addressLine =   driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'Кому')]"));
		addressLine.click();
		addressLine.sendKeys("zuyonok88@gmail.com");
		addressLine.sendKeys(Keys.ENTER);
		WebElement subjectLine =  driver.findElement(By.name("subjectbox"));

		subjectLine.click();
		subjectLine.sendKeys("Hi everyone");

		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();



		Runtime.getRuntime().exec("D:\\Новая папка\\Selenium learning\\script\\FileUpload.exe");

		driver.findElement(By.xpath("//div[text()='Отправить']")).click();
		//sendButton.click();
	}

	@AfterClass
	public void afterClass() {
	}

}