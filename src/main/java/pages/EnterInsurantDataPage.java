package pages;

import data.TestData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtils;
import utils.DriverFactory;
import utils.WaitUtils;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantDataPage {

    public EnterInsurantDataPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(id = "firstname")
    WebElement firstNameInput;

    @FindBy(id = "lastname")
    WebElement lastNameInput;

    @FindBy(id = "birthdate")
    WebElement birthDateInput;

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

        ActionUtils.type(firstNameInput, TestData.FIRST_NAME);
        ActionUtils.type(lastNameInput, TestData.LAST_NAME);
        ActionUtils.type(birthDateInput, TestData.DATE_OF_BIRTH);
        ActionUtils.click(genderMaleRadio);
        ActionUtils.type(streetAddressInput, TestData.STREET_ADDRESS);
        new Select(countryDropdown).selectByVisibleText(TestData.COUNTRY);
        ActionUtils.type(zipCodeInput, TestData.ZIP_CODE);
        ActionUtils.type(cityInput, TestData.CITY);
        new Select(occupationDropdown).selectByVisibleText(TestData.OCCUPATION);
        ActionUtils.click(hobbySpeedingCheckbox);
        ActionUtils.click(nextButton);
    }
}
