package InterviewQuestions;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StateElement {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void name() {
        driver.get(baseUrl);

        driver.get(driver.getCurrentUrl());
        WebElement checkboxElement = driver.findElement(By.id("bmwcheck"));
        checkboxElement.click();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
    }
}
