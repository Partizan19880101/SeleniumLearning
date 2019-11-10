package JUnitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class NavigatingBetweenPagesTest {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://learn.letskodeit.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void name() throws InterruptedException {
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("Title is " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentUrl);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";



        driver.navigate().to(urlToNavigate);
        System.out.println("Navigating to Login");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentUrl);


        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentUrl);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate Forward");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentUrl);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentUrl);

        driver.navigate().refresh();
        System.out.println("Navigate refresh");
        driver.get(currentUrl);
        System.out.println("Navigate refresh");

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }
}