package TechnicalTask;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationUser {
    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;
    //SearchPageFactory searchPage;

    @Test
    public void registrationUser() throws InterruptedException {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        baseUrl = "https://dev2.revetinc.com/";

        //searchPage = new SearchPageFactory(driver);

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);//open base URL
        driver.findElement(By.xpath("//a[@class='btn btn-primary padding-horizontal-50']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Pavel");//send First Name
        driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("ZJuyonok");//send Last Name
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("g98jog6f@gmail.com");// send Email
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("QweasHdzxc1/");//send password
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
        //driver.findElement(By.xpath("//input[@id='ms1']")).selectByVisibleText("Germany");d
        //
        driver.findElement(By.name("zipCode")).sendKeys("220000");
        WebElement dropdown = driver.findElement(By.id("ms1"));
        dropdown.sendKeys("Belarus");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Job Title']")).sendKeys("QA Engineer");
        driver.findElement(By.xpath("//input[@placeholder='Company *']")).sendKeys("OnePoint LTD");

        driver.findElement(By.xpath("//input[@placeholder='Start Date *']")).click();
        driver.findElement(By.xpath("//div[@class='form-with-remove']//div[1]//dp-date-picker[1]//div[2]//div[1]//dp-month-calendar[1]//div[1]//div[1]//div[1]//button[3]")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-link margin-top-25']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-link margin-top-25']")).click();


        driver.findElement(By.xpath("//button[@class='btn btn-link margin-top-25']")).click();//foto
        driver.findElement(By.xpath("//span[contains(text(),'Not actively looking but open to discussion')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//span[@class='text-primary']")).click();

}
    @After
    public void afterClass() {
    }
}
