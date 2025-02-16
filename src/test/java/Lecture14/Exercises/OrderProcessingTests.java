package Lecture14.Exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderProcessingTests {

    @Test
    public void testOrderStatus() {
        String actualStatus = "Processed";
        String expectedStatus = "Processed";
        Assert.assertEquals(actualStatus, expectedStatus, "Order status is incorrect!");
    }

    @Test
    public void testTotalPrice() {
        double actualTotalPrice = 99.99;
        double expectedTotalPrice = 99.99;
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total price is incorrect!");
    }
}
