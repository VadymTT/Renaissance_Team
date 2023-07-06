package pages;

import elements.ShopElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.waitUrlContains;

public class ShopPage extends ShopElements {

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click first buy button.")
    public ShopPage clickBuyButton() {
        getBuyButton().click();
        return this;
    }

    @Step("Click second buy button.")
    public ShopPage clickSecondBuyButton() {
        getSecondBuyButton().click();
        return this;
    }

    @Step("Move to first card.")
    public ShopPage moveToCardInfo() {
        moveCursor(getCardInfo(), driver);
        return this;
    }

    @Step("Move to second card.")
    public ShopPage moveToSecondCardInfo() {
        moveCursor(getSecondCardInfo(), driver);
        return this;
    }

    @Step("Click continue purchasing.")
    public ShopPage clickContinuePurchasing() {
        getContinuePurchasing().click();
        return this;
    }

    @Step("Replace for first product price.")
    public String getTextProductPrice() {
        return getProductPrice().getText().replace(" ", "").replace("₴", "");
    }

    @Step("Replace for second product price.")
    public String getTextSecondProductPrice() {
        return getSecondProductPrice().getText().replace(" ", "").replace("₴", "");
    }

    @Step("Replace for first product price in cart.")
    public String getTextProductPriceInCart() {
        return getProductPriceInCart().getText().replace(" ", "").replace("₴", "");
    }

    @Step("Replace for second product price in cart.")
    public String getTextSecondProductPriceInCart() {
        return getSecondProductPriceInCart().getText().replace(" ", "").replace("₴", "");
    }

    @Step("Replace for sum product price.")
    public String getTextSummaryProductPrice() {
        return getSummaryProductPrice().getText().replace(" ", "").replace("₴", "");
    }

    @Step("Click first iphone in list.")
    public ShopPage clickFirstIphoneItemInListCompare() {
        getFirstIphoneItemInListCompare().click();
        return this;
    }

    @Step("Click second samsung in list.")
    public ShopPage clickFirstSamsungItemInListCompare() {
        getFirstSamsungItemInListCompare().click();
        return this;
    }

    @Step("Click second item in list.")
    public ShopPage clickSecondItemInListCompare() {
        getSecondItemInListCompare().click();
        return this;
    }

    @Step("Click compare icon.")
    public ShopPage clickCompareIcon() {
        getCompareIcon().click();
        return this;
    }

    @Step("Click on category {category}.")
    public ShopPage clickOnCategory(String category) {
        getCategoryByDataAlt(category).click();
        return this;
    }

    @Step("Click on product brand {brand}.")
    public ShopPage clickOnProductBrand(String brand, String brandUrl) {
        getProductBrand(brand).click();
        waitUrlContains(driver, brandUrl);
        return this;
    }

    @Step("Select minimum price on the sorting panel.")
    public ShopPage entryMinPrice(String price) {
        scrollForElement(getMinPriceInput(), driver);
        getMinPriceInput().clear();
        getMinPriceInput().sendKeys(price);
        waitUrlContains(driver, "/price-base-from-" + price);
        return this;
    }

    @Step("Select maximum price on the sorting panel.")
    public ShopPage entryMaxPrice(String price) {
        getMaxPriceInput().clear();
        getMaxPriceInput().sendKeys(price);
        waitUrlContains(driver, "to-" + price);
        return this;
    }

    @Step("Open spin speed drop-down menu.")
    public ShopPage openSpinSpeedMenu() {
        getSpinSpeedDropDown().click();
        sleep(1000);
        return this;
    }

    @Step("Choose spin speed parameter {speed}")
    public ShopPage selectSpinSpeed(String speed) {
        scrollForElement(getSpinSpeedSelect(speed), driver);
        getSpinSpeedSelect(speed).click();
        sleep(1200);
        return this;
    }

    @Step("Click on the first product in the displayed list.")
    public ShopPage clickOnFirstProductCard() {
        getFirstProductCardName().click();
        sleep(1200);
        return this;
    }
}
