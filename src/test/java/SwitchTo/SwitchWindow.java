package SwitchTo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {
    private WebDriver driver;
    private String baseUrl;


    @Before
public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://learn.letskodeit.com/p/practice";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get(baseUrl);
}

    @Test
    public void name() throws InterruptedException{
        /*WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");*/

        //Get the Handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle " + parentHandle);

        //Find open window button
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles){
            System.out.println(handle);
            if (!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchBox = driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");
                Thread.sleep(2000);
                driver.close();
                break;
            }
        }

        //Switch back to the parent Window
        driver.switchTo().window(parentHandle);
        WebElement input = driver.findElement(By.id("name"));
        input.sendKeys("Something ");
        driver.findElement(By.id("name")).sendKeys(" fuck");


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        //driver.quit();
    }
}