package TestNGtutorial;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import TestNGtutorial.SomeClassToTest;

public class TestNG_DeprndentTests {

    SomeClassToTest obj;


    @BeforeClass

    public void setUp() {
        obj = new SomeClassToTest();
        System.out.println("before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("after class");
    }

    @Test(dependsOnMethods = { "testMethod2" }, alwaysRun = true)
    public void testMethod1() {
        System.out.println("TestMethod1");

    }
    @Test
    public void testMethod2() {
        System.out.println("TestMethod2");
        int result = obj.sumNumbers(1,2);
        Assert.assertEquals(result,3);
    }
    @Test(dependsOnMethods = { "testMethod1" }, alwaysRun = true)
    public void testMethod3() {
        System.out.println("TestMethod3");
    }
    @Test(dependsOnMethods = { "testMethod3" }, alwaysRun = true)
    public void testMethod4() {
        System.out.println("TestMethod4");
    }
}
