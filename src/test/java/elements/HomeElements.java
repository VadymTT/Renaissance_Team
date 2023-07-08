package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    private static final String CONFIRMATION_OF_LOCATION_BUTTON = "//button[@class='btn btn--xsmall btn--white _lyk2tB _DE7oBo']";
    private static final String SEARCH_FIELD = "//input[@class='_JcImSJ']";
    private static final String SEARCH_BUTTON = "//button[@class='_cvO7u1']";
    private static final String CART_ICON_BUTTON = "//div[@class='header__cart']";
    private static final String EXPERT_SUPPORT_TITTLE = "//a[@title='Експертна підтримка']";
    private static final String CONFIRMATION_OF_ANOTHER_LOCATION_BTN = "//button[text()= 'інший']";
    private static final String TITTLE_OF_CATEGORY = "//a[@title='%s']";
    private static final String HEADER_LOGO = "//a[@class='header__logo']";
    private static final String CATALOG_BTN = "//div[@class='header__menu-opener-button']";
    private static final String LOGO_BUTTON = "//div[@class='nav']//a[@href='/store/man']";

    //home elements
    public WebElement getConfirmationOfLocationButton() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_LOCATION_BUTTON);
    }

    public WebElement getConfirmationOfAnotherLocationBtn() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_ANOTHER_LOCATION_BTN);
    }

    protected WebElement getExpertSupport() {
        return waitUntilElementToBeClickable(EXPERT_SUPPORT_TITTLE);
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

    public WebElement getCatalogBtn() {
        return waitUntilElementToBeVisibleByXpath(CATALOG_BTN);
    }

    protected WebElement getCategoryTittle(String category) {
        return waitUntilElementToBeVisibleByXpath(String.format(TITTLE_OF_CATEGORY, category));
    }

    public WebElement getHeaderLogo() {
        return waitUntilElementToBeVisibleByXpath(HEADER_LOGO);
    }

    protected WebElement getLogoBtn() {
        return waitUntilElementToBeClickable(LOGO_BUTTON);
    }

}
