package Lecture14.Exercises.data.provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebPageContentTests {

    @DataProvider(name = "pageContentData")
    public Object[][] pageContentData() {
        return new Object[][]{
                {"Welcome to Our Store", "Welcome to Our Store", "Best Products", "Best Products", "Contact us at support@example.com", "Contact us at support@example.com"},
                {"Home", "Home", "New Arrivals", "New Arrivals", "Contact us at info@example.com", "Contact us at info@example.com"}
        };
    }

    @Test(dataProvider = "pageContentData")
    public void testPageContent(String actualTitle, String expectedTitle, String actualHeader, String expectedHeader, String actualFooter, String expectedFooter) {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualTitle, expectedTitle, "Page title is incorrect!");
        softAssert.assertEquals(actualHeader, expectedHeader, "Header is incorrect!");
        softAssert.assertEquals(actualFooter, expectedFooter, "Footer is incorrect!");

        softAssert.assertAll();
    }
}