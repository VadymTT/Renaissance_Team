package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCardElements extends AbstractBasePage {

    public ProductCardElements(WebDriver driver) {
        super(driver);
    }

    private static final String WISHLIST_BTN = "//button[@data-text='У бажання']";
    private static final String STORE_ADDRESS_FOR_DELIVERY_ROW =
            "//span[@class='p-block__title p-delivery__city']//span[@class='anchor--element']";
    private static final String ACTUAL_SELECTED_STORE_ADDRESS_ROW = "//div[@class='header__locations-street']/span";
    private static final String BUY_BTN = "(//button[@class='p-buy__btn btn btn--yellow'])[%s]";

    protected WebElement getWishlistBtn() {
        return waitUntilElementToBeClickable(WISHLIST_BTN);
    }

    protected WebElement getYourStoreAddressForDeliveryRow() {
        return waitUntilElementToBeVisibleByXpath(STORE_ADDRESS_FOR_DELIVERY_ROW);
    }

    public WebElement getActualSelectedStoreAddressRow() {
        return waitUntilElementToBeVisibleByXpath(ACTUAL_SELECTED_STORE_ADDRESS_ROW);
    }

    public WebElement getBuyBtn(String number) {
        return waitUntilElementToBeClickable(String.format(BUY_BTN, number));
    }
}
