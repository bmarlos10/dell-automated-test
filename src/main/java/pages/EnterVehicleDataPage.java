package pages;

import data.TestData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ActionUtils;
import utils.DriverFactory;
import utils.WaitUtils;

public class EnterVehicleDataPage {

    public EnterVehicleDataPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(id = "make")
    WebElement makeDropdown;

    @FindBy(id = "model")
    WebElement modelDropdown;

    @FindBy(id = "cylindercapacity")
    WebElement cylinderCapacityInput;

    @FindBy(id = "engineperformance")
    WebElement enginePerformanceInput;

    @FindBy(id = "dateofmanufacture")
    WebElement dateOfManufactureInput;

    @FindBy(id = "numberofseats")
    WebElement numberOfSeatsDropdown;

    @FindBy(id = "numberofseatsmotorcycle")
    WebElement numberOfSeatsMotorcycleDropdown;

    @FindBy(id = "fuel")
    WebElement fuelTypeDropdown;

    @FindBy(id = "payload")
    WebElement payloadInput;

    @FindBy(id = "totalweight")
    WebElement totalWeightInput;

    @FindBy(id = "listprice")
    WebElement listPriceInput;

    @FindBy(id = "licenseplatenumber")
    WebElement licensePlateNumberInput;

    @FindBy(id = "annualmileage")
    WebElement annualMileageInput;

    @FindBy(id = "nextenterinsurantdata")
    WebElement nextButton;

    public void fillVehicleData() {
        WaitUtils.waitForElementVisible(makeDropdown);

        new Select(makeDropdown).selectByVisibleText(TestData.MAKE);
        new Select(modelDropdown).selectByVisibleText(TestData.MODEL);
        ActionUtils.type(cylinderCapacityInput, TestData.CYLINDER_CAPACITY);
        ActionUtils.type(enginePerformanceInput, TestData.ENGINE_PERFORMANCE);
        ActionUtils.type(dateOfManufactureInput, TestData.DATE_OF_MANUFACTURE);
        new Select(numberOfSeatsDropdown).selectByVisibleText(TestData.NUMBER_OF_SEATS);
        new Select(numberOfSeatsMotorcycleDropdown).selectByVisibleText(TestData.NUMBER_OF_SEATS_MOTORCYCLE); // <- AQUI
        new Select(fuelTypeDropdown).selectByVisibleText(TestData.FUEL_TYPE);
        ActionUtils.type(payloadInput, TestData.PAYLOAD);
        ActionUtils.type(totalWeightInput, TestData.TOTAL_WEIGHT);
        ActionUtils.type(listPriceInput, TestData.LIST_PRICE);
        ActionUtils.type(licensePlateNumberInput, TestData.LICENSE_PLATE_NUMBER);
        ActionUtils.type(annualMileageInput, TestData.ANNUAL_MILEAGE);

        ActionUtils.click(nextButton);
    }
}
