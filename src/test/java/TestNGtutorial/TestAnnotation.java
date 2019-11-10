package TestNGtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation {

    @BeforeMethod
    public void setUp() {
    }


    @Test
    public void testMethod2() {
        System.out.println("Running test-> test method 2");
    }
    @Test
    public void testMethod3() {
        System.out.println("Running test-> test method 3");
    }
    @Test
    public void aestMethod4() {
        System.out.println("Running test-> test method 4");
    }
    @Test
    public void aestMethod1() {
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        System.out.println("Running test-> test method 1");
    }

    @AfterMethod
    public void tearDown() {
    }
}