package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPageElements extends AbstractBasePage {
    public InformationPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SUPPORT_SERVICE_BTN = "//div[@data-b24-crm-button-icon='openline']";
    private static final String SUPPORT_SERVICE_CHAT_BTN = "//a[@data-b24-crm-button-widget='openline_livechat']";
    private static final String SUPPORT_SERVICE_CHAT_POPUP = "//div[@class='bx-livechat-box']";
    private static final String NAME_INPUT_ON_SUPPORT_SERVICE = "//div[@class='b24-form-control-container b24-form-control-icon-after']" +
            "/input[@name='name']";
    private static final String PHONE_INPUT_ON_SUPPORT_SERVICE = "//div[@class='b24-form-control-container b24-form-control-icon-after']" +
            "/input[@name='phone']";
    private static final String EMAIL_INPUT_ON_SUPPORT_SERVICE = "//div[@class='b24-form-control-container b24-form-control-icon-after']" +
            "/input[@name='email']";
    private static final String MUST_ENTRY_NAME_ERROR_MESSAGE ="//input[@name='name']//..//div[@class='b24-form-control-alert-message' " +
            "and contains(text(), 'Поле обов')]";
    private static final String MUST_ENTRY_PHONE_ERROR_MESSAGE ="//input[@name='phone']//..//div[@class='b24-form-control-alert-message' " +
            "and contains(text(), 'Поле обов')]";
    private static final String ENTRY_WRONG_ERROR_MESSAGE ="//input[@name='email']//..//div[@class='b24-form-control-alert-message' " +
            "and contains(text(), 'неправильний')]";


    public WebElement getSupportServiceBtn() {
        return waitUntilElementToBeVisibleByXpath(SUPPORT_SERVICE_BTN);
    }

    public WebElement getSupportServiceChatBtn() {
        return waitUntilElementToBeVisibleByXpath(SUPPORT_SERVICE_CHAT_BTN);
    }

    public WebElement getSupportServicePopUp() {
        return waitUntilElementToBeVisibleByXpath(SUPPORT_SERVICE_CHAT_POPUP);
    }

    public WebElement getNameInputOnSupportService() {
        return waitUntilElementToBeClickable(NAME_INPUT_ON_SUPPORT_SERVICE);
    }

    public WebElement getPhoneInputOnSupportService() {
        return waitUntilElementToBeClickable(PHONE_INPUT_ON_SUPPORT_SERVICE);
    }

    public WebElement getEmailInputOnSupportService() {
        return waitUntilElementToBeClickable(EMAIL_INPUT_ON_SUPPORT_SERVICE);
    }
    public WebElement getErrorMessageMustEntryName() {
        return waitUntilElementToBeVisibleByXpath(MUST_ENTRY_NAME_ERROR_MESSAGE);
    }public WebElement getErrorMessageMustEntryPhone() {
        return waitUntilElementToBeVisibleByXpath(MUST_ENTRY_PHONE_ERROR_MESSAGE);
    }public WebElement getErrorMessageEntryWrong() {
        return waitUntilElementToBeVisibleByXpath(ENTRY_WRONG_ERROR_MESSAGE);
    }
}
