package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    private static final String CONFIRMATION_OF_ANOTHER_LOCATION_BTN = "//button[text()= 'інший']";
    private static final String TITTLE_OF_CATEGORY = "//a[@title='%s']";
    private static final String HEADER_LOGO = "//a[@class='header__logo']";
    private static final String CATALOG_BTN = "//div[@class='header__menu-opener-button']";
    private static final String CONFIRMATION_OF_LOCATION_BTN = "//button[text()= 'Так']";

    public WebElement getConfirmationOfAnotherLocationBtn() {
        return waitUntilElementToBeVisibleByXpath(CONFIRMATION_OF_ANOTHER_LOCATION_BTN);
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

    protected WebElement getConformationOfLocationBtn() {
        return waitUntilElementToBeClickable(CONFIRMATION_OF_LOCATION_BTN);
    }
}
