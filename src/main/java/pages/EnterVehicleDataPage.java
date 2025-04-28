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

    @FindBy(id = "engineperformance")
    WebElement enginePerformanceInput;

    @FindBy(id = "nextenterinsurantdata")
    WebElement nextButton;

    public void fillVehicleData() {
        WaitUtils.waitForElementVisible(makeDropdown);
        makeDropdown.sendKeys("Audi");

        WaitUtils.waitForElementVisible(enginePerformanceInput);
        enginePerformanceInput.sendKeys("1200");

        WaitUtils.waitForElementVisible(nextButton);
        nextButton.click();
    }
}
