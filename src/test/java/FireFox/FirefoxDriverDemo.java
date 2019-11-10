package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "D:\\Новая папка\\Selenium learning\\src\\test\\java\\geckodriver.exe");

		//System.setProperty("webdriver.chrome.driver", "D:\\Новая папка\\ChromeIeGecko");
		String baseURL = "https://google.com";


		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
	}
}

