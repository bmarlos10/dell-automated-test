package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtils;
import utils.DriverFactory;
import utils.WaitUtils;
import data.TestData;
import org.openqa.selenium.support.ui.Select;

public class EnterProductDataPage {

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

    public EnterProductDataPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void fillProductData() {
        WaitUtils.waitForElementVisible(startDateInput);
        ActionUtils.type(startDateInput, TestData.START_DATE);

        new Select(insuranceSumDropdown).selectByVisibleText(TestData.INSURANCE_SUM);
        new Select(meritRatingDropdown).selectByVisibleText(TestData.MERIT_RATING);
        new Select(damageInsuranceDropdown).selectByVisibleText(TestData.DAMAGE_INSURANCE);

        ActionUtils.click(optionalProductCheckbox);
        new Select(courtesyCarDropdown).selectByVisibleText(TestData.COURTESY_CAR);

        ActionUtils.click(nextButton);
    }
}
