package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends AbstractBasePage {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String CONFIRMATION_OF_LOCATION_BUTTON = "//button[text()= 'інший']";
    private static final String EXPERT_SUPPORT_TITTLE = "//a[@title='Експертна підтримка']";

    public WebElement getConfirmationOfLocationButton() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_LOCATION_BUTTON);
    }

    public WebElement getExpertSupport() {
        return waitUntilElementToBeClickable(EXPERT_SUPPORT_TITTLE);
    }
}
