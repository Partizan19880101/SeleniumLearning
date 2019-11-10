package WaitTypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws Exception{
        driver.get(baseURL);
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement emailFild = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        emailFild.sendKeys("test");



    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        //driver.quit();
    }
}

