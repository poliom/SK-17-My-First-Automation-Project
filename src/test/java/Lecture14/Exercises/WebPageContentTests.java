package Lecture14.Exercises;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebPageContentTests {

    @Test
    public void testPageContent() {
        SoftAssert softAssert = new SoftAssert();

        String actualTitle = "Welcome to Our Store";
        String expectedTitle = "Welcome to Our Store";
        softAssert.assertEquals(actualTitle, expectedTitle, "Page title is incorrect!");

        String actualHeader = "Best Products";
        String expectedHeader = "Best Products";
        softAssert.assertEquals(actualHeader, expectedHeader, "Header is incorrect!");

        String actualFooter = "Contact us at support@example.com";
        String expectedFooter = "Contact us at support@example.com";
        softAssert.assertEquals(actualFooter, expectedFooter, "Footer is incorrect!");

        softAssert.assertAll();
    }
}