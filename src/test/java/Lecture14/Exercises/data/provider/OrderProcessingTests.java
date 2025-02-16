package Lecture14.Exercises.data.provider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrderProcessingTests {

    @DataProvider(name = "orderStatusData")
    public Object[][] orderStatusData() {
        return new Object[][]{
                {"Processed", "Processed"},
                {"Pending", "Pending"},
                {"Shipped", "Shipped"}
        };
    }

    @Test(dataProvider = "orderStatusData")
    public void testOrderStatus(String actualStatus, String expectedStatus) {
        Assert.assertEquals(actualStatus, expectedStatus, "Order status is incorrect!");
    }

    @DataProvider(name = "totalPriceData")
    public Object[][] totalPriceData() {
        return new Object[][]{
                {99.99, 99.99},
                {49.99, 49.99},
                {0.0, 0.0}
        };
    }

    @Test(dataProvider = "totalPriceData")
    public void testTotalPrice(double actualTotalPrice, double expectedTotalPrice) {
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total price is incorrect!");
    }
}