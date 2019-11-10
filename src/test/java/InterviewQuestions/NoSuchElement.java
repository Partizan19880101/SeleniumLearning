package InterviewQuestions;

import com.sun.org.apache.bcel.internal.generic.DREM;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NoSuchElement {
    private WebDriver driver;
    private String baseUrl;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/";
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void name() {
        driver.get(baseUrl);
        // 1. Timing Issues
        driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
        //WebElement emeilField = driver.findElement(By.id("user_email"));
        //emeilField.sendKeys("zuyonok@mail.ru");
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement emailField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        emailField.sendKeys("zuyonok@mail.ru");


        // 2. Incorrect locator or type of locator


        // 3. Element is in iFrame
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.switchTo().frame("courses-iframe");
        driver.findElement(By.id("search-courses")).sendKeys("Java");
        driver.switchTo().defaultContent();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        //driver.quit();
    }
}
