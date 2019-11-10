package JUnitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class BasicActionsTest {
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
    public void name() {
        driver.get(baseURL);
        driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
        System.out.println("Click on login");
        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("zuyonok@mail.ru");
        System.out.println("Enter Email");
        driver.findElement(By.id("user_password")).sendKeys("Partizan88");
        System.out.println("Enter Password");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        System.out.println("Clock Log in");
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}