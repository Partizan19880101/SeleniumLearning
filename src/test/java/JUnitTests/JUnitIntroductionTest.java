package JUnitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



public class JUnitIntroductionTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Executed before class");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("Executed after class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before");
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after");
    }

    @Test
    public void test1() {
        System.out.println("Executed test");
    }
    @Test
    public void test2() {
        System.out.println("Executed test2");
    }
}