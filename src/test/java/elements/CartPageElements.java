package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageElements extends AbstractBasePage {
    public CartPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String DELETE_BTN= "(//button[@class='basket-product__del--link'])[2]";
    private static final String CLOSE_BTN = "//button[@class='fancybox-button fancybox-close-small']";
    private static final String DELETE_ALL_PRODUCTS = "//a[@id='js-trigger-del']";
    private static final String REMOVE_FROM_CART_VERIFICATION_CLOSE_BTN = "(//button[@class='fancybox-button fancybox-close-small'])[2]";
    private static final String NO_BUTTON_IN_VERIFICATION_DELETE = "//button[@data-remodal-action='cancel']";
    private static final String MAKE_PURCHASE = "//button[@class='purchase-btn btn btn--1 btn--blue']";

    public WebElement getDeleteButton() {
        return waitUntilElementToBeClickable(DELETE_BTN);
    }

    public WebElement getCloseButton() {
        return waitUntilElementToBeClickable(CLOSE_BTN);
    }

    public WebElement getDeleteAllProducts() {
        return waitUntilElementToBeVisibleByXpath(DELETE_ALL_PRODUCTS);
    }

    public WebElement getRemoveFromCartVerificationCloseButton() {
        return waitUntilElementToBeVisibleByXpath(REMOVE_FROM_CART_VERIFICATION_CLOSE_BTN);
    }

    public WebElement getNoButtonInVerificationDelete() {
        return waitUntilElementToBeVisibleByXpath(NO_BUTTON_IN_VERIFICATION_DELETE);
    }

    public WebElement getMakePurchase() {
        return waitUntilElementToBeVisibleByXpath(MAKE_PURCHASE);
    }
}
