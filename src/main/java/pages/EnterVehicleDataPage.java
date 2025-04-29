package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
        makeDropdown.sendKeys("Audi");
        WaitUtils.customWait(500);

        modelDropdown.sendKeys("Scooter");
        WaitUtils.customWait(500);

        cylinderCapacityInput.sendKeys("1000");
        WaitUtils.customWait(500);

        enginePerformanceInput.sendKeys("1200");
        WaitUtils.customWait(500);

        dateOfManufactureInput.sendKeys("01/01/2020");
        WaitUtils.customWait(500);

        numberOfSeatsDropdown.sendKeys("2");
        WaitUtils.customWait(500);

        numberOfSeatsMotorcycleDropdown.sendKeys("2");
        WaitUtils.customWait(500);

        fuelTypeDropdown.sendKeys("Petrol");
        WaitUtils.customWait(500);

        payloadInput.sendKeys("500");
        WaitUtils.customWait(500);

        totalWeightInput.sendKeys("1500");
        WaitUtils.customWait(500);

        listPriceInput.sendKeys("30000");
        WaitUtils.customWait(500);

        licensePlateNumberInput.sendKeys("ABC1234");
        WaitUtils.customWait(500);

        annualMileageInput.sendKeys("15000");
        WaitUtils.customWait(500);

        nextButton.click();
        WaitUtils.customWait(1000);
    }
}
