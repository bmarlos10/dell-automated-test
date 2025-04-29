package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utils.DriverFactory;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class FormSteps {

    EnterVehicleDataPage vehicleDataPage;
    EnterInsurantDataPage insurantDataPage;
    EnterProductDataPage productDataPage;
    SelectPriceOptionPage priceOptionPage;
    SendQuotePage sendQuotePage;

    @Before
    public void setUp() {
        DriverFactory.getDriver().get("http://sampleapp.tricentis.com/101/app.php");
    }

    @Given("I open the application page")
    public void i_open_the_application_page() {
        vehicleDataPage = new EnterVehicleDataPage();
        insurantDataPage = new EnterInsurantDataPage();
        productDataPage = new EnterProductDataPage();
        priceOptionPage = new SelectPriceOptionPage();
        sendQuotePage = new SendQuotePage();
    }

    @When("I fill out all forms and submit")
    public void i_fill_out_all_forms_and_submit() {
        vehicleDataPage.fillVehicleData();
        insurantDataPage.fillInsurantData();
        productDataPage.fillProductData();
        priceOptionPage.selectPriceOption();
        sendQuotePage.fillAndSendQuote();
    }

    @Then("I should see the success message")
    public void i_should_see_the_success_message() {
        WebDriver driver = DriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(), 'Sending e-mail success!')]")
        ));

        assertTrue(successMessage.isDisplayed());
    }

    @After
    public void tearDown() {
        DriverFactory.closeDriver();
    }
}
