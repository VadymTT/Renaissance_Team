package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterElements extends AbstractBasePage {
    public RegisterElements(WebDriver driver) {
        super(driver);
    }

    private static final String LOGIN_POPUP = "//div[@id='popup-login']";
    private static final String CLOSE_POPUP_BTN = "//div[@id='popup-login']//button[@title='Close']";

    public WebElement getLoginPopUp() {
        return waitUntilElementToBeVisibleByXpath(LOGIN_POPUP);
    }

    protected WebElement getClosePopUpBtn() {
        return waitUntilElementToBeClickable(CLOSE_POPUP_BTN);
    }
}
