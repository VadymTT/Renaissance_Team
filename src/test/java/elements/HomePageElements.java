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
    private static final String TITTLE_OF_CATEGORY = "//a[@title='%s']";
    private static final String HEADER_LOGO = "//a[@class='header__logo']";
    private static final String CATALOG_BTN = "//div[@class='header__menu-opener-button']";
    private static final String LOGO_BUTTON = "//div[@class='nav']//a[@href='/store/man']";
    private static final String CATALOG_OPEN_BTN = "/..//a[@class='nav__heading'][contains(@href,'vzutta')]";

    public WebElement getConfirmationOfLocationButton() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_LOCATION_BUTTON);
    }

    protected WebElement getExpertSupport() {
        return waitUntilElementToBeClickable(EXPERT_SUPPORT_TITTLE);
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

    protected WebElement catalogOpenerBtn() {
        return waitUntilElementToBeClickable(CATALOG_OPEN_BTN);
    }
}
