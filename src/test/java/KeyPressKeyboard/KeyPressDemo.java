package KeyPressKeyboard;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeyPressDemo {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void name() throws InterruptedException {
        driver.get(baseUrl);
        //driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        //driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        driver.findElement(By.id("openwindow")).sendKeys(selectAll);

        Thread.sleep(4000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
