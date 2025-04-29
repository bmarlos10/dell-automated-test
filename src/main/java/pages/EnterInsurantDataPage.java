package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitUtils;

public class EnterInsurantDataPage {

    public EnterInsurantDataPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(id = "firstname")
    WebElement firstNameInput;

    @FindBy(id = "lastname")
    WebElement lastNameInput;

    @FindBy(id = "birthdate")
    WebElement birthdateInput;

    @FindBy(xpath = "//input[@id='gendermale']/following-sibling::span")
    WebElement genderMaleRadio;

    @FindBy(id = "streetaddress")
    WebElement streetAddressInput;

    @FindBy(id = "country")
    WebElement countryDropdown;

    @FindBy(id = "zipcode")
    WebElement zipCodeInput;

    @FindBy(id = "city")
    WebElement cityInput;

    @FindBy(id = "occupation")
    WebElement occupationDropdown;

    @FindBy(xpath = "//input[@id='speeding']/following-sibling::span")
    WebElement hobbySpeedingCheckbox;

    @FindBy(id = "nextenterproductdata")
    WebElement nextButton;

    public void fillInsurantData() {
        WaitUtils.waitForElementVisible(firstNameInput);
        firstNameInput.sendKeys("John");
        WaitUtils.customWait(500);

        lastNameInput.sendKeys("Doe");
        WaitUtils.customWait(500);

        birthdateInput.sendKeys("01/01/1990");
        WaitUtils.customWait(500);

        genderMaleRadio.click();
        WaitUtils.customWait(500);

        streetAddressInput.sendKeys("123 Main Street");
        WaitUtils.customWait(500);

        countryDropdown.sendKeys("Brazil");
        WaitUtils.customWait(500);

        zipCodeInput.sendKeys("70000000");
        WaitUtils.customWait(500);

        cityInput.sendKeys("Brasilia");
        WaitUtils.customWait(500);

        occupationDropdown.sendKeys("Employee");
        WaitUtils.customWait(500);

        hobbySpeedingCheckbox.click();
        WaitUtils.customWait(500);

        nextButton.click();
        WaitUtils.customWait(1000);
    }
}
