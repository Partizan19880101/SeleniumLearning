package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindByTag {
    public static void main(String[] args) {
        WebDriver driver;
        //System.setProperty("webdriver.gecko.driver", "D:\\Новая папка\\Selenium learning\\src\\test\\java\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseURL = "https://demostore.x-cart.com";
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.tagName("a")).click();
    }
}
