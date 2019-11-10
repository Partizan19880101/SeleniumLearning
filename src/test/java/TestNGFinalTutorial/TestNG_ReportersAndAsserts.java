package TestNGFinalTutorial;

import java.util.Arrays;

import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.Reporter;

public class TestNG_ReportersAndAsserts {

	@Test
	public void testStrings() {
		String actualString = "Test Reporters And Asserts";
		Reporter.log("The actual STRING us " + actualString, true);
		Assert.assertEquals(actualString, "Test Reporters And Asserts");
		Reporter.log("Verify yhe actual STRING with expected value", true);
		Reporter.log("");
	}
	
	@Test
	public void testInt() {
		int actualInt = 10;
		Reporter.log("The actual INT us " + actualInt, true);
		Assert.assertEquals(actualInt, 10);
		Reporter.log("Verify yhe actual INT with expected value", true);
		Reporter.log("");

	}
	
	@Test
	public void testArrays() {
		int[] actualArray = {1, 2, 3};
		int[] expectedArray = {1, 2, 2};
		Reporter.log("The actual array us " + actualArray, true);
		Assert.assertEquals(actualArray, expectedArray);
		Reporter.log("Verify yhe actual array with expected value", true);
		Reporter.log("");
	}

}
