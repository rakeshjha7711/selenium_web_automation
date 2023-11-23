package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a webpage
            driver.get("https://www.example.com");

            // Perform some actions (e.g., click a button or fill a form)
            driver.findElement(By.linkText("Click Here")).click();

            // Take a screenshot after the actions
            takeScreenshot(driver, "screenshot_after_actions.png");
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    public static void takeScreenshot(WebDriver driver, String fileName) {
        // Check if the driver supports taking screenshots
        if (driver instanceof TakesScreenshot) {
            // Convert the driver to TakesScreenshot
            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

            // Capture the screenshot as a file
            File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

            // Specify the destination for the screenshot
            File destinationFile = new File(fileName);

            try {
                // Copy the captured screenshot to the specified destination
                FileUtils.copyFile(screenshotFile, destinationFile);
                System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Failed to capture screenshot: " + e.getMessage());
            }
        } else {
            System.err.println("Driver does not support taking screenshots");
        }
    }
}
