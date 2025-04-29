package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtils;
import utils.DriverFactory;

public class SelectPriceOptionPage {

    @FindBy(xpath = "//input[@id='selectsilver']/following-sibling::span")
    WebElement silverOptionRadio;

    @FindBy(id = "nextsendquote")
    WebElement nextButton;

    public SelectPriceOptionPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void selectPriceOption() {
        ActionUtils.click(silverOptionRadio);
        ActionUtils.click(nextButton);
    }
}
