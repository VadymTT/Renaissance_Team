package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartElements extends AbstractBasePage {

    public ShoppingCartElements(WebDriver driver) {
        super(driver);
    }

    private static final String STORE_ADDRESS_IN_CART = "//div[@class='header__locations-street is-light']/span";
    private static final String COMPLETE_PURCHASE = "//button[contains(text(), 'Оформити покупку')]";

    public WebElement getStoreAddressInCart() {
        return waitUntilElementToBeVisibleByXpath(STORE_ADDRESS_IN_CART);
    }

    public WebElement getCompletePurchaseBtn() {
        return waitUntilElementToBeClickable(COMPLETE_PURCHASE);
    }
}
