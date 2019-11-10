package ProfileFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class ProfileFirefox {

    public static void main(String[] args) {
        String baseURL = "https://learn.letskodeit.com";
        WebDriver driver;

        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile fxProfile = profile.getProfile("automationprofile");

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(fxProfile);


        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }
}
