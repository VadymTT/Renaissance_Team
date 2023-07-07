package pages;

import elements.CartPageElements;
import org.openqa.selenium.WebDriver;

public class CartPage extends CartPageElements {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage clickDeleteButton() {
        getDeleteButton().click();
        return this;
    }

    public CartPage clickCloseButton() {
        getCloseButton().click();
        return this;
    }

    public CartPage clickDeleteAllProducts() {
        getDeleteAllProducts().click();
        return this;
    }

    public CartPage clickRemoveFromCartVerificationCloseButton() {
        getRemoveFromCartVerificationCloseButton().click();
        return this;
    }

    public CartPage clickNoButtonInVerificationDelete() {
        getNoButtonInVerificationDelete().click();
        return this;
    }

    public CartPage clickMakePurchase() {
        getMakePurchase().click();
        return this;
    }
}
