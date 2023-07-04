package pages;

import elements.ShopPageElements;
import org.openqa.selenium.WebDriver;

public class ShopPage extends ShopPageElements {
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    //mobile page
    public ShopPage clickBuyButton() {
        getBuyButton().click();
        return this;
    }

    public ShopPage clickSecondBuyButton() {
        getSecondBuyButton().click();
        return this;
    }

    public ShopPage moveToCardInfo() {
        moveCursor(getCardInfo());
        return this;
    }

    public ShopPage moveToSecondCardInfo() {
        moveCursor(getSecondCardInfo());
        return this;
    }

    public ShopPage clickContinuePurchasing() {
        getContinuePurchasing().click();
        return this;
    }

    public String getTextProductPrice() {
        return getProductPrice().getText().replace(" ", "").replace("₴", "");
    }

    public String getTextSecondProductPrice() {
        return getSecondProductPrice().getText().replace(" ", "").replace("₴", "");
    }

    public String getTextProductPriceInCart() {
        return getProductPriceInCart().getText().replace(" ", "").replace("₴", "");
    }

    public String getTextSecondProductPriceInCart() {
        return getSecondProductPriceInCart().getText().replace(" ", "").replace("₴", "");
    }

    public String getTextSummaryProductPrice() {
        return getSummaryProductPrice().getText().replace(" ", "").replace("₴", "");
    }
}
