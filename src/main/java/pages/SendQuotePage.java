package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionUtils;
import utils.DriverFactory;
import data.TestData;

public class SendQuotePage {

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

    public SendQuotePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void fillAndSendQuote() {
        ActionUtils.type(emailInput, TestData.EMAIL);
        ActionUtils.type(phoneInput, TestData.PHONE);
        ActionUtils.type(usernameInput, TestData.USERNAME);
        ActionUtils.type(passwordInput, TestData.PASSWORD);
        ActionUtils.type(confirmPasswordInput, TestData.PASSWORD);
        ActionUtils.click(sendButton);
    }
}
