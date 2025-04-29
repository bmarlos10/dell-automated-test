package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitUtils;

public class SelectPriceOptionPage {

    public SelectPriceOptionPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='selectsilver']/following-sibling::span")
    WebElement silverOptionRadio;

    @FindBy(id = "nextsendquote")
    WebElement nextButton;

    public void selectPriceOption() {
        WaitUtils.waitForElementVisible(silverOptionRadio);
        silverOptionRadio.click();
        WaitUtils.customWait(500);

        nextButton.click();
        WaitUtils.customWait(1000);
    }
}
