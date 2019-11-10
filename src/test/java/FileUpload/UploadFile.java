package FileUpload;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
//import tutorialselenium.EnterPassword;

public class UploadFile {
    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        baseUrl = "https://gmail.com/";
        driver = new ChromeDriver();

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void fileUpload() throws AWTException, InterruptedException, IOException {
        driver.findElement(By.id("identifierId")).sendKeys("zuyonok88@gmail.com");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Partizan88"+ (Keys.ENTER)); // Enter your password
        //EnterPassword.enterPassword(driver); // Comment this
        //driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();

        //WebElement mailTo = null;
        WebElement addressLine =   driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'Кому')]"));
        addressLine.click();
        addressLine.sendKeys("zuyonok88@gmail.com");
        addressLine.sendKeys(Keys.ENTER);
        WebElement subjectLine =  driver.findElement(By.name("subjectbox"));

        subjectLine.click();
        subjectLine.sendKeys("Hi everyone");

        driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\Automation\\Selenium learning\\Script\\UploadFile.exe");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id=':op']")).click();
    }

    @AfterClass
    public void afterClass() {
    }

}
