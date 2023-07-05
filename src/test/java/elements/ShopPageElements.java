package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPageElements extends AbstractBasePage {
    public ShopPageElements(WebDriver driver) {
        super(driver);
    }

    //shop page
    private static final String PRODUCT_PRICE = "(//p[@class='card__price-actual card__price-actual--action']/span[@class='card__price-sum'])[1]";
    private static final String SECOND_PRODUCT_PRICE = "(//p[@class='card__price-actual card__price-actual--action']/span[@class='card__price-sum'])[2]";
    private static final String PRODUCT_PRICE_IN_CART = "(//p[@class='basket-product__price-main'])[1]";
    private static final String SECOND_PRODUCT_PRICE_IN_CART = "(//p[@class='basket-product__price-main'])[2]";
    private static final String SUMMARY_PRODUCT_PRICE = "//span[@class='basket-purchase__send-sum--new']";

    //shop page
    protected WebElement getProductPrice() {
        return waitUntilElementToBeVisibleByXpath(PRODUCT_PRICE);
    }

    protected WebElement getSecondProductPrice() {
        return waitUntilElementToBeVisibleByXpath(SECOND_PRODUCT_PRICE);
    }

    protected WebElement getProductPriceInCart() {
        return waitUntilElementToBeVisibleByXpath(PRODUCT_PRICE_IN_CART);
    }

    protected WebElement getSecondProductPriceInCart() {
        return waitUntilElementToBeVisibleByXpath(SECOND_PRODUCT_PRICE_IN_CART);
    }

    protected WebElement getSummaryProductPrice() {
        return waitUntilElementToBeVisibleByXpath(SUMMARY_PRODUCT_PRICE);
    }

    //mobile page
    private static final String BUY_BUTTON = "(//button[@class='add-product card__button btn btn--yellow  js-btn--buy '])[1]";
    private static final String SECOND_BUY_BUTTON = "(//button[@class='add-product card__button btn btn--yellow  js-btn--buy '])[2]";
    private static final String CARD_INFO = "(//div[@class='card__info'])[1]";
    private static final String SECOND_CARD_INFO = "(//div[@class='card__info'])[2]";
    private static final String CONTINUE_PURCHASING = "//button[@class='btn btn--3 btn--white']";

    //mobile page
    public WebElement getBuyButton() {
        return waitUntilElementToBeClickable(BUY_BUTTON);
    }

    public WebElement getSecondBuyButton() {
        return waitUntilElementToBeClickable(SECOND_BUY_BUTTON);
    }

    public WebElement getCardInfo() {
        return waitUntilElementToBeVisibleByXpath(CARD_INFO);
    }

    public WebElement getSecondCardInfo() {
        return waitUntilElementToBeVisibleByXpath(SECOND_CARD_INFO);
    }

    public WebElement getContinuePurchasing() {
        return waitUntilElementToBeVisibleByXpath(CONTINUE_PURCHASING);
    }
}
