package ReportDifferentClass;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    ExtentTest test;
    WebDriver driver = null;

    public HomePage(WebDriver driver, ExtentTest test){
        this.driver = driver;
        this.test = test;
    }

    public void loginLink(){
        WebElement loginLink = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
        loginLink.click();
        test.log(LogStatus.INFO, "Clicked on logi link");
    }
    public void emailField(String email){
        WebElement emailField = driver.findElement(By.id("user_email"));
        emailField.sendKeys(email);
        test.log(LogStatus.INFO, "Enter email");
    }
    public void passwordField(String password){
        WebElement passwordField = driver.findElement(By.id("user_password"));
        passwordField.sendKeys(password);
        test.log(LogStatus.INFO, "Enter password");
    }
    public void goButton(){
        WebElement goButton = driver.findElement(By.xpath("//input[@name='commit']"));
        goButton.click();
        test.log(LogStatus.INFO, "Clicked Go button");
    }
    public boolean isWelcomTextPresent(){
        WebElement welcomeText = null;
        try {
            welcomeText = driver.findElement(By.xpath("//input[@id='search-courses']"));
            if (welcomeText != null){
                return true;
            }
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }
    public void login(String email, String password){
        loginLink();
        emailField(email);
        passwordField(password);
        goButton();
    }
}
