package KeyPressKeyboard;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeyPress {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }


    @Test
    public void name() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
        driver.findElement(By.id("user_email")).sendKeys("Zuyonok@mail.ru");
        Thread.sleep(2000);
        //driver.findElement(By.id("user_password")).sendKeys("Partizan88");
        //Thread.sleep(2000);
        //driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        //driver.quit();
    }
}
