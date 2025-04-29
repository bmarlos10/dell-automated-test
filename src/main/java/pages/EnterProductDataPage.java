package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitUtils;

public class EnterProductDataPage {

    public EnterProductDataPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(id = "startdate")
    WebElement startDateInput;

    @FindBy(id = "insurancesum")
    WebElement insuranceSumDropdown;

    @FindBy(id = "meritrating")
    WebElement meritRatingDropdown;

    @FindBy(id = "damageinsurance")
    WebElement damageInsuranceDropdown;

    @FindBy(xpath = "//input[@id='EuroProtection']/following-sibling::span")
    WebElement optionalProductCheckbox;

    @FindBy(id = "courtesycar")
    WebElement courtesyCarDropdown;

    @FindBy(id = "nextselectpriceoption")
    WebElement nextButton;

    public void fillProductData() {
        WaitUtils.waitForElementVisible(startDateInput);
        startDateInput.sendKeys("06/01/2025");
        WaitUtils.customWait(500);

        insuranceSumDropdown.sendKeys("3.000.000,00");
        WaitUtils.customWait(500);

        meritRatingDropdown.sendKeys("Bonus 1");
        WaitUtils.customWait(500);

        damageInsuranceDropdown.sendKeys("Full Coverage");
        WaitUtils.customWait(500);

        optionalProductCheckbox.click();
        WaitUtils.customWait(500);

        courtesyCarDropdown.sendKeys("Yes");
        WaitUtils.customWait(500);

        nextButton.click();
        WaitUtils.customWait(1000);
    }
}
