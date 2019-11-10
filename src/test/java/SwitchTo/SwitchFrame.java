package SwitchTo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class SwitchFrame {
    private WebDriver driver;
    private String baseUrl;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void name() throws InterruptedException {
        Thread.sleep(2000);
        //Switch to frame by numbers, if we had a lot of frame.
        //driver.switchTo().frame(0);

        //Switch to frame by id
        //driver.switchTo().frame("courses-iframe");
        //Switch to frame by name
        driver.switchTo().frame("iframe-name");

        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Пошел на хуй!!!");

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(10000);
        //driver.quit();
    }
}