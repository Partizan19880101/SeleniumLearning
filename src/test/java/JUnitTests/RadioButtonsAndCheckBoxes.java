package JUnitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonsAndCheckBoxes {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://learn.letskodeit.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);


    }

    @Test
    public void test() throws Exception{
        WebElement bmwRadioBtn = driver.findElement(By.xpath("//input[@id='bmwradio']"));
        bmwRadioBtn.click();

        Thread.sleep(2000);
        WebElement benzRadioBtn = driver.findElement(By.xpath("//input[@id='benzradio']"));
        benzRadioBtn.click();
        Thread.sleep(2000);
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();
        Thread.sleep(2000);
        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();

        System.out.println("BMW Radio is selecter " + bmwRadioBtn.isSelected());
        System.out.println("Benz Radio is selecter " + benzRadioBtn.isSelected());
        System.out.println("BMW Radio is selecter " + bmwCheckBox.isSelected());
        System.out.println("Benz Radio is selecter " + benzCheckBox.isSelected());
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        //driver.quit();
    }
}