package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {

    private static final int TIMEOUT = 10;

    public static void waitForElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
