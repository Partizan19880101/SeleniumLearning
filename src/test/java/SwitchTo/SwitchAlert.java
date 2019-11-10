package SwitchTo;

import com.sun.org.apache.bcel.internal.generic.DREM;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchAlert {
    private WebDriver driver;
    private String baseUrl;




    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test
    public void name() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Zuyonok");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void name2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Zuyonok");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        //driver.quit();
    }
}
