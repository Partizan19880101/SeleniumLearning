package TestNGtutorial;

import org.testng.annotations.DataProvider;

public class TestData {



    @DataProvider(name = "inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"Partizan", "Partizan88"},
                {"zuyonok@mail", "zuyonok@mail.ru"},
                {"benz", "300"}
        };
    }


}
