package Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://learn.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

		
		WebElement loginLink = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
		loginLink.click();
		
		WebElement emailField = driver.findElement(By.id("user_email"));
		emailField.sendKeys("test@email.com");
		
		WebElement passwordField = driver.findElement(By.id("user_password"));
		passwordField.sendKeys("abcabc");
		
		WebElement goButton = driver.findElement(By.xpath("//input[@name='commit']"));
		goButton.click();

// With recent webdriver and FF update, there might be issues in clicking the goButton.
// If you also encouter the issues, please comment the above code for goButton and un-comment the below code
		
//		WebElement goButton =driver.findElement(By.xpath("//button[@id='memberLoginDialogsubmitButton']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(goButton).click().perform();
		
		Thread.sleep(3000);
		
		//WebElement practicePage = driver.findElement(By.id("DrpDwnMn06bg"));
		//practicePage.click();
		System.out.println("Login Successful");
	}
}