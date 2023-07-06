package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    private static final String CONFIRMATION_OF_ANOTHER_LOCATION_BUTTON = "//button[text()= 'інший']";

    public WebElement getConfirmationOfAnotherLocationButton() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_ANOTHER_LOCATION_BUTTON);
    }
}
