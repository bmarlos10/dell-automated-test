package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitUtils;

public class SendQuotePage {

    public SendQuotePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "phone")
    WebElement phoneInput;

    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "confirmpassword")
    WebElement confirmPasswordInput;

    @FindBy(id = "sendemail")
    WebElement sendButton;

    public void fillAndSendQuote() {
        WaitUtils.waitForElementVisible(emailInput);
        emailInput.sendKeys("john.doe@example.com");
        WaitUtils.customWait(500);

        phoneInput.sendKeys("1234567890");
        WaitUtils.customWait(500);

        usernameInput.sendKeys("johndoe");
        WaitUtils.customWait(500);

        passwordInput.sendKeys("Test@1234"); // ✅ senha forte
        WaitUtils.customWait(500);

        confirmPasswordInput.sendKeys("Test@1234"); // ✅ confirmação igual
        WaitUtils.customWait(500);

        sendButton.click();
        WaitUtils.customWait(3000); // esperar o envio
    }

}
