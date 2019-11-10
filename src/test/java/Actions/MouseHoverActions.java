package Actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverActions {
    private WebDriver driver;
    private String baseUrl;
    JavascriptExecutor jse;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        jse = (JavascriptExecutor)driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    public void name() throws InterruptedException {
        driver.get(baseUrl);
        // Прокрутить вниз
        jse.executeScript("window.scrollBy(0, 660)");
        Thread.sleep(2000);


        //навести на элемент с раскрывающим списком
        WebElement mainElement = driver.findElement(By.id("mousehover"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainElement).perform();
        Thread.sleep(2000);

        WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
        actions.moveToElement(subElement).click().perform();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        //driver.quit();
    }
}
