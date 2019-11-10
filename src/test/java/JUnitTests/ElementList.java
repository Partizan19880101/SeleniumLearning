package JUnitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ElementList {
    private WebDriver driver;
    private String baseUrl1;
    private GenericMethods2 gm;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl1 = "http://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        gm = new GenericMethods2(driver);
    }

    @Test
    public void name() {
        driver.get(baseUrl1);

        List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
        int size = elementList.size();
        System.out.println("Size of the element list " + size);



    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }




}
