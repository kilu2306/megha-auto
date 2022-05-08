package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credential")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"", "123456", "An email address required."},
                {"abcd@gmail.com", " ", "Password is required."},
                {"adfdgfg", "123456 ", "Invalid email address."},
                {"abcd@gmail.com", "123456 ", "Authentication failed."},
        };
        return data;
    }

    @DataProvider(name = "cart")
    public Object[][] getData1() {
        Object[][] data1 = new Object[][]{

                { "Blouse","2","M","White"},
                { "White","3","L","Orange"},
                { "Blouse","4","S","Green"},
                { "Printed Summer Dress with Price $28.98","2","M","Blue"},

        };
        return data1;
    }
}
