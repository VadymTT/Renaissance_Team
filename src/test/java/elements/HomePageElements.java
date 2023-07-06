package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends AbstractBasePage {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String CONFIRMATION_OF_LOCATION_BUTTON = "//button[text()= 'інший']";
    private static final String TITTLE_OF_CATEGORY = "//a[@title='%s']";
    private static final String HEADER_LOGO = "//a[@class='header__logo']";
    private static final String CATALOG_BTN = "//div[@class='header__menu-opener-button']";
    private static final String SEARCH_FIELD = "//input[@placeholder='Пошук']";
    private static final String SEARCH_BTN = "//form[@data-is='Search']/button[@type='button']";
    private static final String CONSENT_LOCATION_BUTTON = "//button[@class='btn btn--xsmall btn--white _lyk2tB _DE7oBo']";

    public WebElement getConfirmationOfLocationButton() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_LOCATION_BUTTON);
    }

    public WebElement getCatalogBtn() {
        return waitUntilElementToBeVisibleByXpath(CATALOG_BTN);
    }

    protected WebElement getCategoryTittle(String category) {
        return waitUntilElementToBeVisibleByXpath(String.format(TITTLE_OF_CATEGORY, category));
    }

    public WebElement getHeaderLogo() {
        return waitUntilElementToBeVisibleByXpath(HEADER_LOGO);
    }

    public WebElement getSearchField() {
        return waitUntilElementToBeClickable(SEARCH_FIELD);
    }

    public WebElement getSearchBtn() {
        return waitUntilElementToBeClickable(SEARCH_BTN);
    }
}
