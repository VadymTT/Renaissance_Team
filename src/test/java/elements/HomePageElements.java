package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends AbstractBasePage {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String CONFIRMATION_OF_LOCATION_BUTTON = "//button[@class='btn btn--xsmall btn--white _lyk2tB _DE7oBo']";
    private static final String SEARCH_FIELD = "//input[@class='_JcImSJ']";
    private static final String SEARCH_BUTTON = "//button[@class='_cvO7u1']";
    private static final String CART_ICON_BUTTON = "//div[@class='header__cart']";

    //home elements
    public WebElement getConfirmationOfLocationButton() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_LOCATION_BUTTON);
    }

    public WebElement getCartIconButton() {
        return waitUntilElementToBeClickable(CART_ICON_BUTTON);
    }

    //search field elements
    public WebElement getSearchField() {
        return waitUntilElementToBeVisibleByXpath(SEARCH_FIELD);
    }

    public WebElement getSearchButton() {
        return waitUntilElementToBeVisibleByXpath(SEARCH_BUTTON);
    }
}
