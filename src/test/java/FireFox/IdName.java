package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdName {
    public static void main(String[] args) {
        WebDriver driver;
        //System.setProperty("webdriver.gecko.driver", "D:\\Новая папка\\Selenium learning\\src\\test\\java\\geckodriver.exe");
        driver = new FirefoxDriver();
        String baseURL = "https://google.com";
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.name("q")).sendKeys("letskodeit");
        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();


    }
}
