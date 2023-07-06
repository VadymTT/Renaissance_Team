package pages;

import elements.InformationPageElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class InformationPage extends InformationPageElements {
    public InformationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on support service button.")
    public InformationPage clickSupportServiceBtn() {
        getSupportServiceBtn().click();
        return this;
    }

    @Step("Click to open support service chat button.")
    public InformationPage clickSupportServiceChatBtn() {
        getSupportServiceChatBtn().click();
        return this;
    }

    @Step("Click on name input at the support service chat.")
    public InformationPage entryNameOnSupportServiceInput(String data) {
        getNameInputOnSupportService().sendKeys(data);
        return this;
    }

    @Step("Click on phone input at the support service chat.")
    public InformationPage entryPhoneOnSupportServiceInput(String data) {
        getPhoneInputOnSupportService().sendKeys(data);
        return this;
    }

    @Step("Click on email input at the support service chat.")
    public InformationPage entryEmailOnSupportServiceInput(String data) {
        getEmailInputOnSupportService().sendKeys(data);
        return this;
    }

    @Step("Click on 'Надіслати' button this form.")
    public InformationPage clickSendFormBtn() {
        getSendFormBtn().click();
        return this;
    }

    @Step("Close support service pop-up.")
    public InformationPage closeSupportServicePopup() {
        getCloseSupportServiceBtn().click();
        sleep(500);
        return this;
    }
}
