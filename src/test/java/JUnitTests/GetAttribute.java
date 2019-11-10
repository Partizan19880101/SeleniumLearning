package JUnitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetAttribute {
    WebDriver driver;
    String baseUrl1;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl1 = "http://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void name() {
        driver.get(baseUrl1);

        WebElement element = driver.findElement(By.id("name"));
        String attributeValue = element.getAttribute("type");

        System.out.println("Value of attribute is " + attributeValue);



    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
