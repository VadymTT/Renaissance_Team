package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocalityElements extends AbstractBasePage {

    public LocalityElements(WebDriver driver) {
        super(driver);
    }

    private static final String ENTER_CITY_NAME_FIELD = "//input[@class='input _MGeWxP _FeIEJW']\n";
    private static final String LOCALITY_OF_CITY_FIELD =
            "(//div[@class='scroll _efdMLb']/div[@data-test='search-city-items'])[%s]";
    private static final String STORE_ADDRESS_OF_SELECTED_LOCALITY_ROW =
            "(//div[@class='_Xv5ePK']//div[@data-store-address])[1]";
    private static final String SELECT_STORE_BTN = "(//button[@data-select-location])[%s]";
    private static final String ACTUAL_SELECTED_STORE_ADDRESS_ROW = "//div[@class='header__locations-street']/span";

    public WebElement getCityNameField() {
        return waitUntilElementToBeVisibleByXpath(ENTER_CITY_NAME_FIELD);
    }

    public WebElement getLocalityOfCityRow(String number) {
        return waitUntilElementToBeClickable(String.format(LOCALITY_OF_CITY_FIELD, number));
    }

    public WebElement getStoreAddressOfSelectedLocalityRow() {
        return waitUntilElementToBeClickable(STORE_ADDRESS_OF_SELECTED_LOCALITY_ROW);
    }

    public WebElement getSelectStoreBtn(String number) {
        return waitUntilElementToBeClickable(String.format(SELECT_STORE_BTN, number));
    }

    public WebElement getActualSelectedStoreAddressRow() {
        return waitUntilElementToBeVisibleByXpath(ACTUAL_SELECTED_STORE_ADDRESS_ROW);
    }
}
