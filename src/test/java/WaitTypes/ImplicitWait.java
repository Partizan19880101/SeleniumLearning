package WaitTypes;

import com.sun.org.apache.bcel.internal.generic.DREM;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.dc.pr.PRError;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
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
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_email")).sendKeys("Test");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        //driver.quit();
    }
}
