package JUnitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class GetText {

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
    public void testLetsKodeIt() throws InterruptedException {
        driver.get(baseUrl1);
        WebElement buttonElement = driver.findElement(By.id("opentab"));
        String elementText = buttonElement.getText();

        System.out.println("Text on the element is " + elementText);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        //driver.quit();
    }
}