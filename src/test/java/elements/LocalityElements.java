package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocalityElements extends AbstractBasePage {

    public LocalityElements(WebDriver driver) {
        super(driver);
    }

    private static final String ENTER_CITY_NAME = "//input[@class='input _MGeWxP _FeIEJW']\n";
    private static final String LOCALITY_OF_CITY =
            "(//div[@class='scroll _efdMLb']/div[@data-test='search-city-items'])[%s]";
    private static final String STORE_ADDRESS_OF_SELECTED_LOCALITY =
            "(//div[@class='_Xv5ePK']//div[@data-store-address])[1]";
    private static final String SELECT_STORE_BUTTON = "(//button[@data-select-location])[%s]";
    private static final String ACTUAL_SELECTED_STORE_ADDRESS = "//div[@class='header__locations-street']/span";

    public WebElement getInputCityName() {
        return waitUntilElementToBeVisibleByXpath(ENTER_CITY_NAME);
    }

    public WebElement getLocalityOfCity(String number) {
        return waitUntilElementToBeClickable(String.format(LOCALITY_OF_CITY, number));
    }

    public WebElement getStoreAddressOfSelectedLocality() {
        return waitUntilElementToBeClickable(STORE_ADDRESS_OF_SELECTED_LOCALITY);
    }

    public WebElement getSelectStoreBtn(String number) {
        return waitUntilElementToBeClickable(String.format(SELECT_STORE_BUTTON, number));
    }

    public WebElement getActualSelectedStoreAddress() {
        return waitUntilElementToBeVisibleByXpath(ACTUAL_SELECTED_STORE_ADDRESS);
    }
}
