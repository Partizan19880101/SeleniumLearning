package TestNGtutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.security.pkcs11.P11Util;

public class TestNG_DataProviders {


    /*@DataProvider(name = "inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"Partizan", "Partizan88"},
                {"zuyonok@mail", "zuyonok@mail.ru"},
                {"benz", "300"}
        };
    }*/


    @Test(dataProvider = "inputs", dataProviderClass = TestData.class)
    public void testMethod1(String input1, String input2) {
        System.out.println("Input 1:" + input1);
        System.out.println("Input 2:" + input2);
    }
}
