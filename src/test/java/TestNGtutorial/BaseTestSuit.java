package TestNGtutorial;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class BaseTestSuit {



    @BeforeClass
    public void beforeClass() {
        System.out.println("\nBaseTestSuite -> before class");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("\nBaseTestSuite -> after class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\nBaseTestSuite -> before test");
    }


    @AfterTest
    public void afterTest() {
        System.out.println("\nBaseTestSuite -> after test");
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("\nBaseTestSuite -> before suite");
    }


    @AfterSuite
    public void afterSuit() {
        System.out.println("\nBaseTestSuite -> after suite");
    }
}
