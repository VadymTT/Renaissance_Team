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
    private static final String FIRST_IPHONE_ITEM_IN_LIST_COMPARE = "//a[@data-compare='003265676']";
    private static final String FIRST_SAMSUNG_ITEM_IN_LIST_COMPARE = "//a[@data-compare='003364310']";
    private static final String SECOND_ITEM_IN_LIST_COMPARE = "(//div[@class='card__add'])[2]/a[@data-tooltip='bottom']";
    private static final String COMPARE_ICON = "//span[@class='header__compare-link-icon']";

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

    public WebElement getFirstIphoneItemInListCompare() {
        return waitUntilElementToBeClickable(FIRST_IPHONE_ITEM_IN_LIST_COMPARE);
    }

    public WebElement getFirstSamsungItemInListCompare() {
        return waitUntilElementToBeClickable(FIRST_SAMSUNG_ITEM_IN_LIST_COMPARE);
    }

    public WebElement getSecondItemInListCompare() {
        return waitUntilElementToBeClickable(SECOND_ITEM_IN_LIST_COMPARE);
    }

    public WebElement getCompareIcon() {
        return waitUntilElementToBeClickable(COMPARE_ICON);
    }

    //compare page
    private static final String ADD_MORE_BUTTON = "(//a[@class='btn btn--compare btn--blue '])[1]";
    private static final String COMPARE_BUTTON = "(//a[@class='btn btn--compare btn--blue '])[1]";
    private static final String THOSE_THAT_DIFFER_BTN = "//span[@class='radio__text'][text()='Тільки ті, що розрізняються']";
    private static final String ADD_MODEL = "//a[@class='link link--inverted table-controls__link table-controls__link--add']";
    private static final String CLEAR_LIST = "//a[@class='link link--inverted table-controls__link table-controls__link--remove']";

    //compare page
    public WebElement getAddMoreButton() {
        return waitUntilElementToBeClickable(ADD_MORE_BUTTON);
    }

    public WebElement getCompareButton() {
        return waitUntilElementToBeClickable(COMPARE_BUTTON);
    }

    public WebElement getThoseThatDifferBtn() {
        return waitUntilElementToBeClickable(THOSE_THAT_DIFFER_BTN);
    }

    public WebElement getAddModel() {
        return waitUntilElementToBeClickable(ADD_MODEL);
    }

    public WebElement getClearList() {
        return waitUntilElementToBeClickable(CLEAR_LIST);
    }
}
