package KeyPressKeyboard;

import com.sun.org.apache.bcel.internal.generic.DREM;
import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyPressDemo2 {
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
    public void name() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();


    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }
}
