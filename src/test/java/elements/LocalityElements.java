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
    private static final String CLOSE_REGIONAL_BANNER_BTN = "//div[@class='_lf1rdL']";
    private static final String PROFITABLY_BUY_BTN = "//a[contains(text(), 'Вигідно купити')]";
    private static final String BUY_BTN = "(//button[@class='p-buy__btn btn btn--yellow'])[%s]";
    private static final String COMPLETE_PURCHASE = "//button[contains(text(), 'Оформити покупку')]";
    private static final String ACTUAL_SELECTED_STORE_ADDRESS = "//div[@class='header__locations-street']/span";
    private static final String STORE_ADDRESS_FOR_DELIVERY =
            "//span[@class='p-block__title p-delivery__city']//span[@class='anchor--element']";
    private static final String STORE_ADDRESS_IN_CART = "//div[@class='header__locations-street is-light']/span";
    private static final String PLACEHOLDER_STORE_ADDRESS_FOR_ORDERING = "//div[@class='_ijOwLq']/input";

    public WebElement getInputCityName() {
        return waitUntilElementToBeVisibleByXpath(ENTER_CITY_NAME);
    }

    public WebElement getLocalityOfCity(String number) {
        return waitUntilElementToBeClickable(String.format(LOCALITY_OF_CITY, number));
    }

    public WebElement getStoreAddressOfSelectedLocality() {
        return waitUntilElementToBeClickable(STORE_ADDRESS_OF_SELECTED_LOCALITY);
    }

    public WebElement  getSelectStoreBtn(String number) {
        return waitUntilElementToBeClickable(String.format(SELECT_STORE_BUTTON, number));
    }

    public WebElement getCloseRegionalBannerBtn() {
        return waitUntilElementToBeClickable(CLOSE_REGIONAL_BANNER_BTN);
    }

    public WebElement getProfitablyBuyBtn() {
        return waitUntilElementToBeClickable(PROFITABLY_BUY_BTN);
    }

    public WebElement getBuyBtn(String number) {
        return waitUntilElementToBeClickable(String.format(BUY_BTN, number));
    }

    public WebElement getCompletePurchaseBtn() {
        return waitUntilElementToBeClickable(COMPLETE_PURCHASE);
    }

    public WebElement getActualSelectedStoreAddress() {
        sleep(3);
        return waitUntilElementToBeVisibleByXpath(ACTUAL_SELECTED_STORE_ADDRESS);
    }

    public WebElement getYourStoreAddressForDelivery() {
        return waitUntilElementToBeVisibleByXpath(STORE_ADDRESS_FOR_DELIVERY);
    }

    public WebElement getStoreAddressInCart() {
        return waitUntilElementToBeVisibleByXpath(STORE_ADDRESS_IN_CART);
    }

    public WebElement getPlaceholderStoreAddressForOrdering() {
        return waitUntilElementToBeVisibleByXpath(PLACEHOLDER_STORE_ADDRESS_FOR_ORDERING);
    }
}
