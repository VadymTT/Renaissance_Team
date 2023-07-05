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

    public ShopPage clickFirstIphoneItemInListCompare() {
        getFirstIphoneItemInListCompare().click();
        return this;
    }

    public ShopPage clickFirstSamsungItemInListCompare() {
        getFirstSamsungItemInListCompare().click();
        return this;
    }

    public ShopPage clickSecondItemInListCompare() {
        getSecondItemInListCompare().click();
        return this;
    }

    public ShopPage clickCompareIcon() {
        getCompareIcon().click();
        return this;
    }

    //compare page
    public ShopPage clickAddMoreButton() {
        getAddMoreButton().click();
        return this;
    }

    public ShopPage clickCompareButton() {
        getCompareButton().click();
        return this;
    }

    public ShopPage clickThoseThatDifferBtn() {
        getThoseThatDifferBtn().click();
        return this;
    }

    public ShopPage clickAddModel() {
        getAddModel().click();
        return this;
    }

    public ShopPage clickClearList() {
        getClearList().click();
        return this;
    }
}
