package TestNGtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_NG_TestClass2 extends BaseTestSuit{

    @BeforeClass
    public void setUp(){
        System.out.println("TestNG_TestClass2 runs once before class");
    }
    @AfterClass
    public void cleanUp(){
        System.out.println("TestNG_TestClass2 runs once after class");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("TestNG_TestClass2 runs before every method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("TestNG_TestClass2 runs after every method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Running Test -> TestNG_TestClass2-> testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test ->TestNG_TestClass2-> testMethod2");
    }

}
