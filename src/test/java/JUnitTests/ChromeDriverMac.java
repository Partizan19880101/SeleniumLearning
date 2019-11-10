package JUnitTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMac {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "https://google.com";
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "D:\\Новая папка\\Selenium learning\\src\\test\\java\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);



	}

}
