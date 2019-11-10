package JUnitTests;

import com.sun.org.apache.bcel.internal.generic.DREM;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ElementStateTest {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);


    }

    @Test
    public void test() {
        WebElement e1 = driver.findElement(By.name("q"));
        System.out.println("Is e1 enable? " + e1.isEnabled());
        e1.sendKeys("https://pornhub.com/");
        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        //driver.quit();
    }
}