package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private static final int TIMEOUT_SECONDS = 10;

    public static void waitForElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT_SECONDS));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void customWait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
