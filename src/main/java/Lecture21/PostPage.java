package Lecture21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;

public class PostPage {
    public static final String PAGE_URL = "http://training.skillo-bg.com:4200/posts/create";
    private final WebDriver webDriver;

    public PostPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public boolean isImageVisible() {
        try {
            WebElement image = webDriver.findElement(By.cssSelector("img.image-preview"));
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            return wait.until(ExpectedConditions.visibilityOf(image)).isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getImageName() {
        WebElement imageTextElement = webDriver.findElement(By.cssSelector("input.input-lg"));
        String imageName = imageTextElement.getAttribute("placeholder");
        return imageName;
    }

    public void uploadPicture(File file) {
        WebElement uploadField = webDriver.findElement(By.cssSelector(".file[type='file']"));
        uploadField.sendKeys(file.getAbsolutePath());
    }

    public void populatePostCaption(String caption) {
        WebElement captionElement = webDriver.findElement(By.name("caption"));
        captionElement.sendKeys(caption);
    }

    public void clickCreatePost() {
        WebElement createPostButton = webDriver.findElement(By.id("create-post"));
        createPostButton.click();
    }

    public boolean isUrlLoaded() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.urlToBe(PostPage.PAGE_URL));
    }
}
