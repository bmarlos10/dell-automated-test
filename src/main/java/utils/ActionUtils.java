package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionUtils {

    private static final int DEFAULT_WAIT = 1000;

    public static void type(WebElement element, String text) {
        WaitUtils.customWait(DEFAULT_WAIT);
        element.clear();
        element.sendKeys(text);
    }

    public static void click(WebElement element) {
        WaitUtils.customWait(DEFAULT_WAIT);
        element.click();
    }

    public static boolean waitForTextToBeVisible(String text) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(), '" + text + "')]")
        ));
        return element.isDisplayed();
    }
}
