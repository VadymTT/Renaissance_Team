package pages;

import elements.CartPageElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CartPage extends CartPageElements {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click delete button.")
    public CartPage clickDeleteButton() {
        getDeleteButton().click();
        return this;
    }

    @Step("Click close button.")
    public CartPage clickCloseButton() {
        getCloseButton().click();
        return this;
    }

    @Step("Click delete all products.")
    public CartPage clickDeleteAllProducts() {
        getDeleteAllProducts().click();
        return this;
    }

    @Step("Click remove from cart verification close button.")
    public CartPage clickRemoveFromCartVerificationCloseButton() {
        getRemoveFromCartVerificationCloseButton().click();
        return this;
    }

    @Step("Click no button in verification delete.")
    public CartPage clickNoButtonInVerificationDelete() {
        getNoButtonInVerificationDelete().click();
        return this;
    }

    @Step("Click make purchase.")
    public CartPage clickMakePurchase() {
        getMakePurchase().click();
        return this;
    }
}
