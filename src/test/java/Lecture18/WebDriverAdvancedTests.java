package Lecture18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class WebDriverAdvancedTests {
    private WebDriver webDriver;
    @BeforeSuite
    protected final void setupTestSuite(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    @BeforeMethod
    protected final void setUpTest(){
        this.webDriver = new ChromeDriver();
        //this.webDriver = new EdgeDriver();
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    private final void tearDownTest(){
        if (this.webDriver != null) {
            this.webDriver.close();
        }
    }

    @Test
    public void testCheckbox() {
        this.webDriver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement labelCheckbox = this.webDriver.findElement(By.xpath("//*[@id='checkboxes']/label[text()='Option 1']"));
        // check
        labelCheckbox.click();

        WebElement checkbox = this.webDriver.findElement((By.xpath("//*[@id='checkboxes']/label[text()='Option 1']/input")));
        Assert.assertTrue(checkbox.isSelected(),"The checkbox is not selected");

        // Uncheck
        labelCheckbox.click();
        Assert.assertFalse(checkbox.isSelected(),"The checkbox is selected");
    }

    @Test
    public void testRadioButton() {
        /*
        Green
        Blue
        Yellow
        Orange
        Purple
         */

        this.webDriver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement radioButton = this.webDriver.findElement(By.xpath("//*[@id='radio-buttons']/input[@value='green']"));

        Assert.assertFalse(radioButton.isSelected(),"The radio button Green is selected");
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected(),"The radio button Green is not selected");

        // Add validations for rest of the radio buttons are not selected
    }

    @Test
    public void testSelect(){
        this.webDriver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Select dropDown = new Select(this.webDriver.findElement(By.id("dropdowm-menu-1")));

        List<WebElement> options = dropDown.getOptions();

        for (WebElement option : options){
            System.out.println(option.getText());
        }

        Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "JAVA");

        dropDown.selectByIndex(0);

        Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "JAVA");

        dropDown.selectByIndex(3);

        Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "SQL");
    }

    @Test
    public void testMouseHover() throws InterruptedException {
        this.webDriver.get("https://webdriveruniversity.com/Actions/index.html");
        WebElement buttonWithHover = this.webDriver.findElement(By.xpath("//*[@class='dropbtn'][text()='Hover Over Me Second!']"));

        Actions actions = new Actions(this.webDriver);

        actions.moveToElement(buttonWithHover).perform();
        //Thread.sleep(5000);
        // Check how to get the visible text under
    }

    @Test
    public void testTable(){
        this.webDriver.get("https://webdriveruniversity.com/Data-Table/index.html");
        WebElement table = this.webDriver.findElement(By.id("t01"));
        int indexLastNameColunm = 0;

        List<WebElement> tableHeaders = this.webDriver.findElements(By.xpath("//*[@id='t01']//th"));
        for (WebElement colunm : tableHeaders){
            String columnName = colunm.getText();
            if (columnName.equalsIgnoreCase("lastname")){
                indexLastNameColunm = tableHeaders.indexOf(colunm)+1;
                break;
            }
        }

        List<WebElement> firstNameRows =  this.webDriver.findElements(By.xpath("//*[@id='t01']//tr/td[1]"));
        int indexSearchedLastName = 0;
        for (WebElement row : firstNameRows){
            String firstName = row.getText();
            if (firstName.equalsIgnoreCase("jemma")){
                indexSearchedLastName = firstNameRows.indexOf(row)+2;
                break;
            }
        }

        WebElement lastName =  this.webDriver.findElement(By.xpath("//*[@id='t01']//tr["+indexSearchedLastName+"]/td["+indexLastNameColunm+"]"));
        System.out.println(lastName.getText());
        Assert.assertTrue(lastName.getText().equalsIgnoreCase("jackson"));
    }

    @Test
    public void testTableSecondOption(){
        this.webDriver.get("https://webdriveruniversity.com/Data-Table/index.html");
        WebElement table = this.webDriver.findElement(By.className("table table-light traversal-table"));

        WebElement headerRow = table.findElement(By.tagName("thead"));
        List<WebElement> headerElements = headerRow.findElements(By.tagName("th"));

        // get the index of column "First"

        WebElement  bodyRow = table.findElement(By.tagName("tbody"));
        List<WebElement> headerElementsOfBodyRows = bodyRow.findElements(By.tagName("th"));

        // get the first name of second row
        // locator for the name should have the td element and some indexes
    }

    @Test
    public void testAlert(){
        this.webDriver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
        this.webDriver.findElement(By.id("button4")).click();

        Alert alert = webDriver.switchTo().alert();
        System.out.println(alert.getText());
        //alert.accept();
        alert.dismiss();

        System.out.println(this.webDriver.findElement(By.id("confirm-alert-text")).getText());
    }
}
