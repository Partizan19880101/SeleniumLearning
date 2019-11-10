package JUnitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import JUnitTests.GenericMethods2;

import java.util.concurrent.TimeUnit;

public class GenericMethod {
    private WebDriver driver;
    private String baseUrl1;
    private GenericMethods2 gm;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl1 = "http://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        gm = new GenericMethods2(driver);
    }

    @Test
    public void name() {
        driver.get(baseUrl1);

        WebElement element = gm.getElement("name", "id");
        element.sendKeys("test");



    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }




}
