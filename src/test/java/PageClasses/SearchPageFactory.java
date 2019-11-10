package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver;


    @FindBy(id="primary-header-flight")
    WebElement headerHistory;
    @FindBy(id="tab-flight-tab-flp")
    WebElement flightsTab;
    @FindBy(id="flight-origin-flp")
    WebElement originCity;

    @FindBy(id="flight-destination-flp")
    WebElement destinationCity;
    @FindBy(id="flight-departing-flp")
    WebElement departureDate;
    @FindBy(id="flight-returning-flp")
    WebElement returnDate;
    @FindBy(xpath="//div[@class='cols-nested ab25184-submit']//button[@class='btn-primary btn-action gcw-submit']")
    WebElement findValue;

    public SearchPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickFlightsTab(){
        headerHistory.click();
        flightsTab.click();

    }
    public void setOriginCity(String origin){
        originCity.sendKeys(origin);
    }

    public void setDestinationCity(String destination){
        destinationCity.sendKeys(destination);
    }
    public void setdepartureDate(String destination){
        departureDate.sendKeys(destination);
    }
    public void setreturnDate(String destination){
        returnDate.sendKeys(destination);
    }
    public void clickfindValue(){
        findValue.click();
    }

}
